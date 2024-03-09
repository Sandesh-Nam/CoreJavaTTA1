package Examples;

import java.util.Scanner;

//Interview Question
//Simulate a traffic light with three possible states: "Red", "Yellow" and "Green".
//WAP that takes an integer representing the current state of
// traffic light and prints the next state
//Use a switch statement of cycle through the states
// input - 1(red) -> output yellow
// input - 2(yellow) -> output green
// input - 3(green) -> output red
public class Ex10_TrafficLightSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1-3 which state you are in");
        int state = scan.nextInt();
        switch (state){
            case 1 :
                System.out.println("Your current state is red");
                System.out.println("Your next state is Yellow");
                break;
            case 2 :
                System.out.println("Your current state is Yellow");
                System.out.println("Your next state is Green");
                break;
            case 3 :
                System.out.println("Your current state is Green");
                System.out.println("Your next state is Red");
                break;
            default:
                System.out.println("Invalid state");
        }
        scan.close();


    }
}
