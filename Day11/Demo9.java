/* 
 Matrix Sum

Shobitha and Siddhesh were playing puzzles. They are having two puzzles in their hand.

They need to join the puzzle to get the correct puzzle. Help them to find the puzzle.


 

Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m,

the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix.

The remaining integers correspond to the elements in the matrix.

The elements are read in row-wise order, first row first, then second row and so on.

Assume that the maximum value of m and n is 10.

 

Output Format:

Refer sample output for details.

 

Sample Input 1:

3

2

4 5

6 9

0 3

 

Sample Output 1:

 27

Input (stdin)

2
2
45 65
23 62


Output (stdout)

195
 */
import java.util.*;
public class Demo9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row:");
        int row = sc.nextInt();
        System.out.println("Enter the Column:");
        int col = sc.nextInt();
        int sum = 0;
        int [][]array = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
                sum = sum+array[i][j];
            }
        }
        System.out.println(sum);
    }
}
