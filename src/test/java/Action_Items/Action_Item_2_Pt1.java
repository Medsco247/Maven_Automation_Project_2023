package Action_Items;

import java.util.ArrayList;

public class Action_Item_2_Pt1 {
    public static void main(String[] args) {
        // final grade
        int grade = 90;

        // letter grade criteria
        if (grade >= 90 && grade <= 100) {
            System.out.println("My grade is an A");
        } else if (grade <= 89 && grade >= 80) {
            System.out.println("My grade is an B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("My grade is an C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("My grade is an D");
        } else if (grade <= 59) {
            System.out.println("My grade is an F");
        }// End of conditional statements

    }//end of main

}//end of class
