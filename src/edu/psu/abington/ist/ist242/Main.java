/*
Project: Lab 6 Methods / Lab 14 Javadocs and Junit Testing
Purpose Details: Simple Calculator
Course: IST 242
Author: Aneta O'Donnell
Date Developed: 2/23/2020
Last Date Changed: 4/22/2020
Rev: 5
*/


package edu.psu.abington.ist.ist242;

import java.util.Scanner; //allows us to take imput from a user

public class Main { //contains all of my methods

    /***
     * <h1>Add Two Numbers</h1>
     * The addition program implements an application that
     * simply adds two given integer numbers and Prints
     * the output on the screen.
     *
     * @param num1 This is the first parameter to addition method
     * @param num2 This is the second parameter to the addition method
     * @return int This returns sum of num1 and num2.
     *
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    /***
     * <h1>Subtract Two Numbers</h1>
     * The subtraction program implements an application that
     * simply subtracts two given integer numbers and Prints
     * the output on the screen.
     *
     * @param num1 This is the first parameter to subtraction method
     * @param num2 This is the second parameter to the subtraction method
     * @return int This returns difference of num1 and num2.
     *
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    /***
     * <h1>Multiply Two Numbers</h1>
     * The multiplication program implements an application that
     * simply multiplies two given integer numbers and Prints
     * the output on the screen.
     *
     * @param num1 This is the first parameter to multiplication method
     * @param num2 This is the second parameter to the multiplication method
     * @return int This returns the product of num1 and num2.
     *
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }


    /***
     * <h1>Divide Two Numbers</h1>
     * The division program implements an application that
     * simply divides two given integer numbers and Prints
     * the output on the screen.
     *
     * @param num1 This is the first parameter to division method
     * @param num2 This is the second parameter to the division method
     * @return int This returns the quotient of num1 and num2.
     *
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    /***
     * <h1>Input Value Check</h1>
     * The inputValueCheck method checks whether either num1 or num2
     * are 0. If either num1 or num2 are 0 it displays a message
     * that calculcation by 0 is not allowed.
     *
     * @param num1 This is the first parameter to inputValueCheck method
     * @param num2 This is the second parameter to inputValueCheck method
     * @return bool true or false
     */
    public static boolean inputValueCheck(double num1, double num2) { //checking double num1
        if(num1 == 0.0 || num2 == 0.0){ //An if statement consists of a Boolean expression followed by one or more statements //if num1 == 0
            System.out.println("Calculation by 0 is not allowed, please enter different numbers"); //print this statement
            return false; //but false
        }
        return true; // if num1 is not == 0
    }


    /***
     * <h1>Main Method</h1>
     * This is the main method which makes use of addition,
     * subtraction, multiplication and division methods in the
     * switch statement.
     * It contains a while loop to keep asking for num1 and num 2
     * until user enters Q to Quit.
     * The if statement, while loop goes to the inputvaluecheck method and
     * checks the division and multiplication
     * methods for an input num of 0, cannot multiply or divide by 0.
     *
     * @param args Unused.
     *
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner input
        char ch = 'y', oper; //declare char and initialize it to Y or operator
        double num1, num2; //declare num1 and num2 - scanner would initialize them

        while(ch != 'q') { //while loop repeatedly executes a target statement as long as a given condition is true.
            //while ch is not q ---
            System.out.print("Enter first number: "); //enter the first number
            num1 = sc.nextDouble(); //assign num1 with the first numnber input by user

            System.out.print("Enter second number: "); //enter second number
            num2 = sc.nextDouble(); //assign num2 with the second number input by user

            System.out.print("Enter operation(-, +, *, /): "); //enter an operator
            oper = sc.next().charAt(0); //assign operator = scanner next at character position index 0

            //INDENT because we are checking the operator
            if(oper == '/' || oper == '*') { //boolean expression in parentheses ---- if operator equals division
                while(!inputValueCheck(num1, num2)) {// In while loop, condition is evaluated first and if it returns true then the statements inside while loop execute. When condition returns false, the control comes out of loop and jumps to the next statement after while loop
                    //(condition evaluated is !inputValueCheck(num2)) -- does this return false?
                    // 1 divided by 0 -- goes up to inputValueCheck and since num2 == 0 and its division we need to enter another number --- once you enter a new number...
                    System.out.println("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Enter operation(-, +, *, /): ");
                    oper = sc.next().charAt(0);
                }
            }
            switch (oper) {
                case '+':
                    System.out.println("Addition: " + addition(num1, num2));
                    break;
                case '-':
                    System.out.println("Subtraction: " + subtraction(num1, num2));
                    break;
                case '*':
                    System.out.println("Multiplication: " + multiplication(num1, num2));
                    break;
                case '/':
                    System.out.println("Division: " + division(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            System.out.print("Enter y to continue OR q to quit");
            ch= sc.next().charAt(0); //stores the y or q
        }
        System.out.println("Have a wonderful day!");
    }
}





