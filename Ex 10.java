
import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String mail = sc.next();
        String phone = sc.next();

        Pattern id = Pattern.compile("^\\w+([.-]?\\w+)*@[a-zA-Z\\d]*\\.[a-zA-Z]{3}$");
        Matcher match = id.matcher(mail);
        if(match.find())
            System.out.println("True");

        else
            System.out.println("False");

        Pattern number = Pattern.compile("^(0|0098|\\+98)9(0[1-5]|[1 3]\\d|2[0-2]|98)\\d{7}$");
        Matcher match2 = number.matcher(phone);
        if(match2.find())
            System.out.println("True");
        else
            System.out.println("False");

    }
}


