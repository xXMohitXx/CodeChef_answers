import java.util.*;
import java.lang.*;

class vaccine_dates
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int date = sc.nextInt();
            int first = sc.nextInt();
            int second = sc.nextInt();

            if(date >= first && date <= second){
                System.out.println("Take second dose now");
            }
            else if(date < first){
                System.out.println("Too early");
            }
            else if(date > second){
                System.out.println("Too late");
            }
        }
    }
}
/**
 Chef has taken his first dose of vaccine D days ago. He may take the second dose no less than L days and no more than
 R days since his first dose.

 Determine if Chef is too early, too late, or in the correct range for taking his second dose.

 Input Format
 First line will contain T, number of testcases. Then the testcases follow.
 Each testcase contains of a single line of input, three integers
 D,L,R.
 Output Format
 For each test case, print a single line containing one string - "Too Early" (without quotes) if it's too early to take the vaccine,
 "Too Late" (without quotes) if it's too late to take the vaccine,
 "Take second dose now" (without quotes) if it's the correct time to take the vaccine.

 Sample 1:
 Input

 4
 10 8 12
 14 2 10
 4444 5555 6666
 8 8 12

 output
 Take second dose now
 Too Late
 Too Early
 Take second dose now

 Test case 1: The second dose needs to be taken within
 8 to 12 days and since the Day 10 lies in this range, we can take the second dose now.

 Test case  2: The second dose needs to be taken within 2 to 10 days since Day 14 lies after this range, it is too late now.

 Test case  3: The second dose needs to be taken within  5555 to 6666 days and since the Day 4444 lies prior to this range,
 it is too early now.
 */