package assessedlab;

public class PlayList {
	private Song[] songs;
	
	public PlayList() {
		songs = new Song[3];
	}
	
	public Song[] getSong() {
		return this.songs;
	}
	
	public void addSong(String title, String artist, int year) throws Exception {
		Song newsong = new Song(title, artist, year);
		
		addSong(newsong);
	}
	
	public void addSong(Song newsong) throws Exception {
		
		for(int i = 0; i < songs.length;i++) {
			if(songs[i]==null ) {
				songs[i]=newsong;
				return;
			}
			else if(songs[i]!=null && songs[i].getTitle().equals(newsong.getTitle())) {
				throw new Exception("Title already exists!");
			}
			else if(songs[songs.length-1]!=null) {
				throw new Exception("Already full");
			}
		}
	}
	
	public void displaySong(int tracknumber) {
		System.out.println(songs[tracknumber]);
	}
	
	
	public void displaySongs() {
		System.out.println("TITLE"+"\t"+"ARTIST"+"\t\t"+"YEAR");
		
		for(int i = 0; i < songs.length;i++) {
			if(songs[i]!=null) {
				displaySong(i);
			}
		}
	}
	
	public void sorting() {
		InsertionSort.sort(songs);
	}
}
