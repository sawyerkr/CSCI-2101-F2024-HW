package HW3;
import java.util.Scanner;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'e'){
                counter++;
            }
        }
        if(counter > 0 && counter < 4){
            return true; 
        }
        return false;
        
    }

    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) {
        String new_str = "";
        for(int i = 0; i < n; i++){
            new_str = new_str + str;
        };
        return new_str;
    } 

    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringZ("zHelloz") -> "zHelloz"
    //stringZ("nozthaznks") -> "nothanks"
    //stringZ("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str){
        String final_str = "";
        for(int i = 0; i > str.length(); i++){
            if(str.charAt(i) != 'z' || i == 0 || i == str.length()-1){
                final_str = final_str + str.charAt(i);
            }
        }
        return final_str; // <- this should be changed 
    }

    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums(){
        System.out.println("I will add up the numbers you give me...");
        int sum = 0;
        boolean cont = true;
        while (cont){
            Scanner scan = new Scanner(System.in);
            System.out.print("Number: ");
            int num = scan.nextInt();
            if (num != 0){
                sum = sum + num;
                System.out.println("The total so far is " + sum);
            }
            else {
                scan.close();
                cont = false;
            }
        }
        System.out.println("TOTAL ENDED --- The total was " + sum);

    }

    public static void main(String[] args) {
        // Add code to help test your methods here
        System.out.println(loopE("aaaa"));
        System.out.println(loopE("Heeello"));
        System.out.println(loopE("EEeeeeee"));
        
        System.out.println();

        System.out.println(stringTimes("Tacocat", 7));
        System.out.println(stringTimes("What the heck", 0));

        System.out.println(stringZ("Zello!"));
        System.out.println(stringZ("zlzlz"));
        System.out.println(stringZ("ozhz zmyz zgoodnezzss"));

        System.out.println();

        sums();
    }
    
}