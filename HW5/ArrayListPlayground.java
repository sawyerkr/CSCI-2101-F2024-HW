package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
        System.out.println("HW5!");
        // Question 1
        // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type Integer.
        ArrayList<Integer> nums = new ArrayList<Integer>(15);
        for(int i = 0; i<15; i++){
            nums.add(0);
        }
        // b) Output the value of the tenth element of the arrayList nums.
        System.out.println(nums.get(9));
        // c) Set the value of the 5th element of the arrayList nums to 99.
        nums.set(5, 99);
        // d) set the value of the 13th element to 15
        nums.set(12, 15);
        // d) set the value of the 2nd element to 6
        nums.set(1, 6);
        // d) Set the value of the 9th element of the arrayList nums to the sum of the 13th
        // and 2nd elements of the arrayList nums.
        nums.set(8, nums.get(12) + nums.get(1));
        // Question 2
        // a) create an arrayList of Strings that contain each day of the week.(starting
        // on monday)
        ArrayList<String> week = new ArrayList<String>();
        week.add("monday");
        week.add("tuesday");
        week.add("wednesday");
        week.add("thursday");
        week.add("friday");
        week.add("saturday");
        week.add("sunday");
        
        // b) output each of the days of the week
        for(int i = 0; i<7; i++){
        System.out.println(week.get(i));
        }
        // c) output the days of the week that we have class
        System.out.println(week.get(1));
        System.out.println(week.get(3));
        // d) change the arrayList to start on Sunday
        Collections.rotate(week, 1);
        System.out.println(week);


        // Question 3
        // a) create an ArrayList and prompt the user for numbers to add to it until the
        // number 0 is selected
        ArrayList<Integer> inputed_nums = new ArrayList<Integer>();
        boolean going = true;
        Scanner scan = new Scanner(System.in);
        while (going){
            System.out.println("Input a number:");
            int my_number = scan.nextInt();
            if(my_number == 0){
                going = false;
            }
            else{
                inputed_nums.add(my_number);
            }
        }

    

        // b) return the largest and smallest number

        System.out.println(Collections.max(inputed_nums));
        System.out.println(Collections.min(inputed_nums));
        // c) return the ArrayList sorted smallest to largest
        Collections.sort(inputed_nums);
        
        System.out.println(inputed_nums);
        // d) take that ArrayList see if its size is divisable by 3 and then output the
        // ArrayList in a matrix format
        // NOTE: make the matrix n X 3 so it can be n rows by 3 columns
        // EX. ArrayList [1,2,3,4,5,6,7,8,9]
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers
        // and add them until it is
        // ArrayList Size: 7
        // Please enter 2 more numbers to create the matrix...
        //
        // Hint 1: use collections sort to sort the numbers
        // Hint 2: you can see if the size of the array list is divisible by 3 by
        // running:
        // numbers.size()%3==0
        // Hint 3: You can use this logic to print the array list in a 3x3 pattern once
        // its created:
        // for(int i=0;i<numbers.size();i++)
        // {
        // System.out.print(numbers.get(i)+" ");
        // if((i+1)%3==0)
        // {
        // System.out.println();
        // }
        // }
        going = true;
        while(going){
            if(inputed_nums.size() % 3==0){
                going = false;
                for(int i=0;i<inputed_nums.size();i++){
                    System.out.print(inputed_nums.get(i)+" ");
                    if((i+1)%3==0){
                        System.out.println();
                    }
                }

            }
            else{
                System.out.println("Matrix size:" + inputed_nums.size());
                System.out.println("Please input " + (3-(inputed_nums.size()%3)) + " more numbers to complete the matrix.");
                int new_number = scan.nextInt();
                inputed_nums.add(new_number);
            }
        }
        scan.close();

    }
}