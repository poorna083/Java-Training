import java.util.*;
public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a = 95.0f;
        for(int i =0;i<n;i++){
            System.out.printf("%.1f ",a);
            a = a + 20.5f;
        }



    }

}