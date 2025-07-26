package Loops;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div=0;
		for(int i=1;i<=n;i++)
		{
		    if(n%i==0){
		        div++;
		    }
		}
		if(div==2){
		    System.out.println("Premium Number");
		}else{
		    System.out.println("Normal Number");
		}
	}
}