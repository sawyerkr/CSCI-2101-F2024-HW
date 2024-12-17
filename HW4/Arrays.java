package HW4;

import java.util.Scanner;

public class Arrays {

    // CONVERT THE SUMS METHOD FROM HW3 TO ADD EACH VALUE TO AN ARRAY AND THEN OUTPUT THE 
    // ARRAY AND THE TOTAL.
    // SEE HW3 FOR SUMS METHOD
    // Otherwise if you are using a regular array, assume the size is 10 total. 
    // EXAMPLE 
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
    // Number: 0
    // Total: 22
    // Array: {12,2,3,4,1,0}
    // Note: You can not use Arrays class to do this. You must use a regular array. No Arrays.stream
    public static void Arraysums(){
        System.out.println("I will add up the numbers you give me...");
        int sum = 0;
        boolean cont = true;
        int loops = 0;
        int[] old_array = new int[0];
        while (cont){
            
            Scanner scan = new Scanner(System.in);
            System.out.print("Number: ");
            int num = scan.nextInt();
            if (num != 0){
                int[] new_array = new int[loops+1];
                for(int i=0; i<old_array.length; i++){
                    new_array[i] = old_array[i];
                }
                sum = sum + num;
                new_array[loops] = num;
                old_array = new int[new_array.length];
                old_array = new_array;
                System.out.println("The total so far is " + sum);
                loops++;
            }
            else {
                scan.close();
                cont = false;
            }
        }
        System.out.println("TOTAL ENDED --- The total was " + sum);
        System.out.print("[");
        for(int i=0; i<old_array.length;i++){
            System.out.print(old_array[i]);
            if(i+1<old_array.length){
                System.out.print(", ");
            }
        };
        System.out.print("]");
    }

    // Create a method that will brute force a password EX.
    // bruteForce("ZZZZ")
    // The program should then guess each char of the string and compare it to see if it is equal
    // to the index of the alphabet char array below
    // Output Example:
    // Z
    // ZZ
    // ZZZ
    // ZZZZ

    // Hint 1: using a char array for the password is helpful here 
    // Hint 2: using the method .toCharArray is a way to convert the password parameter to a char array as well
    // From there creating for and while loops to compare the values is trivial

    public static String bruteForce(String password){
        String answer = "";
        char[] passwordArray = password.toCharArray();
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};

        for(int i = 0; i<passwordArray.length; i++){
            for(int k = 0; k<alphabet.length; k++){
                if (alphabet[k] == passwordArray[i]){
                    answer = answer + alphabet[k];
                    System.out.println(answer);
                }
            }
        }

        return answer; 
    }

    // Create a method that will sort an Array of integers from smallest to greatest.
    // NOTE: You CANNOT use the built in Arrays.sort method
    // Ex. 
    // sorter([9,10,2,5,3,4,7,8]) -> [2,3,4,5,7,8,9,10]

    // Hint 1: a temp Array is a helpful way to store variables for comparing 
    // Hint 2: 2 nested For loops should be all thats needed for the swapping logic
    public static int[] sorter(int[] nums){
        int [] sortedArray = new int[nums.length];
        for (int i = 0; i < nums.length-1; i++) {
            for (int k = 0; k < nums.length-i-1; k++) {
                if (nums[k] > nums[k+1]) {
                    int temp = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1] = temp;
                }
            }
        }
        sortedArray = nums;
        return sortedArray;
    }

    
        
    




    public static void main(String[] args) {
        // Tester main method for your methods
        System.out.println("HW4!");
        Arraysums();
        System.out.println();
        bruteForce("password!!!");
        int[] things = {20, 34, 5, 12, 22, 1, 0};
        int[] sortedarray = sorter(things);
        System.out.println();

        for(int i=0; i<sortedarray.length;i++){
            System.out.print(sortedarray[i] + ", ");
        }

    }

    
}