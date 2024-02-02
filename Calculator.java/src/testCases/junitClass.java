package testCases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import cal.calculator;

public class junitClass {

 @Test
 public void testSum() {
     calculator Calculator = new calculator();
     assertEquals(5, Calculator.sum(2, 3));
 }

 @Test
 public void testSubtract() {
     calculator Calculator = new calculator();
     assertEquals(2, Calculator.subtract(5, 3));
 }

 @Test
 public void testMultiply() {
     calculator Calculator = new calculator();
     assertEquals(15, Calculator.multiply(5, 3));
 }

 @Test
 public void testDivide() {
     calculator Calculator = new calculator();
     assertEquals(2, Calculator.divide(6, 3));
 }

 @Test
 public void testDivideByZero() {
     calculator Calculator = new calculator();
     // You can use assertThrows for more precise exception handling in Junit 5
     try {
         Calculator.divide(5, 0);
     } catch (IllegalArgumentException e) {
         assertEquals("Cannot divide by zero", e.getMessage());
     }
 }
}
