/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alice Yu
 */
package base;
import java.util.Scanner;

/*
Exercise 14 - Tax Calculator
You don’t always need a complex control structure to solve simple problems. Sometimes a program requires an extra step in one case, but in all other cases there’s nothing to do.

Write a simple program to compute the tax on an order amount. The program should prompt for the order amount and the state. If the state is “WI,” then the order must be charged 5.5% tax. The program should display the subtotal, tax, and total for Wisconsin residents but display just the total for non-residents.

Example Output
What is the order amount? 10
What is the state? WI
The subtotal is $10.00.
The tax is $0.55.
The total is $10.55.
Or

What is the order amount? 10
What is the state? MN
The total is $10.00

Constraints
Implement this program using only a simple if statement—don’t use an else clause.
Ensure that all money is rounded up to the nearest cent.
Use a single output statement at the end of the program to display the program results.

Challenges
Allow the user to enter a state abbreviation in upper, lower, or mixed case.
Also allow the user to enter the state’s full name in upper, lower, or mixed case.
 */

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        double order = myApp.readInputDouble("What is the order amount? ");
        String state = myApp.readInputString("What is the state? ");

        if (state.equals("WI"))
        {
            double tax = order * 0.055;
            double total = tax + order;
            String outputString = ("The subtotal is $" + String.format("%.2f", order) + ".\nThe tax amount is $"
                    + String.format("%.2f", tax) + ".\nThe total is $" + String.format("%.2f", total) + ".");
            myApp.printOutput(outputString);
        }

        if (!state.equals("WI"))
        {
            String outputString = ("The total is $" + String.format("%.2f", order) + ".");
            myApp.printOutput(outputString);
        }
    }

    public double readInputDouble(String input)
    {
        System.out.print(input);
        String num = in.next();
        return Double.parseDouble(num);
    }

    public String readInputString(String input)
    {
        System.out.print(input);
        String string = in.next();
        return string;
    }

    public void printOutput(String input)
    {
        System.out.println(input);
    }
}
