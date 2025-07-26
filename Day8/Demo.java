import java.*;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 65;
        for(int i = 0;i<=a;i++){
            for(int j = 0;j<=a;j++){
             System.out.print((char)c+" ");  
             c++;
            }System.out.println();
        }    
    }
}
//logic 2;
// char ch = 'e';
//  for(int i = 0;i<=a;i++){
//             for(int j = 0;j<=a;j++){
//              System.out.print(ch++ +" "); 