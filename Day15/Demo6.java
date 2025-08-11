/*USECASE
In the bustling streets of Hyderabad, there was a famous flower market managed by Meera. She kept track of all her flowers — Roses, Jasmine, and Lotus — in a magical list called a Vector. One fine morning, she got a fresh stock of Lily and quickly added it to her inventory. Later, a customer requested that Lotus should appear right after Jasmine, so she inserted it at the correct spot. A florist came and told Meera that “Orchid” sounded more appealing than “Rose” for her bouquet, so she updated the name at the first position. By afternoon, a buyer asked for Jasmine, but since it had already been sold, Meera removed it from the Vector. Curious about her stock, she searched for “Lily” and happily found it still available. Before closing the shop, she displayed all her remaining flowers, counted them, and even checked which flower was at the second position. The Vector had helped Meera keep her market perfectly organized throughout the day.

Input Format
First line: An integer n — the number of initial flowers.
Second line: n flower names separated by spaces.
Third line: An integer q — the number of operations to perform.
Next q lines: Each line contains an operation in one of the following formats:
ADD flowerName
INSERT index flowerName
UPDATE index flowerName
REMOVE flowerName
SEARCH flowerName
DISPLAY
COUNT
RETRIEVE index

Output Format
For SEARCH: Output "Found" or "Not Found".
For DISPLAY: Print the flowers separated by spaces.
For COUNT: Print the total number of flowers.
For RETRIEVE: Print the flower at the given index.
No output for ADD, INSERT, UPDATE, or REMOVE unless the operation affects a later query.

Constraints
1 ≤ n ≤ 20
1 ≤ q ≤ 50
Flower names are strings without spaces.
Index values are 0-based.
If index is invalid, ignore the operation.
Removal of a non-existing flower has no effect.

Test Cases
Test Case 1
Input
3
Rose Jasmine Lotus
6
ADD Lily
INSERT 1 Orchid
UPDATE 0 Tulip
REMOVE Jasmine
SEARCH Lily
DISPLAY

Output
Found
Tulip Orchid Lotus Lily

Test Case 2
Input
4
Rose Jasmine Lily Lotus
5
SEARCH Orchid
ADD Orchid
SEARCH Orchid
COUNT
DISPLAY

Output
Not Found
Found
5
Rose Jasmine Lily Lotus Orchid

Test Case 3
Input
2
Rose Lotus
7
ADD Jasmine
ADD Lily
RETRIEVE 2
UPDATE 2 Orchid
DISPLAY
REMOVE Rose
COUNT

Output
Jasmine
Rose Lotus Orchid Lily
3*/
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
