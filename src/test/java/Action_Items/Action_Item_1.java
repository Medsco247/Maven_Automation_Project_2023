package Action_Items;

import java.util.ArrayList;

public class Action_Item_1 {
    public static void main(String[] args) {

        //ArrayList of countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Yemen");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Palestine");


        //ArrayList of countryCode
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(967);
        countryCode.add(1);
        countryCode.add(48);
        countryCode.add(970);

        // for loop
        for(int i = 0; i < countries.size(); i++){
            System.out.println("My Country is " + countries.get(i) + ", and my country Code is " + countryCode.get(i));
        }//End of for Loop

        //Space
        System.out.println("");

       //linear array of regions
        String[] regions = new String[]{"Yemen","USA","Poland","Mongolia"};

        //linear array of regionalCode
        String[] regionalCode = new String[]{"Yem","USA","POL","MNG"};

        //While loop
        int i = 0;
        while (i < regions.length){
            System.out.println("My region is " + regions[i] + ", and my regional code is " + regionalCode[i]);

            i = i+1;
        }//End of while loop

    }//End of Main

}//End of Class
