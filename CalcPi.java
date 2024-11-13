// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int times = Integer.parseInt(args[0]);
		
		// Prints the value of PI
		System.out.println("pi according to Java: " + Math.PI);

	    // Calculate pi sum
		double piSum = 0.0;
		for (int i = 0; i < times; i++) {
			// Add or subtract based on the term's position
			double term = Math.pow(-1, i) / (2 * i + 1);
			piSum += term;
		}

		// Multiply the sum by 4 to get the approximation of π
		piSum = piSum * 4;

		System.out.println("pi, approximated:     " + piSum);

	}
}
