package Day04_12122021;

public class Split_Command {
    public static void main(String[] args) {
        //create  a single string
        String message = "My name is John";
        //declare String array to split the message to print out only Jhon
        String[] arrayMessage = message.split(" ");

        // print out Jhon
        System.out.println("result is " + arrayMessage[3]);


    }//end of main

}//end of java class
