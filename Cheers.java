// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheeringWord = args[0].toUpperCase();
                int times = Integer.parseInt(args[1]);

                // For loop that covers all the letters and indicate if before the letter should be "a" or "an"
                for (int i=0; i<cheeringWord.length(); i++) {
                        char letter = cheeringWord.charAt(i);
                        if (letter == 'A' || letter == 'E' || letter == 'F' || letter == 'H' || letter == 'I' || letter == 'L' || letter == 'M' || letter == 'N' || letter == 'O' || letter == 'R' || letter == 'S' || letter == 'X' ) {
                                System.out.printf("Give me an %s: %s! %n", letter, letter);
                        } else {
                                System.out.printf("Give me a %s: %s !%n", letter, letter);
                        }
                }

                System.out.println("What does that spell? ");
                int j = 0;

                // While loop that prints the given word, the amount of time given
                while (j < times) {
                        System.out.println(cheeringWord + "!!!");
                        j++;
                }
        }
}
