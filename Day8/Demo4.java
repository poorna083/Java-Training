import java.util.*;
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(s.charAt(i));     //condition 2:
                }                                       //if(i==j||i+j>=n-1)
                else if(j==n-1-i){                  
                    System.out.print(s.charAt(n-1-i));   //->(i)
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
