/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random;


        



/**
 *
 * @author camburlegz
 */
public class KennywoodRideTracker {
    
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    
    final static int MIN_HEIGHT_THRILL_RIDES = 50;
    final static int MIN_HEIGHT_THEME_RIDES = 35;
    
    public static void main(String[] args){
        System.out.println("Begin ride simulation");
        printRiderStats();
        
        // ride the ride by calling its ride method, then print stats
        rideBlackWidow(12, 55);
        printRiderStats();
        
        rideMerryGoRound(7, 34);
        printRiderStats();
        
        rideMerryGoRound(2, 44);
        printRiderStats();
        
         rideBlackWidow(12, 55);
        printRiderStats();
        
        rideBlackWidow(12, 20); // very short folks
        printRiderStats();
        
    } // close main()
    
    public static void rideBlackWidow(int riders, int avgHeight){
        if(avgHeight >= MIN_HEIGHT_THRILL_RIDES){
            
            System.out.println("Riding Black Widow...");
            System.out.println("I HAAAATE SPIIIIIDEEEERS!\n");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
            
        } else {
            System.out.println(riders + " riders turned away sad: too short!\n");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        } // end if/else
        
    } // close method
    
    
    public static void rideMerryGoRound(int riders, int avgHeight){
        if(avgHeight >= MIN_HEIGHT_THEME_RIDES){
            
            System.out.println("Riding Merry-Go-Round");
            System.out.println("Round...and round...and round\n");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
            
        } else {
            System.out.println(riders + " riders turned away crying: too short!\n");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        } // end if/else
        
    } // close method
    
    public static void printRiderStats(){
        
        System.out.println("*******RIDER STATS*********");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRideAttempts);
        System.out.println("Total sick riders: " + totalSickRiders);
        System.out.println("***************************\n");
        
    } // close method
    
} // close class
