package Project3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SquidGameProject {
    public static void main(String[] args) {
        final int TOTAL_STEPS = 8;
        int answer = 3;
        boolean win = true;
        boolean goodOrBad = false;

        int[][] bridgeKey = {
            {0, 1},
            {0, 1},
            {0, 1},
            {0, 1},
            {0, 1},
            {0, 1},
            {0, 1},
            {0, 1},
        };
       int currentLevel = 0;
       int round_counter = 1;

       Scanner scan = new Scanner(System.in);
       String input = new String();
       boolean playing = true;
       int lives = 10;
       System.out.println("|||||| ---- Start");
       for(int i = 0; i<TOTAL_STEPS; i++){
            System.out.println("| || |");
       }
       System.out.println("|||||| ---- Finish");

       /*
        
       ---------LEGEND-----------
        0: Glass
        1: Tempered Glass
       --------------------------

        */
        while(playing){
            System.out.println();
            System.out.println("|||||| ---- Start");
            for(int i = 0; i<currentLevel; i++){
                System.out.println("|" + bridgeKey[i][0] + "||" + bridgeKey[i][1] + "|");
            }
            System.out.println("|?||?|");
            if (round_counter != 1 && goodOrBad == true) {
                System.out.println("Nice job!");
            }
            else if (round_counter != 1 && goodOrBad == false){
                System.out.println("You lost a life!");
            }

            System.out.println("---------LEGEND-----------");
            System.out.println("0: Glass");
            System.out.println("1: Tempered Glass");
            System.out.println("--------------------------");

            System.out.println("Lives: " + lives + "/10");
            System.out.println("Round: " + round_counter);
            System.out.println("Current Place in Ladder: " + currentLevel + "/8");

            while (answer == 3) {
                System.out.println("L or R?");
                input = scan.nextLine();
                if(input.equalsIgnoreCase("L")){
                    answer = 0;
                } else if(input.equalsIgnoreCase("R")){
                    answer = 1;
                }
                else{
                    System.out.println("Invalid input.");
                }
            }
            if (bridgeKey[currentLevel][answer] == 0){
                lives--;
                goodOrBad = false;
                if(lives==0){
                    playing = false;
                    win = false;
                }
                answer = 3;
            }
            else{
                currentLevel++;
                goodOrBad = true;
                if(currentLevel==8){
                    playing = false;
                    win = true;
                }
                answer = 3;
            }
            round_counter++;
        }
        if(win==false){
            System.out.println("YOU DIED.");
        }
        else{
            System.out.println();
            System.out.println("|||||| ---- Start");
            for(int i = 0; i<TOTAL_STEPS; i++){
                System.out.println("|" + bridgeKey[i][0] + "||" + bridgeKey[i][1] + "|");
            }
            System.out.println("|||||| ---- Finish");
            System.out.println("Lives: " + lives + "/10");
            System.out.println("Round: " + round_counter);
            System.out.println("Current Place in Ladder: " + currentLevel + "/8");
            System.out.println();
            System.out.println("CONGRATULATIONS!!! YOU WON!!");

    }

    }
}
