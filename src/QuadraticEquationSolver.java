import java.util.Scanner;


public class QuadraticEquationSolver {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		double [] unpackAnswers = new double[2];
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is the value of 'a' ?");
		a = keyboard.nextDouble();
		System.out.println("What is the value of 'b' ?");
		b = keyboard.nextDouble();
		System.out.println("What is the value of 'c' ?");
		c = keyboard.nextDouble();
		
		// unpack the answers
		unpackAnswers = returnAnswers(a, b, c);
		
		System.out.println("Answers: ");
		System.out.println("x1 = " + unpackAnswers[0]);
		System.out.println("x2 = " + unpackAnswers[1]);
		
		keyboard.close();
	}

	public static double[] returnAnswers (double a, double b , double c){
		double [] answers = new double[2];
		double x1 = 0.0, x2 = 0.0;

		x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		answers [0] = x1;
		answers [1] = x2;
		
		// pack the answers into an array
		return answers;

	}

}
