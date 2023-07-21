import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        boolean caps = false;

        int n = scn.nextInt();
        scn.nextLine();

        String[] arr = new String[n];

        for(int i = 0; i < n;i++)
        {
            String tmp = scn.nextLine();
            arr[i] = tmp;
        }


        String Result = "";
        for(int i = 0; i < n ; i++)
        {
            if(arr[i].equals("CAPS"))
            {
                caps = !caps;
                continue;
            }
            if(caps)
            {
                Result += arr[i].toUpperCase();
            }
            else
            {
                Result += arr[i].toLowerCase();
            }
        }

        System.out.println(Result);
    }
}






