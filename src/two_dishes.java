import java.util.*;
import java.lang.*;
import java.io.*;

class two_dishes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int max_taste = sc.nextInt();
            int sum = sc.nextInt();
            if(sum<=max_taste)
            {
                System.out.println(sum);
            }
            else
            {
                int x=sum-max_taste;
                System.out.println(max_taste-x);
            }
        }
    }
}
/**
 Chef prepared two dishes yesterday. Chef had assigned the
 tastiness
 tastiness
 T
 1
 T
 1
 ​
 and
 T
 2
 T
 2
 ​
 to the first and to the second dish respectively. The tastiness of the dishes can be any
 integer
 integer between
 0
 0 and
 N
 N (both inclusive).

 Unfortunately, Chef has forgotten the values of
 T
 1
 T
 1
 ​
 and
 T
 2
 T
 2
 ​
 that he had assigned to the dishes. However, he remembers the sum of the tastiness of both the dishes - denoted by
 S
 S.

 Chef wonders, what can be the maximum possible absolute difference between the tastiness of the two dishes. Can you help the Chef in finding the maximum absolute difference?

 It is guaranteed that at least one pair
 {
 T
 1
 ,
 T
 2
 }
 {T
 1
 ​
 ,T
 2
 ​
 } exist such that
 T
 1
 +
 T
 2
 =
 S
 ,
 0
 ≤
 T
 1
 ,
 T
 2
 ≤
 N
 T
 1
 ​
 +T
 2
 ​
 =S,0≤T
 1
 ​
 ,T
 2
 ​
 ≤N.

 Input Format
 The first line of input contains a single integer
 T
 T, denoting the number of testcases. The description of the
 T
 T testcases follows.
 The first and only line of each test case contains two space-separated integers
 N
 N,
 S
 S, denoting the maximum tastiness and the sum of tastiness of the two dishes, respectively.
 Output Format
 For each testcase, output a single line containing the maximum absolute difference between the tastiness of the two dishes.

 Test Case
 1
 1: The possible pairs of
 {
 T
 1
 ,
 T
 2
 }
 {T
 1
 ​
 ,T
 2
 ​
 } are
 {
 0
 ,
 1
 }
 {0,1} and
 {
 1
 ,
 0
 }
 {1,0}. Difference in both the cases is
 1
 1, hence the maximum possible absolute difference is
 1
 1.

 Test Case
 2
 2: The possible pairs of
 {
 T
 1
 ,
 T
 2
 }
 {T
 1
 ​
 ,T
 2
 ​
 } are
 {
 0
 ,
 4
 }
 {0,4},
 {
 1
 ,
 3
 }
 {1,3},
 {
 2
 ,
 2
 }
 {2,2},
 {
 3
 ,
 1
 }
 {3,1} and
 {
 4
 ,
 0
 }
 {4,0}. The maximum possible absolute difference is
 4
 4.

 Test Case
 3
 3: The possible pairs of
 {
 T
 1
 ,
 T
 2
 }
 {T
 1
 ​
 ,T
 2
 ​
 } are
 {
 1
 ,
 2
 }
 {1,2} and
 {
 2
 ,
 1
 }
 {2,1}. Difference in both the cases is
 1
 1, and hence the maximum possible absolute difference is
 1
 1.
 */
