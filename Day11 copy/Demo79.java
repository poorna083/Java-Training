/*Dora is interested so much in gardening and she plants more trees in her garden.
She plants trees in a rectangular fashion with the order of rows and columns 
and numbered the trees in row-wise order. 
She planted the mango tree only in a 1st row, 
1st column and last column. So given the tree number, 
your task is to find whether the given tree is a mango tree or not?
Write a program to check whether the given number is a mango tree or not.
Input format: Input consists of 3 integers 
The first input denotes the number of rows 
The second input denotes the number of columns 
The third input denotes the tree number 
Output format: If the given number is a mango tree, print "Yes". 
Otherwise, print "No" Refer the sample output for formatting


Input (stdin)
5
5
11

Output (stdout)
Yes

Input (stdin)

2
2
4

Output (stdout)

Yes*/

import java.util.*;
public class Demo79 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("row_value:");
        int row = sc.nextInt();
        System.out.println("colum_value:");
        int col = sc.nextInt();
        System.out.println("tree_value:");
        int tree_no = sc.nextInt();
        boolean flag = true;
        int [][] array = new int[row][col];
        int n=1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                array[i][j]=n++;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i==0) || (j==0) || (j==col-1) ){
                    if (array[i][j]==tree_no){
                        flag = true;
                        break;  
                    }
                }

            }
        }
        System.out.println(flag?"Yes":"No");
    }
}




//another logic
if(tree_no>=1 && tree_n0<=column || tree_no%column==1 || tree_no%column==0 ){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
