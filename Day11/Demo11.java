//Sum of each colum of the matrix
package Day11;
import java.util.*;
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colum = sc.nextInt();
        int [][] array = new int[row][colum];
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                array[i][j]=sc.nextInt();
            }
        }
        
        for(int j=0;j<row;j++){
            int sum_col = 0;
            for(int i=0;i<colum;i++){
               sum_col +=array[i][j];
            }
            System.out.println("value is"+ j +" "+sum_col);
        }
        
    }
}
