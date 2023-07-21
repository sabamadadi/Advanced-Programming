
import java.lang.String;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    static boolean CHECKURL(String URL) {
        String htp = "http://";
        String htps = "https://";
        int len1 = URL.length();
        int len2 = htp.length();
        if (len1 >= len2) {
            boolean flag = true;
            for (int i = 0; i < len2; i++) {
                if (URL.charAt(i) != htp.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        int len3 = htps.length();
        if (len1 >= len3) {
            boolean flag = true;

            for (int i = 0; i < len3; i++) {
                if (URL.charAt(i) != htps.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    static boolean CHECKKEY(String KEY) {
        int sz = KEY.length();
        if (sz > 12 || sz < 2) {
            return false;
        }
        for (int i = 0; i < sz; i++) {
            if (!(('0' <= KEY.charAt(i) && KEY.charAt(i) <= '9') || ('A' <= KEY.charAt(i) && KEY.charAt(i) <= 'Z') || ('a' <= KEY.charAt(i) && KEY.charAt(i) <= 'z')))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        HashMap<String, Integer> Time = new HashMap<String, Integer>();
        HashMap<String, Boolean> key = new HashMap<String, Boolean>();
        for (int i = 0; i < n; i++) {

            int t = cs.nextInt();
            String string;
            String URL = cs.next();
            String KEY = cs.next();
            String ID = cs.next();


            if (!CHECKURL(URL) || !CHECKKEY(KEY)) {
                System.out.print("NO");
                if (i + 1 < n)
                    System.out.print('\n');
                continue;
            }
            if (key.containsKey(KEY)) {
                System.out.print("NO");
                if (i + 1 < n)
                    System.out.print('\n');
                continue;
            }
            if (Time.containsKey(ID) && Time.get(ID) + 4.6 > t) {
                System.out.print("NO");
                if (i + 1 < n)
                    System.out.print('\n');
                continue;
            }
            System.out.print("YES");
            if (i + 1 < n)
                System.out.print('\n');
            key.put(KEY,true);
            Time.put(ID, t);

        }
    }
}