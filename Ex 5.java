
import java.util.Scanner;
import java.lang.String;

public class Main {
    final int N = 22, M = 22;
    public static int[] Calculate (int n, int m, int[] a) {
        final int N = 22, M = 22;
        int[][] A = new int[N*M][N];
        for(int i = 0; i < N * M; i++){
            for(int j = 0; j < N; j++){
                A[i][j] = 0;
            }
        }
        A[0][0] = 1;
        for(int j = 1; j <= n; j++){
            for(int i = 0; i <= n * m; i++){
                for(int k = 0; k <= i; k++){
                    A[i][j] += A[k][j-1] * a[i - k];
                }
            }
        }
        int[] ans = new int[N*M];
        for(int i = 0; i <= n * m; i++){
            ans[i] = A[i][n];
        }

        return ans;
    }

    public static void main(String[] args) {
        final int N = 22, M = 22;
        Scanner cs = new Scanner(System.in);
        int m = cs.nextInt();
        int n = cs.nextInt();
        int[] a = new int[N*M];
        for(int i = 0; i <= m; i++){
            a[i]=cs.nextInt();
        }
        for(int i = m + 1; i <= n * m; i++){
            a[i] = 0;
        }
        int[] ans = Calculate(n, m, a);

        for(int i = 0; i <= n * m; i++){
            System.out.print( ans[i]);
            if(i + 1 <= n * m){
                System.out.print(' ');
            }
        }
    }
}
