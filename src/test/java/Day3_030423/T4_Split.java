package Day3_030423;

public class T4_Split {
    public static void main(String[] args) {

        //declare a single string variable
        String message = "My name is Ahmed";

        //print out only Ahmed from above string
        String[] arrayMessage = message.split(" ");
        System.out.println("Result: " + arrayMessage[3]);


    }//End of main
}//End of class

