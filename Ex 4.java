
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int  N = 200;
        int[] a = new int [N];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            a[i]=sc.nextInt(); ;
        }
        boolean ans = false;
        for(int i = 0; i < n; i++){
            //DARE
            boolean curans = true;
            for(int j = 0; j < i; j++){
                if(a[j] < a[j + 1]){
                    curans = false;
                    break;
                }
            }
            for(int j = i; j < n - 1; j++){
                if(a[j] >= a[j + 1]){
                    curans = false;
                    break;
                }
            }
            ans |= curans;
            //TAPE
            curans = true;
            for(int j = 0; j < i; j++){
                if(a[j] > a[j + 1]){
                    curans = false;
                    break;
                }
            }
            for(int j = i; j < n - 1; j++){
                if(a[j] <= a[j + 1]){
                    curans = false;
                    break;
                }
            }
            ans |= curans;
        }

        if(ans){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }

    }
}





