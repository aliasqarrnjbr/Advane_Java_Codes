/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
/**
 *
 * @author Mahdi
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1;
        double number2;
        double number3;
        double average;
        
        System.out.print("please enter first number: ");
        number1 = input.nextDouble();
        
        System.out.print("please enter second number: ");
        number2 = input.nextDouble();
        
        System.out.print("please enter third number: ");
        number3 = input.nextDouble();
        
        average = (number1 + number2 + number3 ) / 3;
        
        System.out.println("For these three [" + number1 + ", " + number2 + ", " + number3 + "] numbers the average is: " + average);
        // TODO code application logic here
    } //end of main() methon
    
}
