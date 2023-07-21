
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;


class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        Pattern pt = Pattern.compile("([0-9]*#[0-9]*)|([0-9]+)");
        Matcher matcher = pt.matcher(n);
        ArrayList<String> array = new ArrayList<String>();
        while (matcher.find())
        {
            array.add(matcher.group());
        }
        int htg = htgf(array);

        Pattern pt1 = Pattern.compile(makePattern(array.get(htg)));
        Matcher mt1 = pt1.matcher(String.valueOf(htgv(array, htg)));
        boolean check;
        if (mt1.find())
        {
            array.set(htg, String.valueOf(htgv(array, htg)));
            System.out.println(array.get(0) + " + " + array.get(1) + " = " + array.get(2));
        }
        else
        {
            System.out.println(-1);
        }
    }

    static int htgf (ArrayList<String> array)
    {
        int id = 0;
        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i).contains("#"))
            {
                id = i;
            }
        }
        return id;
    }
    static int htgv (ArrayList<String> array, int hid)
    {
        int v = 0;
        if (hid == 0)
        {
            v = Integer.parseInt(array.get(2)) - Integer.parseInt(array.get(1));
        }
        else if (hid == 1)
        {
            v = Integer.parseInt(array.get(2)) - Integer.parseInt(array.get(0));
        }
        else
        {
            v = Integer.parseInt(array.get(0)) + Integer.parseInt(array.get(1));
        }
        return v;
    }
    static String makePattern (String hv)
    {
        String pt = "";
        for (int i = 0; i < hv.length(); i++)
        {
            if (hv.charAt(i) != '#')
            {
                pt += hv.charAt(i);
            }
            else
            {
                pt += "[0-9]+";
            }
        }
        return pt;
    }
}