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

import org.junit.Test;

import static org.junit.Assert.*;

/***
 * MainTest class contains the Unit Testing for all
 * of the methods that are in the Main class.
 *
 * @author  Aneta O'Donnell
 * @version 1.0
 * @since   4/21/2020
 */
public class MainTest {


    @Test
    public void additionUnitTestTrue() {
        try {
            assertTrue(Main.addition(5, 5) == 10);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void additionUnitTestFalse(){
        try {
            assertFalse(Main.addition(5,5) == 7);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void subtrationUnitTestTrue(){
        try{
            assertTrue(Main.subtraction(12,2) == 10);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void subtractionUnitTestFalse() {
        try {
            assertFalse(Main.subtraction(5, 5) == 7);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void multiplicationUnitTestTrue() {
        try{
            assertTrue(Main.multiplication(5, 5) == 25);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void multiplicationUnitTestFalse(){
        try{
            assertFalse(Main.multiplication(3,4) == 16);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void divisionUnitTestTrue(){
        try{
            assertTrue(Main.division(12,3) == 4);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void divisionUnitTestFalse() {
        try {
            assertFalse(Main.division(5, 5) == 2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void inputValueCheckUnitTestFalse() {
        assertEquals(false, Main.inputValueCheck(0, 0));
    }

    @Test
    public void inputValueCheckUnitTestTrue(){
        assertEquals(true, Main.inputValueCheck(2,2));
    }


}