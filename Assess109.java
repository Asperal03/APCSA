/**
 * The calculations of primitive data types like addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Jonathan Carroll
 * @version 10/10/2021
 */
public class Assess109
{
    public static void main(String[ ] args)
    {
        // Declare int variables
        int iNum3 = 25;
        int iNum2 = 9;
        int iNum1 = 11;

        // Declare double variables
        double dNum2 = 10.0;
        double dNum1 = 43.21;
        double dPi = 3.14;

        // Addition
        System.out.println("Addition");
        System.out.println((iNum3) + " + " + (iNum2) + " = " + (iNum3  + iNum2));
        System.out.println((dNum1) +" + " + (dPi) + " = " + (dNum1+dPi));
        //System.out.println();

        // Subtraction
        System.out.println("\nSubtraction");
        System.out.println( (iNum1) + " - " + (iNum2) + " - " + (iNum3) + " = " + (iNum1 - iNum2 - iNum3));
        System.out.println( (dPi) + " - " + (dNum2) + " = " + (dPi - dNum2));
        //System.out.println();

        // Multiplication
        System.out.println("\nMultiplication");
        System.out.println( (iNum3) + " * " + (iNum2) + " = " + (iNum3 * iNum2)); 
        System.out.println( (dPi) + " * " + (dNum2) + " * " + (dNum2) + " = " + (dPi * dNum2 * dNum2));
        //System.out.println();

        // Division
        System.out.println("\nDivision");
        System.out.println( (iNum2) + " / " + (iNum3) + " = " + (iNum3 * iNum2));
        System.out.println( (dNum1) + " / " + (dNum2) + " = " + (dNum1 / dNum2));
        //System.out.println();

        // Modulus operator
        System.out.println("\nModulus");
        System.out.println( (iNum1) + " % " + (iNum2) + " = " + (iNum1 % iNum2));
        System.out.println((dNum2) + " % " + (dPi) + " = " + (dNum2 % dPi));
        //System.out.println();s

        // 1.08 Additional int Equations
        System.out.println("\n---1.08 Additional int Equations---");
        // Declare int variables
        int intNum1 = 1;
        int intNum2 = intNum1 + 3;
        int sumInteger = intNum1 + intNum2;
        int moduInteger = intNum1 % sumInteger;

        // Display division and sum output
        System.out.println("Sum: " + (intNum1) + " + " + (intNum2) + " = " + (sumInteger));
        System.out.println("Division: " + (intNum1) + " % " + (sumInteger) + " = " + (moduInteger));

        // 1.09 Additional double Equations
        System.out.println("\n---1.09 Additional double Equations---");
        // Declare double variables
        double doubleNum1 = 3.14;
        double doubleNum2 = 69.42;
        double sumDouble = doubleNum1 + doubleNum2;
        double doubleNum3 = sumDouble * doubleNum1;
        double doubleNum4 = doubleNum3 % sumDouble + doubleNum2;
        double doubleTestOverwrite = doubleNum1;
        // Display three double variables
        System.out.println(doubleNum1 + " + " + doubleNum2 + " = " + sumDouble);
        System.out.println(doubleNum3 + " % " + sumDouble + " + " + doubleNum2 + " = " + doubleNum4);
        System.out.println(sumDouble + " * " + doubleNum1 + " = " + doubleNum3);
        // Test if a variable can overwrite another one
        System.out.println("Test if a variable can overwrite another one: \n" + doubleTestOverwrite);
        
        // Messing around a little bit -similar to Python
        boolean equal = (doubleNum1 == doubleTestOverwrite);
        if (equal)
        {
        System.out.println("\nTrue");
        // More messing around happened
            if (equal == false)
            {
            System.out.println("Nested-If False");
            }
            else
            {
            System.out.println("Nested-If True");
            }
        }
        else
        {
        System.out.println("\nFalse");
        }
        // Even more messing around
        System.out.println("\n" + Class.class);
    } // end of main method
} // end of class