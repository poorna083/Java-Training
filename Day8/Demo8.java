/*Arun's teacher gave him the following challenge. Help him solve it. "Given an array with 'n' elements by a user, you need to search if a particular element is present in the array or not. The element to be searched for is also given by the user"


Input Format:

Input consists of n+2 integers. 

The first integer corresponds to ‘n’, the size of the array. 

The next ‘n’ integers correspond to the elements in the array. 

The last integer corresponds to ‘a’, the element to be searched.

package Day10;*/
import java.util.*;
import java.util.Scanner;
public class Demo8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		
		int arr[]=new int[n]; 
		
		System.out.println("Enter elements  of Array");
		
		for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int c=0;
        int p=sc.nextInt();
        for(int i=0;i<p;i++){
            if(arr[i]==p){
                c=1;
            }}
        if(c==1){
            System.out.print("there is the number");
        }else{
            System.out.print("there is not the number");
        }
    }
}
