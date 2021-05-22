package midi;

import java.util.ArrayList;

/**
 * 
 * @author marti
 *
 */
public class Tune {
	
	private ArrayList<Note> noteList;
	
	/**
	 * 
	 */
	public Tune() {
		noteList = new ArrayList<Note>();
	}
	
	
	/**
	 * 
	 * @param note
	 */
	private void add(Note note) {
		noteList.add(note);
	}
	
	/**
	 * 
	 * @param synth
	 */
	private void play(SimpleSynth synth) {
		
		for(int i = 0; i < noteList.size() - 1; i++) {
			synth.noteOn(noteList.get(i).getNoteNumber());
		}
	}

}
