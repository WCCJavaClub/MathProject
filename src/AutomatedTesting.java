
public class AutomatedTesting {
	// purpose of this method is to make sure that returnAnswers return the right values.
	
	public static void main(String[] args) {
		double[] answers1 = new double[2], answers2 = new double[2], answers3 = new double [2];


		answers1 = QuadraticEquationSolver.returnAnswers(1, 1, -30);
		answers2 = QuadraticEquationSolver.returnAnswers(2, -8, -24);
		answers3 = QuadraticEquationSolver.returnAnswers(1, -10, 21);

		assert answers1[0] == 5 && answers1[1] == -6;
		assert answers2[0] == 6 && answers2[1] == -2;
		assert answers3[0] == 7 && answers3[1] == 3;

		System.out.println("Automated test successful");


	}

}
