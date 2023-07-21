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
For more information, you can check out this [link ↗](https://www.geeksforgeeks.org/hashtable-in-java/).

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
