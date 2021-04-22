package rg.howard.edu.lsp.exam.question42.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

 	/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
		if (genre == "" || songTitle == "") {
			return;
		}
		if (this.map.containsKey(genre)) {
			Set<String> currentSongs = this.map.get(genre);
			currentSongs.add(songTitle);
			this.map.replace(genre, currentSongs);
			return;
		}
		Set<String> newGenreSet = new HashSet<>(Arrays.asList(songTitle));
		this.map.put(genre, newGenreSet);
	}


	/* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
		if (this.map.containsKey(genre)) {
			return this.map.get(genre);
		}
		System.out.printf("Sorry, this song isn't a part of the database. But you should add it!");
		return new HashSet<String>(null);
	}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
    	for (Map.Entry<String, Set<String>> genreEntry: this.map.entrySet()) {
    		String genre = (String) genreEntry.getKey();
    		Set<String> genreSongs = (Set<String>) genreEntry.getValue();
    		if (genreSongs.contains(songTitle)) {
    			return genre;
    		}
    	}
    	System.out.printf("Sorry, this song isn't a part of the database. But you should add it!");
		return "Sorry, this song isn't a part of the database. But you should add it!";
	}


}
