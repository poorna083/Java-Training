package Day15;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Demo5 {
    public int Method( Vector<Integer>number,int a    ){
        int sum = 0;
        number.add(0, 0);
        number.add(a, 0);
        Collections.addAll(null, null);


    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Vector<Integer>number = new Vector<>();
    System.out.println("Enter no of elements:");
    int a = sc.nextInt();
    System.out.println("Enter the elements:");
    for(int i=0;i<a;i++){
        number.add(sc.nextInt());
    }
    Method method = new Method();
    M.Method(number,a);
  }  
}
