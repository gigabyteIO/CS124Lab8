import midi.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MidiPlayer {

	public static void main(String[] args) {

		menuHandler(displayMenuAndHandleInput());

	}

	/**
	 * 
	 * @return
	 */
	public static int displayMenuAndHandleInput() {

		Scanner in = new Scanner(System.in);
		int userChoice = 0;
		boolean isInt = false;

		System.out.println("What do you want to do?\n");
		System.out.println(" 0.  EXIT");
		System.out.println(" 1.  Select an instrument.");
		System.out.println(" 2.  Select a volume.");
		System.out.println(" 3.  Play some notes.");
		System.out.println(" 4.  Enter some notes for a tune.");
		System.out.println(" 5.  Make up a randome tune.");
		System.out.println(" 6.  Play the tune.\n");

		do {

			System.out.print("Enter the number of your choice: ");
			isInt = in.hasNextInt();
			

			if (isInt) {
				userChoice = in.nextInt();
				if(userChoice > 6 || userChoice < 0) {
					System.out.println("Invalid input. Enter an integer from 0 to 6.\n");
				}
			}
			else
				System.out.println("Invalid input. Character's not allowed.\n");
				in.nextLine();

		} while (!isInt || userChoice > 6 || userChoice < 0);

		return userChoice;

	} // end displayMenuAndHandleInput()

	/**
	 * 
	 * @param userChoice
	 */
	public static void menuHandler(int userChoice) {

		switch (userChoice) {

		case 1:
			selectInstrument();
		case 2:
			selectVolume();
		case 3:
			playNotes();
		case 4:
			notesForTune();
		case 5:
			randomTune();
		case 6:
			playTune();
		default:
			exit();

		}

	} // end menuHandler()

	/**
	 * 
	 */
	public static void exit() {
		System.out.println("Exiting... Have a nice day!");
		System.exit(0);
	} // end exit()

	/**
	 * 
	 */
	public static void selectInstrument() {

	} // end selectInstrument()

	/**
	 * 
	 */
	public static void selectVolume() {

	} // end selectVolume()

	/**
	 * 
	 */
	public static void playNotes() {

	} // end playNotes()

	/**
	 * 
	 */
	public static void notesForTune() {

	} // end notesForTune()

	/**
	 * 
	 */
	public static void randomTune() {

	} // end randomTune()

	/**
	 * 
	 */
	public static void playTune() {

	} // end playTune()
}
