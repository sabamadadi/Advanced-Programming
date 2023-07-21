
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;
import java.lang.String;

public class MyClass {
	
	public static void main(String[] args) {
		Scanner jin = new Scanner(System.in);
		String pattern = jin.nextLine();
		String total = jin.nextLine();
		
		String regexpattern = "(.*?)";
		for(int i = 0; i < pattern.length(); i++) {
			regexpattern += pattern.charAt(i);
			regexpattern += "(.*?)";
		}
		
		Pattern regexPattern = Pattern.compile(regexpattern);
		
		
		Matcher matcher = regexPattern.matcher(total);
		List<String> allMatches = new ArrayList<String>();
		while (matcher.find()) {
			allMatches.add(matcher.group());
		}

		if(allMatches.size() > 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
