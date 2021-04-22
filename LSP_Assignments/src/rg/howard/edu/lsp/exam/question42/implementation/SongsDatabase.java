package rg.howard.edu.lsp.exam.question42.implementation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

 	/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
			//Code it!!
	}


	/* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
    		// Code it!!
		return new HashSet<String>();
	}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
    			// Code it!!
		return "filler";
	}


}
