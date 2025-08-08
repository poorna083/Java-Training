/*UseCASE-2
Write a Java program to:
1.	Accept the marks of N students.
2.	Store the marks in an ArrayList.
3.	Perform the following 4 operations:
Operations:
1.	Display all student marks.
2.	Convert each mark to a grade based on Anna University rules.
3.	Update a student's mark at a given index (e.g., after revaluation).
4.	Sort and display the marks in ascending order.
________________________________________
 Anna University Grading System:
Marks	Grade
90 - 100	O
80 - 89	A+
70 - 79	A
60 - 69	B+
50 - 59	B
Below 50	RA
________________________________________
 Input Format:
mathematica
CopyEdit
First line: Integer N (number of students)
Next N lines: Marks of each student (0–100)
(Optional) Update: Index and new mark (for revaluation)
 Output Format:
•	Marks List
•	Corresponding Grades
•	Updated List (if any)
•	Sorted List
________________________________________
Test Case 1
Input:
5
95
82
67
58
43
Output:
less

Grades: [O, A+, B+, B, RA]
Sorted: [43, 58, 67, 82, 95]
________________________________________
Test Case 2 (With Update)
Input:
pgsql
CopyEdit
4
76
49
88
67
Update index 1 to 55
Output:
Original: [76, 49, 88, 67]
Updated: [76, 55, 88, 67]
Grades: [A, B, A+, B+]
Sorted: [55, 67, 76, 88]
Test Case 3
100
100
100
Output:
less
Marks: [100, 100, 100]
Grades: [O, O, O]
Sorted: [100, 100, 100]
________________________________________
 Test Case 4 (Edge Values)
Input:
6
90
89
70
60
50
49
Output:
less

Marks: [90, 89, 70, 60, 50, 49]
Grades: [O, A+, A, B+, B, RA]
Sorted: [49, 50, 60, 70, 89, 90]
________________________________________
🎓 Final Note:
This simple Java program using ArrayList can be the backbone of a grading system for colleges. You’ve built:
•	A dynamic mark collector
•	A grading converter
•	A mark updater
•	A rank viewer
All using just one Java collection — ArrayList. */
package Day15;
import java.util.*;

public class Demo2 {
    public void method(int marks, List<String> grades) {
        if (marks >= 90 && marks <= 100) {
            grades.add("O");
        } else if (marks >= 80 && marks <= 89) {
            grades.add("A+");
        } else if (marks >= 70 && marks <= 79) {
            grades.add("A");
        } else if (marks >= 60 && marks <= 69) {
            grades.add("B+");
        } else if (marks >= 50 && marks <= 59) {
            grades.add("B");
        } else if (marks >= 40 && marks <= 49) {
            grades.add("RA");
        } else {
            grades.add("Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the subject count:");
        int a = sc.nextInt();

        List<Integer> marks = new ArrayList<>();
        List<String> grades = new ArrayList<>();

        System.out.println("Enter the marks:");
        for (int i = 0; i < a; i++) {
            int mark = sc.nextInt();
            marks.add(mark);
        }

        Demo2 d = new Demo2();
         for(int i :grades){
            System.out.println(grades);
        }
        System.out.println("Marks and Grades:");
        for(int i :marks){
            System.out.println(marks);
        }
        
        }
    }
}
