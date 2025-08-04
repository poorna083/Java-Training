/*Rock, Paper, Scissors
Two players A and B, are playing the game of Rock, Paper, Scissors. Player A chooses a move represented by a string value M: and the move can be one of the following: ‘rock’, ‘paper’, or 'scissors' where,

rock beats scissors
scissors beats paper
paper beats rock
Your task is to find and return a string value representing the winning move for Player B.



Note

The output is case sensitive


Input Format

Input1: A string value M representing the move chosen by Player A



Output Fomat

Return a string representing the winning move for Player B.



Sample Input

Input1:rock



Sample Output

Paper



Explanation

Here, Player A chooses rock. The winning move for Player B is 'paper, as 'paper' beats 'rock' in the game of Rock, Paper, Scissors Hence, paper is returned as the output.
import java.util.Scanner;*/
import java.util.*;
public class Demo 
{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String M = sc.nextLine();
if(M.toLowerCase().equals("scissors"))
{
    System.out.println("rock");
}
else if (M.toLowerCase().equals("paper")) {
    System.out.println("Scissers");
    
}
else if (M.toLowerCase().equals("rock")){
    System.out.println("paper");
}
else{
    System.out.println("Invalid input");
}

}
}