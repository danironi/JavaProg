package assessedlab;

public class PlayListTest {
	public static void main(String[] args) {
		PlayList playlist = new PlayList();
		
		while(true) {
			//Handling exception of typing anything else rather than an integer
			try {
				String s = "Enter one of the following commands: \n" + "1 - ADD song to list \n"+
				"2 - Display songs \n" +"3 - Sort by year \n"+ "5 - Quit \n";
			
			    int option = Input.getInteger(s);
			
			    
			    
				switch(option) {
				
					case 1:
						try {
							String title = Input.getString("Enter song title: ");
							String artist = Input.getString("Enter song artist: ");
							int year = Input.getInteger("Enter song year: ");
							
							playlist.addSong(title, artist, year);
							
							continue;
						}
						catch(Exception e) {
							System.out.println(e.getMessage());
							continue;
						}
					case 2: 
						playlist.displaySongs();
						continue;
					case 3:
						playlist.sorting();
						continue;
					case 5:
						break;
					//Instead of exception handling a put the default to handle option number out of range
					default:
						System.out.println("Enter the right menu option");
						continue;
				}
			}
			catch(Exception e){
				System.out.println("Enter the right menu option");
				continue;
			}	
			
			break;
		}
	}
}