package assessedlab;

public class Song implements Comparable<Song>{
	private String title;
	private String artist;
	private int year;
	
	public Song(String title, String artist, int year) {
		
		this.title = title;
		this.artist = artist;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return this.getTitle()+"\t"+this.getArtist()+"\t\t"+this.getYear();
	}
	
	@Override
	public int compareTo(Song arg0) {
		
		if(this.year > arg0.year) {
			return 1;
		}
		else if (this.year < arg0.year) {
			return -1;
		}
		else {
			return this.title.compareToIgnoreCase(arg0.title);
				
			
		}
	
	}
}
