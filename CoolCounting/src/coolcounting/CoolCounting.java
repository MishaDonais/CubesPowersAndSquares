/*
 * This program was made by Misha Donais
 * On the 19th of October 2018
 * To count from one number to another number
 */

package coolcounting;

import java.util.Scanner;

/**
 *
 * @author midon7419
 */
public class CoolCounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Variable for choice
        int choice = 0;
        
        //Initial prompts
        System.out.println("---Cool Counting---");
        System.out.println("Please enter your choice:");
        System.out.println("1 -- Count from 0 to 10 by 1");
        System.out.println("2 -- Count from 100 to 0 by 10");
        System.out.println("3 -- Count from 50 to 500 by 50");
        System.out.println("4 -- Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");
        
        //Choice
        choice = keyedInput.nextInt();
        
        //Choice 1
        if (choice == 1){
            System.out.println("You have chosen to count from 0 to 10 by 1");
            System.out.println("-------------");
            for (int i = 0; i<=10; i++) {
                System.out.println(i);
            }
            System.out.println("-------------");
        }
        
        //Choice 2
        if (choice == 2){
            System.out.println("You have chosen to count from 100 to 0 by 10");
            System.out.println("-------------");
            for (int i = 100; i>=0; i = i-10) {
                System.out.println(i);
            }
            System.out.println("-------------");
        }
        
        //Choice 3
        if (choice == 3){
            System.out.println("You have chosen to count from 50 to 500 by 50");
            System.out.println("-------------");
            for (int i = 50; i<=500; i = i+50) {
                System.out.println(i);
            }
            System.out.println("-------------");
        }
        
        //Choice 4
        if (choice == 4){
            System.out.println("You have chosen to count from 6000 to 1000 by 1000");
            System.out.println("-------------");
            for (int i = 6000; i>=1000; i = i-1000) {
                System.out.println(i);
            }
            System.out.println("-------------");
        }
    }
    
}
