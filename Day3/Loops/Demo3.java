package Loops;
import java.util.Scanner;

public class Demo3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
		for(int i=1;i<=n;i++)
		{
		    sum+=i*i;
		}
		System.out.println(sum);
	}
}

