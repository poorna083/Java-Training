import java.util.*;
import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int turn = 0;
        int total = 0;
        while(target>total){
            int  score = sc.nextInt();
            total = total+score;
            turn = turn+1;
        }
        System.out.println(turn);
       
    }
}
