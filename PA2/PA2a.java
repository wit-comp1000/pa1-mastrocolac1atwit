package CW.PA;
//import scanner
import java.util.Scanner;
public class PA2a {
    public static void main(String[] args) {
        //take in user input and assign it to a variable
        Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers:  ");
        int N1 = input.nextInt();
        int N2 = input.nextInt();
        int N3 = input.nextInt();
        int N4 = input.nextInt();
        int N5 = input.nextInt();
        //close scanner to eliminate pop ups
        //Java.util.Scanner.close();
        //establish veriable so that it works
        int P5 = 0;
        int P1 = 0;
        int P2 = 0;
        int P4 = 0;
        int P3 = 0;
        int P = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;

        //use if statements to determine if veriable is positive or negative
        if (N1>=0){
            P1 = N1;
            P ++;
        }
        else{
            n1=N1;
        }
        if (N2>=0){
            P2 = N2;
            P ++;
        }
        else{
            n2=N2;
        }
        if (N3>=0){
            P3 = N3;
            P ++;
        }
        else{
            n3=N3;
        }
        if (N4>=0){
            P4 = N4;
            P ++;
        }
        else{
            n4 = N4;
        }
        if (N5>=0){
            P5 = N5;
            P ++;
        }
        else{
            n5=N5;
        }
        // area here is used for sum
        int psum = P1 + P2 + P3 + P4 + P5;
        int nsum = n1 + n2 + n3 + n4 + n5;
        int sum = N1 + N2 + N3 + N4 + N5;

        //print out sum
        System.out.println("The sum of the positive numbers (greater then zero): " + psum);
        System.out.println("The sum of the negative numbers (less than or equal to zero): " + nsum);
        System.out.println("The sum of all five numbers: " + sum);

        //find average
        //create veriablbes to do so
        double pav =0;
        double nav =0;
        double av =0;
        
        //add in cheker to not devide by 0
        if(P>0){
            pav = psum / P;}
        else{
            nav = nsum/(5-P);
        }
            av = sum/5;
        //print it all out
        System.out.println("The average of the positive numbers (greater then zero): " + pav);
        System.out.println("The average of the negative numbers (less than or equal to zero): " + nav);
        System.out.println("The average of all five numbers: " + av);

}}
