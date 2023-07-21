
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;
import java.lang.String;

public class MyClass {
	
	public static void main(String[] args) {
		Scanner jin = new Scanner(System.in);
		String array = jin.nextLine();
		
		String regexpattern = "(-\\d{1,5})|\\d{1,5}";
		
		Pattern regexPattern = Pattern.compile(regexpattern);
		
		
		Matcher matcher = regexPattern.matcher(array);
		List<String> allMatches = new ArrayList<String>();
		while (matcher.find()) {
			allMatches.add(matcher.group());
		}

		int intArray[] = new int[20000];
		for(int i = 0; i < 20000; i++) {
			intArray[i] = 0;
		}
		
		for(int i = 0; i < allMatches.size(); i++) {
			int current = Integer.parseInt(allMatches.get(i)) + 10000;
			intArray[current] ++;
		}
		
		boolean flag = false;
		System.out.print("[");
		for(int i = 0; i < 20000; i++) {
			if(0 != intArray[i]) {
				if(flag){
					System.out.print(",");
				}
				else {
					flag = true;
				}
			}
			for(int j = 0; j < intArray[i]; j++) {
				System.out.print(i - 10000);
				if(j + 1 != intArray[i]) {
					System.out.print(",");
				}
			}
		}
		System.out.print("]");
	}
}
