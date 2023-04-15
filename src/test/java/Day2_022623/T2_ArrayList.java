package Day2_022623;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {

        // create an ArrayList of countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("Pakistan");

        //Get the count of the countries in the list
        System.out.println("Countries list count:  " + countries.size());

        //Print only USA, Bangladesh, and India
        System.out.println("Countries are "+ countries.get(0) + ", " + countries.get(1) + ", and " + countries.get(2) );

        //Adding another country
        countries.add("Russia");

        // Space
        System.out.println("");

        //Get a new count of the list
        System.out.println("Countries list count:  " + countries.size());

        //Print new country
        System.out.println("Countries are " + countries.get(4));

        //Space
        System.out.println("");

        // Integer Array List

        ArrayList<Integer> areaCode = new ArrayList<>();
        areaCode.add(111);
        areaCode.add(222);
        areaCode.add(333);

        //get the count of the integer area list
        System.out.println("The areaCode count: " + areaCode.size());

        //Print first and third areaCode
        System.out.println("AreaCodes are " + areaCode.get(0) + ", and " + areaCode.get(2));



    }//End of Main

}//End of Java Class
