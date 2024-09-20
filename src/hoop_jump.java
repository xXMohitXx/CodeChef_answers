import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            System.out.println((N + 1 ) / 2);
        }

    }
}
/**
 You and your friend are playing a game with hoops. There are N hoops (where N is odd) in a row. You jump into hoop1,
 and your friend jumps into hoop N. Then you jump into hoop 2, and after that, your friend jumps into hoop N−1, and so on.

 The process ends when someone cannot make the next jump because the hoop is occupied by the other person. Find the last hoop that will be jumped into.

 Input
 The first line contains an integer T, the number of test cases. Then the test cases follow.
 Each test case contains a single line of input, a single integer N.
 Input

 2
 1
 3

 Output
 1
 2

 Test Case 1:
 Since there is only 1 hoop, that's the only one to be jumped into.

 Test Case 2:
 The first player jumps into hoop 1. The second player jumps into hoop 3 and finally the first player jumps into hoop 2.
 Then the second player cannot make another jump, so the process stops.

 */