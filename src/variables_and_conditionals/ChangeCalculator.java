package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
String Nickels = JOptionPane.showInputDialog(null, "How many nickels do you have?");
        // Convert their answer to an int using Integer.parseInt()
int Nickel = Integer.parseInt(Nickels);
        // Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
int dime = Integer.parseInt(dimes);
        // Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");
int quarter = Integer.parseInt(quarters);
        // Calculate how much money the user has and save it in a double variable 
double totalnickels = (double)(Nickel * 0.05);
double totaldimes = (double)(dime * 0.10);
double totalquarters = (double)(quarter * 0.25);
        // Tell the user how much money they have
double total = totaldimes + totalnickels + totalquarters; 
JOptionPane.showMessageDialog(null, "You have won! $" + (total));
    }
}