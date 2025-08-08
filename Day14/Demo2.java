package Day14;
import java.util.*;
public class Demo2 
{
    public static void main(String[] args) 
    {

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the array elements upto");
        List  <Integer> arr_list= new ArrayList<>();
        for(int i=0;i<size;i++){
            int b= sc.nextInt();
            arr_list.add(b);
            
        } arr_list.remove(60);
    }
        

        
}
