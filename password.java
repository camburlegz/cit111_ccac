/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author camburlegz
 */
public class password {
    public static void main(String[] something) {
     // constants for authenticating against  
     final String CORRECT_USERNAME = "camburlegz";
     final String CORRECT_PASSWORD = "PASSword9";
     // storage variable for person data
     String enteredUsername;
     String enteredPasswd;
     
     // make the scanner object
     Scanner userInputScanner = new Scanner(System.in);
     
     // ask user for username
     System.out.println("Please enter username and hit enter");
     // scans name in 
     enteredUsername = userInputScanner.next();
     
     // ask for password
     System.out.println("Please enter password and hit enter");
     // scan password in
     enteredPasswd = userInputScanner.next();
     
     // check to see if right with if
     
    if(enteredUsername.equals(CORRECT_USERNAME) && enteredPasswd.equals(CORRECT_PASSWORD)){
     // if they do match
     System.out.println("You are now logged in!");
    } else {
        // if they dont match
        System.out.println("Wrong username or password try again!");
        }// end of if and else blocks

    }//close main method
} // close class 
