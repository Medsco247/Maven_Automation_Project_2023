package Day3_030423;

public class T2_If_Else_If_Else_Conditions {
    public static void main(String[] args) {

        //Using multiple conditional statements verify when a+b > c, a+b < c, a+b == c
        int a = 2;
        int b = 3;
        int c = 5;

        if(a+b > c){
            System.out.println("a & b is greater than c");
        } else if (a+b < c){
            System.out.println( "a & b is less than c");
        }else if (a+b == c) {
            //when you compare two values it will always be == double equal sign
            System.out.println(" a & b is equal to c");
        }//End of multiple conditions
   }//End of Main
}//End of Class
