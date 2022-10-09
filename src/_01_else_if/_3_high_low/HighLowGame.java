
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		for (int i=0; i<10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String guesssave = JOptionPane.showInputDialog("Make a guess from of a number from 0-100, you have 10 tries to guess what number im thinkng of.");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guess = Integer.parseInt(guesssave);
			// 5. if the guess is correct
			if (guess == random) {
				JOptionPane.showMessageDialog(null, "GG, you win");
				System.exit(0);
			}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if (random < guess) {
				JOptionPane.showMessageDialog(null, "Too high!");
			}
				// 8. Tell them it's too high
			// 9. if the guess is low
			if (guess < random) {
				JOptionPane.showMessageDialog(null, "Too low.");
			}
				// 10. Tell them it's too low

		// 13. Tell them they lose
		}
		JOptionPane.showMessageDialog(null, "You lose!");
	}

}


