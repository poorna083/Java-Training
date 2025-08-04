//find max of the each row
package Day11;
import java.util.*;
public class Demo14 {
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
         for(int i=0;i<row;i++){
            int max = 0;
            for(int j=0;j<colum;j++){
                max = max+array[i][j];
            }System.out.println("max value of colum is"+max);
        } 
    }
}
