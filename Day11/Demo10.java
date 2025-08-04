//Sum of each Row of the matrix
package Day11;
import java.util.Scanner;

class Main {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("row_val:");
        int row = sc.nextInt();
         System.out.println("colum_val:");
        int colum = sc.nextInt();
        System.out.println("enter the array value of "+ row + "x" + colum);
        int [][]array=new int[row][colum];
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            int sum = 0;
            for(int j=0;j<colum;j++){
                sum = sum+array[i][j];
            }System.out.println("sum of the rows is:"+i+" "+sum);
        }
    }
}
