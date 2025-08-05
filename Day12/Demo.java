//convert the string from lower to upper without using any functionss
package Day12;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String Str = sc.nextLine(); 
       for(int i=0;i<Str.length();i++)
       {
            char cha = Str.charAt(i);
            int a = (int)cha;
            if(a>95 && a<123){
                System.out.print((char)(a-32));
            }
            else if(a>64 && a<91){
                System.out.print((char)(a+32));
            }
            else{
                System.out.println("Invalid");
                break;
            }
       }System.out.println();
    }
}
