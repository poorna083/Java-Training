//convert the string from lower to upper if without changing the upper case
package Day12;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String Str = sc.nextLine();
        for(int i=0;i<Str.length();i++){
            char ch = Str.charAt(i);
            int a = (int)ch;
            if(a<95 && a>123){
                System.out.print("Invalid input");
            }
            else if(a>95 && a<123){
                System.out.print((char)(a-32));
            }
            else if(a>64 && a<91){
                System.out.print((char)(a));
            }
        }System.out.println();
    }
}
