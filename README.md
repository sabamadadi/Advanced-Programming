## Ex 1
Write a program that takes two positive integers, a and b, from the user.

If the length of the inner square is greater than or equal to the length of the outer square, print "Wrong order!". If the difference between the given numbers is odd, print "Wrong difference!".

Otherwise, draw the corresponding hollow square.

By "corresponding hollow square", we mean a square with side length a that has a square with side length b removed from its center.

### Input:
The input consists of two integers a and b on the first and second lines, respectively.

1 <= a, b <= 20

### Output:
Print the output of the problem according to the specifications.

- Note that there is a space between the asterisks in the output.

## Ex 2
### Input:
The input consists of an integer `n` on the first line, which represents the number of buttons that user has pressed.

Then, in the next `n` lines, each line contains a button that user has pressed. This button is either a lowercase English letter or the CapsLock button, which is represented as "CAPS" in the input.

It is guaranteed that at least one button has been pressed.

3 <= n <= 100

### Output:
Print the text that user has entered in a single line.

## Ex 3
A user has written a program that prints numbers from 1 to 5000 on separate lines. However, since the newline character (\n) is causing problems on their laptop, when they ran the program, they saw that all the numbers from 1 to `n` were printed in a single line, resulting in a very large number (i.e., the output was something like ...12345678910111213).

Now, in order to fix the problem, they need to answer the following question:

What is the `k`th digit from the left in this very large number?

Help them find the answer.

### Input:
The input consists of an integer `k` on the first line.

1 <= k <= 4000

### Output:
Print the `k`th digit from the left of the very large number in the output.

## Ex 4
Each field is a sequence of `n` steps, each with a specific height denoted by `a_i`. A field has a peak or a valley if `i` exists. For `i` to be a peak or a valley, one of the following two conditions is sufficient:

- `a_1 <= a_2 <= ... <= a_i > ... > a_n`
- `a_1 >= a_2 >= ... >= a_i < ... < a_n`

Note that `i` can be equal to `n`.

### Input:
The input consists of an integer `n` on the first line and `n` integers `a_1, ..., a_n` on the second line.

1 <= n <= 20
-200 <= a_i <= 200

### Output:
Print "Yes" or "No" in a single line, depending on whether or not the field can be a peak or a valley.

## Ex 5
Write a program that first receives an integer `m` and then an integer `n` from the user, followed by the coefficients of a polynomial `P(x)` of degree `m` from the user, and prints the coefficients of the polynomial `(P(x))^n` in the output.

To do this, you need to define a function that calculates the coefficients in such a way that its output is a pointer to the resulting coefficients array.

### Input:
The input consists of two integers `n` and `m` on the first line. On the second line, `m+1` coefficients of the polynomial `p` are given in order (all coefficients are less than 20).

1 <= n, m <= 20

### Output:
Print the coefficients of the resulting polynomial `(P(x))^n` in the output.

## Ex 6
Write a program that takes an integer `n` from the user, followed by `n` strings from the input. The output of the program will be the largest string `s` that has either `s` or its reverse as a substring. If there is no common substring, nothing should be printed.

Definition of substring: A sequence of characters "consecutively" occurring in a string, starting and ending wherever it can in the original string. For example, the substrings of "ABC" are: A, B, C, AB, BC, ABC.

### Input:
The input consists of an integer `n` on the first line, followed by `n` strings on the subsequent lines.

1 <= n <= 20
The length of each string is at most 20.

### Output:
The substring that is printed in the output should be in the same order as the first occurrence of that substring in the input string. For example, in the given example, the output should be "CDEF" and not "FEDC".

## Ex 7
We can create an API for users to link their queries to a desired website. The API should have the following features:

- There is a time limit of 5 seconds for each user, meaning the user must wait at least 5 seconds after using the service before using it again.
- The URL provided should start with http:// or https://.
- The custom key selected should be between 2 and 12 characters long and only composed of alphanumeric characters. The custom key should be unique.
- If all conditions are met, the custom key is added to the database and redirected to the given website. The database is empty before the first query, and successful custom key queries are added one by one to the database.
- A list of queries made through the API is given to you in chronological order. Determine whether each query was successful or not. Each query will include the following:
- - Time: the period in which the query was made.
- - Address: the main website address.
- - Key: the custom key.
- - User ID: an integer that identifies the specific user who made the query.
- Note: To solve this problem, we need to use a Hash Table and Hash Set. These two objects work in Java in a way that by storing a key, we can access the value or data stored with it, or ensure the presence of the desired key. For example, consider the code below:
```
import java.util.*;

public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("apple", 1);
    map.put("banana", 2);
    map.put("cherry", 3);
    System.out.println(map.get("banana")); // Output: 2
    System.out.println(map.containsKey("cherry")); // Output: true
    System.out.println(map.containsKey("durian")); // Output: false
  }
}
```
The output of the code above is as follows:
```
09120000
true
true
true
```
For more information, you can check out this link: [ ↗](https://www.geeksforgeeks.org/hashtable-in-java/)

### Input:
The first line contains n, which is the number of queries. The next n lines contain the time (t), URL, key, and user ID (userid) values in order, separated by a space.

Constraints:
1 ≤ n ≤ 25
1 ≤ t ≤ 20
1 ≤ URL.length ≤ 30
1 ≤ key.length ≤ 12
1 ≤ userid.length ≤ 20

### Output:
For each query, display whether it was successful or not. If successful, display YES, otherwise display NO.

#### Example:
##### Input:
```
4
0 https://www.google.com ↗ gg1 25
4 https://www.youtube.com ↗ yt 25
4 https://tweeter.com ↗ he 50
5 https://www.facebook.com ↗ FB 25
```

##### Output:
```
YES
NO
YES
YES
```

Explanation:
In the beginning, user 25 makes a request. The entered URL is correct and the query is successfully created. In the second query, user 25 requests again, but since 4 seconds have passed since their previous request, they cannot have a new request to link to the desired site. The third request is created correctly. In the last request, due to the required time passing, user 25 can make a new request and their request is successfully created.

## Ex 8
You are given two strings as input. Your task is to determine whether these two strings are Peter's favorite strings or not.

Peter's favorite strings are strings that have the same characters that occur the same number of times in both strings. However, the order may be different. For example, "alireza" and "raelzai" are two examples of Peter's favorite strings.

To implement this algorithm, it is recommended to take a look at the concept of HashMap in Java.

### Input:
The first line contains the first string, and the second line contains the second string.

### Output:
If the two input strings are Peter's favorite strings, print "true", otherwise print "false".

## Ex 9
A regular expression or regex is a pattern that allows you to see if a text or string matches a pattern that you want. For example, to make sure that a string matches an email pattern, you can check that it starts with letters and numbers and does not use unauthorized characters, has an @ symbol, and so on. To do this, you need to be familiar with regular expression language commands. You can see all of them by going to the link below, and you do not need to memorize all of these commands. Whenever you need it, you can use this pdf: [↗](https://cheatography.com/davechild/cheat-sheets/regular-expressions/pdf)

Now let's demonstrate regex with some examples. These examples help you become familiar with the syntax of regular expressions. Well, take a look at this expression:

```
/^\w+$/
```

The caret (^) and dollar sign ($) indicate the beginning and end of the string. The backslash w says: find any word and the plus sign says that the number of characters in this word can be one or more. Therefore, if we have the text abcde1234 cdefg23456, both words will be found with this pattern.

Now before we see the next expressions, we want to introduce you to a tool that will help you learn. Please visit: [↗](http://www.regexr.com/)

This amazing online tool makes learning easier for you. Test your regex online and find its problems.

And here's a tutorial link to better understand regex: [↗](https://www.youtube.com/watch?v=sa-TUpSx1JA)

Now let's try some more examples. First, copy and paste this text into the online tool mentioned and try the patterns below:

```
RegExr was not created by reg@gskinner.com, and is proudly100 hosted by Media Temple.

Edit the Expre3.ssion & Text to see mail@sbu matches. Roll ove93r matches or the 41.56 expression 3 for details. PCRE & JavaScript flavors of RegEx are supported. Validate 134 your 2 e1.xpression with Tes4.6ts mode.
```
- 1. Pattern to find decimal numbers in a text:

```
\d+\.\d*
    or
[0-9]+\.[0-9]*
```

In this pattern, d\ is similar to [0-9], meaning one digit (including digits 0 to 9). + means one or more occurrences of the pattern, so the expression +d\ means one or more digits in a row. .\ means exactly a dot. The reason for using \ before the dot is that dot alone means "any character except for a newline character". So \ is added to indicate that we mean the character dot itself. The asterisk or * is exactly the same as +, but it matches zero or more instances of the pattern instead of one or more.

- 2. Pattern to find numbers from 1 to 100:

```
100|\d\d|\d
    or
100|\d{2}|\d
```

The point of this pattern is to use the or (|) operator. In other words, we have separated the pattern into three distinct cases, and if any of them is matched, the pattern will match. Try to see how the following pattern differs from the above pattern.

```
\s100\s|\s\d\d\s|\s\d\s
```

- 3. Now let's use the same email example. A sample pattern for an email could be like this:

```
^[^@\s]+@[^@\s]+\.\w{2,6}$
```

There is no perfect regex for matching email addresses. If you need to use a regex for an email, it is recommended to read this link.

Now for implementing regex in Java, you can do it in two ways.
- 1. Use the following code:

```
String pattern = "^[^@\\s]+@[^@\\s]+\\.\\w{2,6}$";
String email = "hello@world.com";
System.out.println(email.matches(pattern));
```

- 2. Use the following code:

```
Scanner jin = new Scanner(System.in);  
String line = jin.nextLine();  
Pattern emailPattern = Pattern.compile("(\\d+\\.\\d*)");  
Matcher matcher = emailPattern.matcher(line);  
while (matcher.find()) {  
    System.out.println(matcher.group());  
}
```

The second code finds all matched substrings in the text. Note that if you use ^ and $, the entire string must match your pattern, otherwise no substring will match.

### Input:
The first line contains a word at the beginning.
The second line contains another word.

### Output:
If the word exists in the second word and is true, print YES, otherwise print NO.

## Ex 10
### Validation Rules
#### Email Validation
A valid email address is in the format of username@domain.tld, where:

- The username can only contain English letters, numbers, underscore, and dot.
- The domain can only contain English letters or numbers.
- The TLD is a three-letter English word.
- English letters can be uppercase or lowercase.

#### Mobile Number Validation
A mobile number is considered valid if it meets one of the following conditions:

- It contains 11 digits and starts with 09.
- It contains 13 digits and starts with +989.
- It contains 14 digits and starts with 00989.

##### Input:
The input consists of two separate lines containing an email and a phone number, respectively.

#### Output:
The program output should consist of two lines. The first line should display the result of the email validation, and the second line should display the result of the phone number validation. If the validation result is correct, display True, otherwise display False.

## Ex 11
Write a program that receives an array of k sorted ArrayLists in ascending order. Then, merge all ArrayLists and convert them into a sorted array.

Note: The problem can be solved using Regex.

0 ≤ k ≤ 10^4

0 ≤ |ArrayList[i]| ≤ 500

-10^4 ≤ ArrayList[i][j] ≤ 10^4

### Input
The input consists of two lines. The first line contains an integer k, the number of sorted ArrayLists. The second line contains k sorted ArrayLists, separated by semicolons (;) and enclosed in square brackets ([]). Each ArrayList is a comma-separated list of integers, enclosed in square brackets ([]).

### Output
The program output should be a sorted array of all the elements in the input ArrayLists, separated by commas (,).

## Ex 12
Each war map is an m x n matrix containing X and O. If some of the O positions are surrounded by ally forces from the north, south, west, and east sides, that position will be captured by the X. Help to write a program to do this on war maps.

Note: Since the matrix information is given as a single string array, the problem can be solved using Regex.

1 ≤ m, n ≤ 200

### Input
The input consists of a single line containing a string of length m x n, representing the war map matrix. The matrix is given as a single string array, where each row of the matrix is concatenated with no spaces.

### Output
The program output should be a string of length m x n, representing the updated war map matrix after capturing the O positions. The matrix should be given as a single string array, where each row of the matrix is concatenated with no spaces.

#### Example

<p align="center">
  <img src="Image1.jpg" alt="image-description">
</p>

##### Input:

```
[["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
```

##### Output:
```
[["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
```
## Ex 13
Write a program that prints a matrix with the maximum height of a house.

Each area is an m x n matrix that includes dry and wet areas (matrix information is given as a string array). The information for this map is as follows:

- If a cell value is equal to 1, that cell is water.
- If a cell value is equal to 0, that cell is dry.

Reconstruction also follows the rules:

- The height of each cell is non-negative.
- The height of water cells is 0.
- The difference between neighboring cells (a cell is considered neighboring to another cell if it is to the north, south, east, or west of that cell) is at most 1. Find the height matrix such that the highest point has the maximum height.

Note: You can use Regex to solve this problem.

1 ≤ m, n ≤ 1000

### Input
The input consists of a single line containing a string of length m x n, representing the area matrix. The matrix is given as a single string array, where each row of the matrix is concatenated with no spaces.

### Output
The program output should be a string of length m x n, representing the height matrix. The matrix should be given as a single string array, where each row of the matrix is concatenated with no spaces.

#### Example

<p align="center">
  <img src="Image2.png" alt="image-description">
</p>

##### Input:

```
[[0,1],[0,0]]
```

##### Output:

```
[[1,0],[2,1]]
```

## Ex 14
Mabin selects an equation in the form of A + B = C, where all three numbers are non-negative. She writes the equation on paper and gives it to Reza.

Then, Mabin selects a digit x from A, B, and C and replaces x consecutive digits of that number with #, without Reza noticing.

For example, Mabin can convert the equation 32 + 24 = 56 to #2 + 24 = 56 or 32 + 24 = #, and so on.

Now it's Reza's turn to guess the original equation. Since Mabin is a bit ignorant :))) she may have written the equation wrong from the beginning, and if so, Reza should say that the equation was wrong from the beginning.

But as usual, Reza doesn't know how to write the code!!

### Input
In the input, we give you the equation modified by Mabin, and you have to help Reza understand what digits # should be replaced with, or tell him that the equation was wrong from the beginning.

### Output
In the output, if we can replace the # with a non-negative number, replace the appropriate number instead of the number containing # in the original equation and return the equation. Otherwise, return '-1'.
