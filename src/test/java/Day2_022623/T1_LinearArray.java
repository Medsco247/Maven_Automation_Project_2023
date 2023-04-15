package Day2_022623;

public class T1_LinearArray {
    public static void main(String[] args) {

        //create a list of cities in Linear Array
        //Array count starts from 0 index
        String[] cities = new String[]{"Brooklyn","Queens", "Manhattan", "The Bronx", "Staten Island"};

        //Get the count of the list of cities
        System.out.println("The cities count is "+ cities.length);

        //Print out Brooklyn & Bronx from the list
        System.out.println("My cities are "+ cities[0] + ", and " + cities [3]);


        //Separation of cities and zipcodes
        System.out.println("");

        //Integer Linear Array

        //create a list of zipcodes
        int[] zipcode = new int[]{11111,22222,33333,44444};
        //Get the count of the list of zipcodes
        System.out.println("The zipcode count is " + zipcode.length);
        // print out 11111 & 44444
        System.out.println("My zipcodes are " + zipcode[0] + ", and " + zipcode[3]);



    }//end of java

}//end of class
