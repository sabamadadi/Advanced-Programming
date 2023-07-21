
import java.util.Scanner;

public class Main {
    final int N = 30;
    static boolean checker(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if(len2 > len1){
            return false;
        }
        for(int i = 0; i + len2 <= len1; i++){
            boolean flag = true;
            for(int j = 0; j < len2; j++){
                if(a.charAt(i+j) != b.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        final int max_num = 30;
        String[] inputs = new String [max_num];
        for(int i = 0; i < number; i++){
            inputs[i]= input.nextLine();
        }
        String ans = "";
        int len3 = inputs[0].length();

        for(int st = 0; st < len3; st ++){
            String cur = "", rev = "";
            for(int fn = st; fn < len3; fn ++){
                char a = inputs[0].charAt(fn);
                cur = cur + a;
                rev = a + rev;
                boolean flag = true;
                for(int i = 1; i < number; i++){
                    if((!checker(inputs[i], cur)) && (!checker(inputs[i], rev))){
                        flag = false;
                        break;
                    }
                }
                int len4 = ans.length();
                if(flag && fn - st + 1 > len4){
                    ans = cur;
                }
            }

        }


        System.out.print(ans);

    }

}






