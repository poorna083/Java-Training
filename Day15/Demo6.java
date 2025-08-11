/*import java.util.*;
public class Ex66vector{
    public static void main(String []args){
        Vector<String>n=new Vector<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of initial flower");
        int a=sc.nextInt();
        System.out.println("flower names seperated by space");
        for(int i=0;i<a;i++){
            n.add(sc.next());
        }System.out.println("number of operation");
        int b=sc.nextInt();
        System.out.println("operations in captial letter \n 1)ADD \n 2)INSERT\n 3)UPDATE \n 4)REMOVE \n 5)SEARCH \n 6)DISPLAY \n 7)COUNT \n8)RETRIVE");
        for(int i=0;i<b;i++){
            String c=sc.next();
            switch(c) {
                case "ADD":
                    System.out.println("enter");
                    n.add(sc.next());
                    break;
                case "INSERT":
                    System.out.println("elemen name and postion");
                    n.insertElementAt(sc.next(),sc.nextInt());
                    break;
                case "UPDATE":
                    System.out.println("element postion and name");
                    n.set(sc.nextInt(),sc.next());
                    break;
                case "REMOVE":
                    System.out.println("enter");
                    n.remove(sc.nextInt());
                    break;
                case "SEARCH":
                    System.out.println("enter");
                    if(n.contains(sc.next())){
                        System.out.println("found");
                    }else{
                        System.out.println("not found");
                    }
                    break;
                case "DISPLAY":
                    System.out.println(n);
                    break;
                case "COUNT":
                    n.size();
                    break;
                case "RETRIVE":
                    n.get(sc.nextInt());
                    break;
                    
            }
        }
        
    }
}*/
package Day15;
import java.util.*;
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of flowers");
        int size = sc.nextInt();
        sc.nextLine();
        Vector<String> flowres = new Vector<>();
        System.out.println("Enter the flowers");
        for(int i=0;i<size;i++){
            String flower = sc.nextLine();
            flowres.add(flower);
        }
        System.out.println("Enter the size of operations");
        int ops = sc.nextInt();
        sc.nextLine();
        while(ops>0){
            System.out.println("Enter the operation:");
            String operation = sc.nextLine().toLowerCase();
            String flower;
            int index;
            switch (operation) {
                case "add":
                System.out.println("Enter the index:");
                    index =sc.nextInt();
                    sc.nextLine();
                System.out.println("Enter the flower:");
                    flower = sc.nextLine();
                    sc.nextLine();
                    flowres.add(index, flower);
                    System.out.println(flowres);
                    break;
                case "insert" :
                System.out.println("Enter the index:");
                index =sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the flower:");
                flower = sc.nextLine();
                flowres.insertElementAt(flower, index);
                System.out.println(flowres);
                break;
                case "update" :
                System.out.println("Enter the index:");
                index =sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the flower:");
                flower = sc.nextLine();
                flowres.set(index, flower);
                System.out.println(flowres);
                break;
                case "remove" :
                System.out.println("Enter the index:");
                index =sc.nextInt();
                sc.nextLine();
                flowres.removeElementAt(index);
                System.out.println(flowres);
                break;
                case "search" :
                System.out.println("Enter the flower:");
                flower = sc.nextLine();
                sc.nextLine();
                flowres.contains(flower);
                System.out.println(flowres);
                break;
                case "display" :
                for(int i=0;i<size;i++){
                    System.out.println(flowres);
                }
                System.out.println();
                break;
                case "count":
                System.out.println(flowres.size());
                break;
                case "retrive":
                System.out.println("Enter the index:");
                index = sc.nextInt();
                sc.nextLine();
                flowres.get(index);
                System.out.println(flowres);
                break;
                default:
                System.out.println("Invalid input");
                    break;
            }
        }
    }
}
