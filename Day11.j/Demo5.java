//getting the input form the input for the 2D arrays
import java.util.*;
public class Demo5 {
   	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int row =sc.nextInt();
		int column =sc.nextInt();
		
		int [][] matrix2=new int [row][column];
		
		
		for(int i=0;i<row;i++){
		   for(int j=0;j<column;j++)
		   {
		       
		    matrix2[i][j]=sc.nextInt();
		      } 
		      
		} 
		for(int i=0;i<row;i++){
		   for(int j=0;j<column;j++)
		   {
		       
		    System.out.print(matrix2[i][j]+" ");
		      } 
		      System.out.println();
		}
	}
}

