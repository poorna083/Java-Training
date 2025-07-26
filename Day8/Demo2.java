import java.*;
import java.util.Scanner;
public class Demo2 
{
   public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        char res=(char)('A'+n*j+i);
		        System.out.print(res +" ");
		    }
		    System.out.println();
		}
		
	}
}