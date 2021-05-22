package midi;

/**
 * 
 * @author marti
 *
 */
public class Note {

	private final int noteNumber;
	private final int noteDuration;

	public Note(int number, int duration) {

		if ((number < -1 || number > 127) || (duration < 0 || duration > 5000))
			throw new IllegalArgumentException(
					"Note number must be between from -1 to 127 and note duration should be between 0 and 5000 milliseconds");

		noteNumber = number;
		noteDuration = duration;

	}

	/**
	 * 
	 * @param synth
	 */
	public void play(SimpleSynth synth) {

		if (noteNumber >= 0 && noteNumber <= 127) {
			synth.noteOn(noteNumber); // Turn on the i-th note in the tune.

			try {
				Thread.sleep(noteDuration); // Delay to give the note a chance to play.
			} catch (InterruptedException e) {
			}

			synth.noteOff(noteNumber); // Turn off the same note.
		}
		else if (noteNumber == -1) {
			try {
				Thread.sleep(noteDuration); // Delay to give the note a chance to play.
			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getNoteNumber() {
		return noteNumber;
	}

	/**
	 * 
	 * @return
	 */
	public int getNoteDuration() {
		return noteDuration;
	}

}
