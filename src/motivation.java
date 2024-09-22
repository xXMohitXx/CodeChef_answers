import java.util.*;
import java.lang.*;
import java.io.*;

class motivation
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int q=0;
            while(N-->0){
                int S = sc.nextInt();
                int R = sc.nextInt();
                if(S<=X&&q<R){
                    q=R;
                }
            }
            System.out.println(q);
        }

    }
}
/**
 Chef has been searching for a good motivational movie that he can watch during his exam time. His hard disk has
 X
 X GB of space remaining. His friend has
 N
 N movies represented with
 (
 S
 i
 ,
 R
 i
 )
 (S
 i
 ​
 ,R
 i
 ​
 ) representing (space required, IMDB rating). Help Chef choose the single best movie (highest IMDB rating) that can fit in his hard disk.

 Input
 The first line of the input contains a single integer
 T
 T denoting the number of test cases. The description of
 T
 T test cases follows.
 The first line of each test case contains two space-separated integers
 N
 N and
 X
 X.
 N
 N lines follow. For each valid
 i
 i, the
 i
 i-th of these lines contains two space-separated integers
 S
 i
 S
 i
 ​
 and
 R
 i
 R
 i
 ​
 .
 Output
 For each test case, print a single line containing one integer - the highest rating of an IMDB movie which Chef can store in his hard disk.
 */
