import java.*;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char ch = 'P';
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print(ch--+" ");
            }System.out.println();
        }
    }
}