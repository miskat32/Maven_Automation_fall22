package Day2_12052021;

public class Daynamic_Array {

    public static void main(String[] args) {
        //create a String dynamic array for countries
        String[]countries = new String[6];
        //You set the limit/boundaries for your array
        //now you define your values by the variables indexing

        countries[0] = "USA";
        countries[1] = "canada";
        countries[2] = "Bangladesh";
        countries[3] ="india";
        countries[4] ="Pakistan";
        countries[5] ="Russia";
        System.out.println("My country is " + countries[5]);
        // integer daynamic array
        int[]houseNumber = new int[4];
        houseNumber[0] = 200;
        houseNumber[1] = 400;
        houseNumber[2] = 500;
        houseNumber[3] = 600;
        System.out.println("My house number is  " + houseNumber[3] );

    }//end of main
}//end of java class
