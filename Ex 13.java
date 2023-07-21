
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedList;
import java.util.Queue;


import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String vu = sc.nextLine();

        Pattern pt = Pattern.compile("[^\\[ ]*\\[");
        Matcher mch = pt.matcher(vu);
        int radif = -1;
        while (mch.find()) {
            radif ++;
        }

        vu = vu.replaceAll("\\[" , "");
        vu = vu.replaceAll("," , "");
        vu = vu.replaceAll("\\]" , "");

        int soton = vu.length() / radif;
        char[] tmp = vu.toCharArray();
        int[][] tb = new int[radif][soton];

        int k=0;
        for (int i=0 ; i<radif ; i++){
            for(int j=0 ; j<soton ; j++){
                tb[i][j] = parseInt(String.valueOf(tmp[k]));
                k++;
            }
        }
        int [][] h = new int[radif][soton];
        h = bfs(tb ,radif ,soton);

        String khuruji = "[";
        for (int i = 0; i < radif; i++) {
            khuruji += "[";
            for (int j = 0; j < soton; j++) {
                khuruji +=  h[i][j];
                if(j<soton-1)
                    khuruji += ",";
            }
            khuruji += "]";
            if(i<radif-1)
                khuruji += ",";
        }
        khuruji += "]";
        System.out.print(khuruji);

    }


    static int[][] bfs(int[][] cur , int radif , int soton){


        Queue<int[]> BFS = new LinkedList<>();
        int[][] H = new int[radif][soton];

        for(int i = 0; i< radif; i++){
            for(int j = 0; j< soton; j++){
                if(cur[i][j] == 1){
                    H[i][j] = 0;
                    BFS.add(new int[]{i, j});
                }
                else{
                    H[i][j] = -1;
                }
            }
        }

        int[] dir = {0, 1, 0, -1, 0};

        while(!BFS.isEmpty()){

            int[] t = BFS.poll();
            int r = t[0], s = t[1];

            for(int i=0 ; i<4 ; i++){
                int nr = r + dir[i];
                int ns = s + dir[i+1];
                if(nr < 0 || nr == radif || ns < 0 || ns == soton || H[nr][ns] != -1) {
                    continue;
                }
                H[nr][ns] = H[r][s] + 1;
                BFS.add(new int[]{nr, ns});
            }
        }
        return H;
    }
}