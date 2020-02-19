package assessedlab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class PlaylistTestwithJUnit {
	
	@Rule 
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	void testPlayList() {
		
		Song firstone = new Song("abba","abba",2011);
		Song secondone = new Song("ebbe","abba",2017);
		Song thirdone = new Song("telibe","envagyok", 2011);
		
		PlayList newplaylist= new PlayList();
		
		try {
		newplaylist.addSong(firstone);
		newplaylist.addSong(secondone);
		newplaylist.addSong(thirdone);
		}catch(Exception e){
			
		};
		
		newplaylist.sorting();
		 
		Song[] list = newplaylist.getSong();
		
		assertEquals(firstone,list[0]);
		assertEquals(thirdone,list[1]);
		assertEquals(secondone,list[2]);
		
	}
	
	@Test
	void testSongAlreadyExistsException() {
		exception.expect(Exception.class);
		exception.expectMessage("Title already exists!");
		
		Song firstone = new Song("abba","abba",2011);
		Song secondone = new Song("abba","abba",2017);
		
		
		PlayList newplaylist= new PlayList();
		
		
		try {
			newplaylist.addSong(firstone);
			newplaylist.addSong(secondone);
			
			fail("Expected an exception to be thrown!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		
	}
	
	@Test
	void testListIsFullException() {
		
		exception.expect(Exception.class);
		exception.expectMessage("Already full");
		
		Song firstone = new Song("abba","abba",2011);
		Song secondone = new Song("ebbe","abba",2017);
		Song thirdone = new Song("telibe","envagyok", 2011);
		Song fourthone = new Song("amabba","amoba", 2013);
		
		
		PlayList newplaylist= new PlayList();
		
		
		try {
			newplaylist.addSong(firstone);
			newplaylist.addSong(secondone);
			newplaylist.addSong(thirdone);
			newplaylist.addSong(fourthone);
			
			fail("Expected an Exception to be thrown");
			
		} catch (Exception e) {
			
		}
		
	}
}
