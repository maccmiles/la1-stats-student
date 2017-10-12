package edu.wit.cs.comp1000;
import java.util.Scanner;
/**
 * LA1a
 * @author Miles Macchiaroli
 *
 */
public class LA1a {
	/**
	 * This Program Calculates sum, mean, and standard deviation
	 * for five numbers
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//INT Vars
		double in0, in1, in2, in3, in4, sum, mean, dev;
		// Begin
		System.out.printf("Enter five numbers: ");
		in0 = input.nextDouble();
		in1 = input.nextDouble();
		in2 = input.nextDouble();
		in3 = input.nextDouble();
		in4 = input.nextDouble();
		// Calculate
		sum = (in0 + in1 + in2 + in3 + in4);
		mean = (sum / 5);
		dev = Math.sqrt(((Math.pow((in0 - mean), 2)) + (Math.pow((in1 - mean), 2)) + (Math.pow((in2 - mean), 2)) + (Math.pow((in3 - mean), 2)) + (Math.pow((in4 - mean), 2)))/(5));
		//Print
		System.out.printf("Sum: %.2f%n", sum);
		System.out.printf("Mean: %.2f%n", mean);
		System.out.printf("Population Standard Deviation: %.2f%n", dev);
		//End
	}

}
