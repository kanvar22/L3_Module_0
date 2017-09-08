package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		Stack<Double> doubbble = new Stack<Double>();
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			doubbble.push(r.nextDouble()* 100);
		}
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		String return1 = JOptionPane.showInputDialog(null, "Choose a number between 1 and 100.");
		String return2 = JOptionPane.showInputDialog(null, "Choose a number between 1 and 100.");
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		double cost1 = Double.parseDouble(return1);
		double cost2 = Double.parseDouble(return2);
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < 100; i++) {
			double double1 = doubbble.pop();
			if (double1 >= cost1 && double1 <= cost2) {
			System.out.println("The number that you printed was " + double1);
			}
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
