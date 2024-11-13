// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    
		int highestSeed = Integer.parseInt(args[0]);
		String mode = args[1];

		int oneCount = 1;

		for (int i = 1; i <= highestSeed; i++) {
            int currentNum = i;
            int count = 0;

            if (mode.equals("v")) {
                // Print the starting seed value
                System.out.print(currentNum + " ");
                
                // Handle the case where the seed is already 1
                if (currentNum == 1) {
					while (oneCount != 2) {
						if (currentNum % 2 == 0) {
							currentNum = currentNum / 2;
						} else {
							currentNum = currentNum * 3 + 1;
						}
						System.out.print(currentNum + " ");
						count++;
						if (currentNum == 1) {
							oneCount++;
						}
					}
                }

                // Generate the hailstone sequence until we reach 1
                while (currentNum != 1) {
                    if (currentNum % 2 == 0) {
                        currentNum = currentNum / 2;
                    } else {
                        currentNum = currentNum * 3 + 1;
                    }
                    System.out.print(currentNum + " ");
                    count++;
                }
                // Print the number of steps
                System.out.println("(" + (count + 1) + ")");		
			}
		}	
		System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
	}
}
