package Action_item;

public class Action_item02 {
    public static void main(String[] args) {    //create a dynamic array for 4 different cities, iterate through the values but only print when city is
        //either brooklyn or manhattan
        String[] cities = new String[4];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Staten Island";

        int i = 0;
        while (i <cities.length) {
            //two if conditions
            if (cities[i] == "Brooklyn") {
                System.out.println("city is " + cities[i]);
            } else if (cities[i] == "Manhattan") {
                System.out.println("city is " + cities[i]);

            }//end of condition

            i++; //incrementing
        }

    }//end of main

}//end of java class
