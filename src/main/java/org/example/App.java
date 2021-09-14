/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        //input, while loop ensures input is numeric
        System.out.println("Enter your weight.");
        while(input.hasNextDouble()){
            //input
            double weight = input.nextDouble();

            System.out.println("Enter your height.");
            double height = input.nextDouble();

            //calculation of BMI
            double bmi = (weight / (height * height)) * 703;

            //output
            System.out.printf("Your BMI is %.1f.\n", bmi);
            //checks if BMI is inside or outside range
            if(bmi >= 18.5 && bmi <= 25){
                System.out.println("You are within the ideal weight range.");
            }
            else if(bmi < 18.5){
                System.out.println("You are underweight. You should consult your doctor.");
            }
            else{
                System.out.println("You are overweight. You should consult your doctor.");
            }
            return;
        }
        System.out.println("You have entered a non-numeric input. Please only enter numeric inputs.");
    }
}
