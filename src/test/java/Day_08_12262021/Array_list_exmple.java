package Day_08_12262021;

import java.util.ArrayList;

public class Array_list_exmple {
    public static void main(String[] args) {
  /*ArrayList is a resizable array which means you don,t need to add  the length to add more array values


   */
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        //shortcut for println is sout lowercase
        System.out.println("My city is " + cities.get(2));

ArrayList<Integer> StreetNumber = new ArrayList<>();

StreetNumber.add(111);
StreetNumber.add(112);
StreetNumber.add(113);

System.out.println("My third city is "+ cities.get(2) + "and my third house number is " + StreetNumber.get(2));



    }//end of main
}//end of class
