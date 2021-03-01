/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * program will be finding out if we can be friends
 *
 * @author camburlegz
 */
public class mightwebefriends {

    public static void main(String[] cars) {
        // make storge containers
        int compatScore = 0;
        final int COMPAT_THRESHOLD = 100;
        int userResponse = 0;
        //make scanner
        Scanner inputScanner;
        inputScanner = new Scanner(System.in);
        boolean passedThreshold = false; //not used 

        // fixed point by question
        final int Q1_YES_POINTS = 50;
        final int Q1_NO_POINTS = -50;
        final int Q2_YES_POINTS = 30;
        final int Q2_NO_POINTS = 10;

        System.out.println("Hi there! im Anthony lets see if we can be friends!");
        System.out.println("Make sure to answer the question honestly!");

        //*************
        // Question 1 
        //*************
        System.out.println("Q1: Do you like cars?");
        System.out.println("Enter 1 for yes, Enter 0 for no.");

        //use scanner to read input into userResponse
        userResponse = inputScanner.nextInt();

        if (userResponse == 1) {
            //this block contains nested logic only run if yes

            //add 50 to compat score
            compatScore = compatScore + Q1_YES_POINTS;
            System.out.println("hell yea i do to!");
            System.out.println("You got" + Q1_YES_POINTS + "points");
        }

        if (userResponse == 0) {
            // take away 50 points if no
            compatScore = compatScore + Q1_NO_POINTS;
            System.out.println("well rip not off to a good start");
            System.out.println("you lost" + Q1_NO_POINTS + "points");

        }
        //***********
        //Question 2 
        //***********
        System.out.println("JDM or American cars");
        System.out.println("1 for JDM 0 for American");
        userResponse = inputScanner.nextInt();
        if (userResponse == 1) {
            //add 30 points
            compatScore = compatScore + Q2_YES_POINTS;
            System.out.println("A person of good taste i see!");
            System.out.println("You got" + Q2_YES_POINTS + "More points!");
        }

        if (userResponse == 0) { // only add 10 10 
            compatScore = compatScore + Q2_NO_POINTS;
            System.out.println("I enjoy all cars but prefer JDM");
            System.out.println("You still get" + Q2_NO_POINTS + "points");
        }
        //**************
        //Question 3
        //**************
        System.out.println("What motorsport do you enjoy the best!");
        System.out.println("1.drift");
        System.out.println("2.drag");
        System.out.println("3.show");
        System.out.println("4.Track");
        userResponse = inputScanner.nextInt();
        if (userResponse == 1) {
            //drift
            compatScore = compatScore + 20;
            System.out.println("Skurt Skurt my guy drift is one of my favs");
            System.out.println("You have gotten" + 20 + "points!");
        } else if (userResponse == 2) {
            //drag
            compatScore = compatScore + 5;
        } else if (userResponse == 3) {
            //show
            compatScore = compatScore + 20;
        } else if (userResponse == 4) {
            //Track
            compatScore = compatScore + 15;
        } // end of question 3

        System.out.println("You accumulated" + compatScore + "points.");
        System.out.println("Checking how good of friends we can be");

        if (compatScore >= COMPAT_THRESHOLD) {
            passedThreshold = true;
            System.out.println("Perfect lets go do car stuff!");
        } else {
            System.out.println("Sorry looks like we wont really be friends");
        }

    }

}
