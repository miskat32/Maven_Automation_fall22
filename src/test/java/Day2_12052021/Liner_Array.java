package Day2_12052021;

public class Liner_Array {
    public static void main(String[] args) {
        
        //create a linear string array for cities 
        //declare the variable first 
        String[] cities, zipcodes;
        //define the linear array for cities 
        cities = new String[]{"Brooklyn","Queens","Manhattan","staten Island","Bronx" };
        zipcodes = new String[]{"11218","22222","33333","44444","10001"};


        //declare  int variable
        int[]streetNumber;
        //define integer array for street number
        streetNumber = new int[]{22,44,55,66,77,88,};
        //print the first city and first streetNumber
        System.out.println("My first city is "+cities[0]+" and street number is " +streetNumber[0]);


    }//end of java class

}//end of main
