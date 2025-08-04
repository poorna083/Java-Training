import java.util.*;
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int piece = sc.nextInt();
        double time = sc.nextDouble();
        int n =0;
        System.out.println(piece);
        switch (piece) {
            case 1:
                System.out.printf("%.2f",time);
                break;
            case 2:
                    double a = time/2;
                System.out.printf("%.2f",a);
                break;
            case 3:
                System.out.println();
            default:
                System.out.println("out of raingeee");
                break;
        }
    }
}
