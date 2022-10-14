/*
 *  Programmer:Colin Mastrocola
 *  Date:10/14/22
 *  Class:Comp Sci
 *  
 *
 */

package CW.PA; // file location

import java.util.Scanner; // bring scanner library into scope

public class PA2b { // class definition

    public static void main(String[] args) { // entry point of application

        Scanner input = new Scanner(System.in); // initialize scanner instance
		System.out.println("Enter A B C: "); // prompt user for input

        double a = input.nextDouble(); // declare and assign value to variable 'a'
        double b = input.nextDouble(); // ^
        double c = input.nextDouble(); // ^

        double d = Math.pow(b,2) -(4*a*c); // discriminant
        double pX = 0; // root 1 (positive)
        double nX = 0; // root 2 (negative)

        if (d < 0) { // discriminant is negative

            System.out.println("Roots: imaginary"); // display output to the user

        } else {
            // discriminant is  positive
            pX = (-b + Math.sqrt(Math.pow(b,2)-4*a*c)) / (2*a); // check this
            nX = (-b - Math.sqrt(Math.pow(b,2)-4*a*c)) / (2*a); // check this

            if(pX==nX) { // if both roots are the same
                System.out.printf("Root: %.2f", pX); // one output value
            } else { // if roots are different
                System.out.printf("Root: %.2f, %.2f", nX, pX); // two output values
            } // end of else
        } // end of else

        input.close(); // close scanner
    } // end of main
} // end of class 'PA2b'