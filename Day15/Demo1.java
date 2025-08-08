/*UseCase-1
Unique Batsmen Tracker using HashSet in Java

In the heart of a bustling cricket stadium, an exciting match is underway. The commentary is vibrant, the crowd is roaring, and players from both teams are getting ready to bat. But here’s a twist — you are the score analyst and your task is to keep track of all the batsmen who walk onto the pitch.

Every time a batsman comes out to bat, his name is noted down. However, due to multiple innings, super overs, or rain-affected replayed matches, the same player might bat more than once. You don’t want to count him multiple times — you want to know: *how many unique batsmen* actually played in the match?

To solve this, you use a HashSet in Java.

HashSet is perfect here because:
- It automatically removes duplicates.
- It stores only unique values.
- It provides fast access and storage.

Constraints:
- Accept number of entries from the user.
- Accept batsman names (may have duplicates).
- Convert names to lowercase to handle case sensitivity.
- Store names in a HashSet.
- Finally, print the size of the HashSet — which gives the number of unique batsmen.

Input Format:
First line: An integer N (number of batsman entries)  
Next N lines: Each line contains a batsman's name

Output Format:
Print the number of unique batsmen

Sample Input:
6  
Virat  
Rohit  
Virat  
Dhoni  
Rohit  
Pant  

Output:
4

Bonus Logic:
You can also enhance the program to:
- Handle case sensitivity (e.g., Virat vs virat)
- Display the sorted list of players (using TreeSet)
- Count how many times each player batted (using HashMap)

This simple scenario teaches us how powerful and useful collections like HashSet can be in Java when solving real-world problems like tracking players in a cricket match!

Test case -1
4
Gill
Gill
Gill
Gill

Output-1
1
Input-1
7
Sachin
Sourav
Rahul
Sachin
Rahul
Sehwag
Dhoni

Output-2
5
Test case -3
Input:
3
Raina
raina
RAINA

Output:
1

test case -4
Input:
0

Output:
0 */
package Day15;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> names = new HashSet<String>();
        System.out.println("Enter the players count:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Eneter the players name:");
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            if(names.add(name)){
            System.out.println("player"+names);
        }
        else{
            System.out.println("Repeat"+names);
        }
    }System.out.println(" count : "+names.size());
}

}