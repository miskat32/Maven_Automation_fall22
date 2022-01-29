package Action_item;

public class Action_item01 {
    public static void main(String[] args) {
        //create a String dynamic array for zip code
        String[]zipcode = new String[4];

        zipcode[0] = "1111";
        zipcode[1] = "2222";
        zipcode[2] = "3333";
        zipcode[3] = "4444";

        int[]streetNumber = new int[4];
        streetNumber[0] = 11;
        streetNumber[1] = 12;
        streetNumber[2] = 13;
        streetNumber[3] = 14;

        for (int i = 0;i < zipcode.length;i++){
            //print statement
            System.out.println("My current zipcode is " +zipcode[i] + " and my streetNumber is " +streetNumber[i]);

        }//end of loop


        }//end of main

}//end of java class
