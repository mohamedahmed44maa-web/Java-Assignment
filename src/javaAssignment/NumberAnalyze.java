package javaAssignment;

import java.util.Scanner;

public class NumberAnalyze {
/*
 * Prints the numbers from 1 to 10 descending
 * @return i=the numbers from 1 to 10.
 */
    public static void printing(){
        for (int i=10;i>0;i--)
        {
            System.out.println(i);
        }
    }
/*
 * Check number if even or odd.
 * Prints the numbers from 1 to 10 .
 * Indicates whether each number is even or odd.
 * @return i=the numbers from 1 to 10 + each parity of it.
 */
    public static void printevenorodd(){
        for (int i=1;i<11;i++)
        {
            if (i%2==0)
            {
                System.out.println(i+"->Even");
            }
            else System.out.println(i+"->Odd");

        }
    }
/*
 * Ask the user to enter a number .
 * Determines whether the entered value is positive, negative, or zero.
 * @param scanner A used to receive user input for the number.
 * @param check used to save the scanner in it.
 * @return which the number is positive,negative or zero.
 */
    public static String check(){
        System.out.println("Enter The Number U Want To Check");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        if (number>0)
            return "Positive";
        else if (number<0) {
            return "Negative";
        }
        else
            return "Zero";
    }

/*
 * Calculates the sum of two integer values.
 * @param firstnumber the first number to be added by user.
 * @param secondnumber the second number to be added by user.
 * @return result=the total result after adding both numbers.
 */
    public static int calculateSum(int firstnumber,int secondnumber){
        int result=firstnumber+secondnumber;
        return result;
    }

    /*
     * Starts the Number Analyzer application.
     * Display a menu that allows the user to access different number-related operations until the exit option is selected.
     * @param Choice take the input number which related to specific operation.
     * Different classes to perform number-related operations.
     * The menu continue to be displayed until the user selects the exit option.
     */
    static void main() {
        Scanner input = new Scanner(System.in);
        int Choice;
        do {
            System.out.println("====================");
            System.out.println("Number Analyzer Menu");
            System.out.println("====================");
            System.out.println("1-Print Numbers From 10 to 1");
            System.out.println("2-Print Even/Odd Report");
            System.out.println("3-Check Number Type");
            System.out.println("4-Calculate Sum Between Two Numbers");
            System.out.println("5-Exit");
            Choice = input.nextInt();
            switch (Choice) {
                case 1:
                    printing();
                    break;
                case 2:
                    printevenorodd();
                    break;
                case 3:
                    System.out.println(check());
                    break;
                case 4:
                    Scanner inputnum=new Scanner(System.in);
                    System.out.println("Enter First Number:");
                    int firstnumber=inputnum.nextInt();
                    System.out.println("Enter Second Number:");
                    int secondnumber=inputnum.nextInt();
                    System.out.println("Sum="+calculateSum(firstnumber,secondnumber));
                    break;
                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        } while (Choice != 5);
    }
}
