import java.*;
import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        for(int i =1;i<=a;i++)
        {
        for(int j = 1;j<=a;j++){
            if(i>=j){
            System.out.printf("%02d ",b++);
            } 
            else{
                System.out.print("   ");   
            } 
        } System.out.println();
        }
    }           
}
