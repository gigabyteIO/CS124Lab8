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
	public void add(Note note) {
		noteList.add(note);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getSize() {
		return noteList.size();
	}
	
	/**
	 * 
	 * @param synth
	 */
	public void play(SimpleSynth synth) {
		
		for(int i = 0; i < noteList.size(); i++) {
			noteList.get(i).play(synth);
		}
	}

}
