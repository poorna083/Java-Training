/*Q3
There are 3 labs in the CSE department are L1, L2, and L3 with a seating capacity of x, y, and z. A single lab needs to be allocated to a class of 'n' students. How many of the 3 labs can accommodate 'n' students?


Input format:

Input consists of 4 integers

The first input denotes the seating capacity of L1(x)

The second input denotes the seating capacity of L2(y)

The third input denotes the seating capacity of L3(z)

The fourth input denotes the number of students(n)

 

Output format:

Print the number of labs which can accommodate the 'n' number of students

Refer the Sample output for formatting

 

Sample Input:

30

40

20

25

 

Sample Output:

2 

Input (stdin)

60
30
90
20


Output (stdout)

3 */
package Day19;
import java.util.*;
public class Demo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr the Students Capacity:");
    int n = sc.nextInt();
    System.out.println("Enter the Capacity of LAB1");
    int L1 = sc.nextInt();
    System.out.println("Enter the Capacity of LAB2");
    int L2 = sc.nextInt();
    System.out.println("Enter the Capacity of LAB3");
    int L3 = sc.nextInt();
    int count =0;
    int arr [] = {L1,L2,L3};
    for(int i:arr){
        if(i>n) count++;
    }
    System.out.println("the output is:" +count);
}
}
