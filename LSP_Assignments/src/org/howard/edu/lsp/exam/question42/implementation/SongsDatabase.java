package org.howard.edu.lsp.exam.question42.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

 	/** 
 	 * Add a song title to a genre
 	 * If the genre doesn't exist add it to the song database with the new song
 	 * 
 	 * @param genre String title of music genre
 	 * @param songTitle String title of the song to be categorized with genre
 	 *  */
	public void addSong(String genre, String songTitle){
		if (genre == "" || songTitle == "") {
			return;
		}
		
		if (this.map.containsKey(genre)) {
			Set<String> currentSongs = this.map.get(genre);
			currentSongs.add(songTitle);
			this.map.replace(genre, currentSongs);
			return;
		}
		
		Set<String> newGenreSet = new HashSet<String>(Arrays.asList(songTitle));
		this.map.put(genre, newGenreSet);
	}


	/** 
	 * Return the Set that contains all songs for a genre
	 * If the genre doesn't exist in the database throws an exception and print out a message 
	 *
	 * 
	 * @param genre String name of music genre for songs
	 * 
	 * @return songs Set<String> set of songs categorized with the given genre
	 *  */
	public Set<String> getSongs(String genre) throws SongDatabaseException {
		if (this.map.containsKey(genre)) {
			return this.map.get(genre);
		}
		throw new SongDatabaseException("Sorry, this song isn't a part of the database in this genre. But you should add it or try again!");
	}

	/**
	 * Return genre, i.e., jazz, given a song title
	 * If the song is not in the database return a message
	 * 
	 * @param songTitle String title of the song for the genre query
	 * 
	 * @return genre String title of the genre of the given song 
	 *  */
	public String getGenreOfSong(String songTitle) throws SongDatabaseException{
    	for (Map.Entry<String, Set<String>> genreEntry: this.map.entrySet()) {
    		String genre = (String) genreEntry.getKey();
    		Set<String> genreSongs = (Set<String>) genreEntry.getValue();
    		if (genreSongs.contains(songTitle)) {
    			return genre;
    		}
    	}
    	throw new SongDatabaseException("Sorry, this song isn't a part of the database. But you should add it!");
	}


}
