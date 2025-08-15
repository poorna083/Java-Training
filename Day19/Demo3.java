/*There are 3 labs in the CSE department. The labs are L1, L2, and L3 with a seating capacity of x, y, and z respectively. A single lab needs to be allocated to a class of 'n' students. The labs need to be utilized to the maximum i.e the number of systems used should not be minimal. Which lab needs to be allocated to this class?


Input format:

Input consists of 4 integers

The first input denotes 'x'

The second input denotes 'y'

The third input denotes 'z'

The fourth input denotes 'n'

 

Output format:

Print the lab which is suitable for 'n' number of students

Refer the Sample output for formatting

 

Sample Input:

30

40

20

25

 

Sample Output:

L1

 

Input (stdin)

90
50
60
40


Output (stdout)

L2 */
package Day19;
import java.util.*;
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the Lab1 Capacity:");
        int L1 = sc.nextInt();
        System.out.println("Eneter the Lab2 Capacity:");
        int L2 = sc.nextInt();
        System.out.println("Eneter the Lab3 Capacity:");
        int L3 = sc.nextInt();
         System.out.println("Enter the Student capacity:");
        int n = sc.nextInt();
        int [] arr = {L1,L2,L3};
        for(int i=0;i<3;i++){
            if(n<arr[i])
            {
                if(arr[i]==arr[0]) System.out.println("L1");
                else if(arr[i]==arr[1]) System.out.println("L2");
                else if(arr[i]==arr[2])  System.out.println("L3");
            }
        }
    }
}
