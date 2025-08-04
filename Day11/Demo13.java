//find max of the each column
package Day11;
import java.util.*;
public class Demo13 {
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
            int max = 0;
            for(int i=0;i<colum;i++){
                max = max+array[i][j];
            }System.out.println("max value of row is"+max);
        } 
    }
}
