
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k <= 9) {
            System.out.print(k);
            ;
        } else if (k <= 9 + 90 * 2) {
            k -= 9;
            int num = (k / 2) + 10;
            int cnt = k % 2;
            if (cnt == 0) {
                cnt += 2;
                num--;
            }
            cnt = 2 - cnt;
            for (int i = 0; i < cnt; i++) {
                num /= 10;
            }
            System.out.print(num % 10);
        } else if (k <= 9 + 90 * 2 + 900 * 3) {
            k -= 90 * 2 + 9;
            int num = (k / 3) + 100;
            int cnt = k % 3;
            if (cnt == 0) {
                cnt += 3;
                num--;
            }
            cnt = 3 - cnt;
            for (int i = 0; i < cnt; i++) {
                num /= 10;
            }
            System.out.print(num % 10);
        } else {
            k -= 900 * 3 + 90 * 2 + 9;
            int num = (k / 4) + 1000;
            int cnt = k % 4;
            if (cnt == 0) {
                cnt += 4;
                num--;
            }
            cnt = 4 - cnt;
            for (int i = 0; i < cnt; i++) {
                num /= 10;
            }
            System.out.print(num % 10);
        }
    }
}





