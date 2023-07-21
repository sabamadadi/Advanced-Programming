

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        ArrayList<ArrayList<String>> first = parseInputString(n);
        ArrayList<ArrayList<String>> sec = pt(first);
        boolean temp = true;
        System.out.print('[');
        for (ArrayList<String> string : sec) {
            boolean mark = true;
            if (!temp) {
                System.out.print(',');
            }
            else {
                temp = !temp;
            }
            System.out.print('[');
            for (String sample : string) {
                if (mark) {
                    System.out.print(sample);
                    mark = false;
                } else {
                    System.out.print(',');
                    System.out.print(sample);
                }
            }
            System.out.print(']');
        }
        System.out.print(']');
    }

    public static ArrayList<ArrayList<String>> pt(ArrayList<ArrayList<String>> table) {
        int radif = table.size();
        int soton = table.get(0).size();
        boolean[][] visited = new boolean[radif][soton];
        for (int i = 0; i < radif; i++) {
            for (int j = 0; j < soton; j++) {
                if (table.get(i).get(j).equals("\"X\"")) {
                    visited[i][j] = true;
                }
            }
        }
        for (int i = 0; i < radif; i++) {
            for (int j = 0; j < soton; j++) {
                if (i == 0 || j == 0 || i == radif - 1 || j == soton - 1) {
                    dfs(table, visited, i, j);
                }
            }
        }

        for (int i = 1; i < radif - 1; i++) {
            for (int j = 1; j < soton - 1; j++) {
                if (!visited[i][j]) {
                    table.get(i).set(j, "\"X\"");
                }
            }
        }
        return table;
    }

    public static void dfs(ArrayList<ArrayList<String>> table, boolean[][] visited, int i, int j) {
        int Rd = table.size();
        int St = table.get(0).size();
        if (i < 0 || i >= Rd || j < 0 || j >= St || visited[i][j] || table.get(i).get(j).equals("X")) {
            return;
        }

        visited[i][j] = true;
        dfs(table, visited, i - 1, j);
        dfs(table, visited, i + 1, j);
        dfs(table, visited, i, j - 1);
        dfs(table, visited, i, j + 1);
    }

    public static ArrayList<ArrayList<String>> parseInputString(String n) {
        ArrayList<ArrayList<String>> table = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(n.substring(1));
        while (matcher.find()) {
            String num = matcher.group(1);
            String[] element = num.split(",");
            ArrayList<String> R = new ArrayList<>(Arrays.asList(element));
            table.add(R);
        }
        return table;
    }
}