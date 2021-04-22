package org.howard.edu.lsp.exam.question42.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.howard.edu.lsp.exam.question42.implementation.SongDatabaseException;
import org.howard.edu.lsp.exam.question42.implementation.SongsDatabase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class SongsDatabaseTest {
	SongsDatabase songData = new SongsDatabase();
	
	final String RAP_SONG1 = "Savage";
	final String RAP = "Rap";
	final String RAP_SONG2 = "Gin and Juice";
	final String JAZZ = "Jazz";
	final String JAZZ_SONG = "Always There";
	final String EMPTY_ENTRY = "";
	final String R_AND_B = "R&B";
	final String R_AND_B_SONG = "Pick Up Your Feelings";
	
	@Before
	public void setUp() throws Exception {
		songData = new SongsDatabase();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@DisplayName("tests for add method in SongDatabase (including overriding a song that is being added to 2 different genres")
	public void testAdd() throws SongDatabaseException {
		Set<String> expected = new HashSet<String>(Arrays.asList("Savage"));
		songData.addSong(RAP, RAP_SONG1);
		assertEquals(expected, songData.getSongs(RAP));
		
		songData.addSong(RAP, RAP_SONG2);
		expected.add(RAP_SONG2);
		assertEquals(expected, songData.getSongs(RAP));
		
		songData.addSong(RAP, EMPTY_ENTRY);
		assertEquals(expected, songData.getSongs(RAP));
	}
	
	@Test
	@DisplayName("tests for get song method in SongDatabase (including exception)")
	public void testGetSongs() throws SongDatabaseException{
		songData.addSong(RAP, RAP_SONG1);
		songData.addSong(RAP, RAP_SONG2);
		songData.addSong(JAZZ, JAZZ_SONG);
	
		assertEquals(new HashSet<String>(Arrays.asList("Savage", "Gin and Juice")), songData.getSongs(RAP));
		assertEquals(new HashSet<String>(Arrays.asList("Always There")), songData.getSongs(JAZZ));
		
		Throwable exception = assertThrows(SongDatabaseException.class, () -> {songData.getSongs(R_AND_B);});
		assertEquals("Sorry, this song isn't a part of the database in this genre. But you should add it or try again!", exception.getMessage());
	
	}
	
	@Test
	@DisplayName("tests for get genre of song method in SongDatabase")
	public void testGetGenreOfSong() throws SongDatabaseException{
		songData.addSong(RAP, RAP_SONG1);
		songData.addSong(RAP, RAP_SONG2);
		songData.addSong(JAZZ, JAZZ_SONG);
	
		assertEquals(RAP, songData.getGenreOfSong(RAP_SONG1));
		assertNotEquals(JAZZ, songData.getGenreOfSong(RAP_SONG2));
		
		Throwable exception = assertThrows(SongDatabaseException.class, () -> {songData.getGenreOfSong(EMPTY_ENTRY);});
		assertEquals("Sorry, this song isn't a part of the database. But you should add it!", exception.getMessage());
		
		
	}
}
