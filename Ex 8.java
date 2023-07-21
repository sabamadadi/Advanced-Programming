import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;


public class Main3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String w1 = input.nextLine();
        String w2 = input.nextLine();

        char arr1[] = w1.toCharArray();
        Arrays.sort(arr1);
        char arr2[] = w2.toCharArray();
        Arrays.sort(arr2);

        String frst = new String(arr1);
        String sec = new String(arr2);

        HashMap< String,Integer> map = new HashMap< String, Integer>();

        map.put(frst, 1);
        map.put(sec,2);


        if (map.size() == 1) System.out.print("true");
        else System.out.print("false");

    }
}