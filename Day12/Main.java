//Frequency of the array
package Day12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();  
        int [] arr=new int[n]; 
        int [] freq=new int[n]; 
        int visited=-1;
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){  
           int count=1;
           for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
                freq[j]=visited;
            } 
            }
        if(freq[i]!=visited){
            freq[i]=count;
        }
        }
        System.out.println("Elements : Frequency");
        for(int i=0;i<n;i++){
            if(freq[i]!=visited){
                System.out.println(arr[i]+ " Count: "+freq[i]);
            }
        }
    }
		
}