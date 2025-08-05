/*Write a Program to count the total number of characters in a string.


Sample Input :

I love programming@

Sample Output :

Total number of characters in a string: 17

Input (stdin)

Happy learning !!!


Output (stdout)

Total number of characters in a string: 16 */
package Day12;
import java.util.*;
public class Demo3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c = 1;
        for(int i=0;i<str.length();i++){
            c=i;
        }
        System.out.println(c);

       
    }
}


//another method

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    str = str.replace(" ","");
    System.out.println(str.length());
