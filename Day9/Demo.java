import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 65;
        for(int i=0;i<=a;i++){
             for(int j=0;j<=a;j++){
            System.out.print((char)b+" ");
                b++;

             }System.out.println();
        }
    }
}
