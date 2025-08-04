// max value of an matrix of 2D array
package Day11;
import java.util.*;
public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colum = sc.nextInt();
        int [][]array = new int[row][colum];
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int max =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                if(max <= array[i][j]){
                  max = array[i][j]; 
                }
            }
        } System.out.println("max value is"+" "+max);
    }
}
