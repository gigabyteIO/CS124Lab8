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
		
		noteNumber = number;
		noteDuration = duration;
		
	}
	
	/**
	 * 
	 * @param synth
	 */
	public void play(SimpleSynth synth) {
		synth.noteOn(noteNumber); // Turn on the i-th note in the tune.

		try {
			Thread.sleep(1000); // Delay to give the note a chance to play.
		} catch (InterruptedException e) {
		}

		synth.noteOff(noteNumber); // Turn off the same note.
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
