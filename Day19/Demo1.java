/*
 * A fruit seller buys a dozen of banana at Rs.X. He sells 1 banana at Rs.Y.

Write a program to determine the profit or loss in Rs. for the fruitseller.


Input format:

Input consists of 2 floating point numbers

The first input corresponds to the total cost(X)

The second input corresponds to the sold cost(Y)

 

Output format:

Print "Profit or Loss" with Rupees.

 

Sample Input:

60

4

 

Sample Output:

Loss : Rs.12.00

Input (stdin)

100.0
3


Output (stdout)

Loss : Rs.64.00
 */
package Day19;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        float X = sc.nextFloat();
        System.out.println("Enetr the selling price of 1 bananana:");
        float Y = sc.nextFloat();
        float SP = (Y*12);
        Float res = ((SP)-(X));
        if(res >0){
            System.out.printf("Profit is:" +"%.02f" ,res);
        }
         else if(res<=0){
            System.out.printf("Loss: "+"%.02f" ,res);
        }
    }
}
