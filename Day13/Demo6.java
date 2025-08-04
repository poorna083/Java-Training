//transpose the matrix of an 2D array
import java.util.*;
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] array =new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
