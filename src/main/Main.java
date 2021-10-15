package main;

/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted at the course website and (3) any study notes handwritten by myself.
I have not used, accessed or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: <Ilham Aydazada, 0074562>
********************************************************************************/


import trackPlay.Artist;
import trackPlay.Song;
import trackPlay.Playlist;

public class Main {
	public static void main(String[] args) {
		
		
		Artist Sting = new Artist("Sting");
		Artist Ebru = new Artist("Ebru");
		
		
		Song Shape = new Song("Shape of my heart", Sting, 100, 5);
		Song Desert = new Song("Desert Rose", Sting, 98, 4.8);
		Song Man = new Song("Englishman in new york", Sting, 87, 3.7);
		Song Day = new Song("Brand new day", Sting, 88, 2.3);
		
		Song es1 =new Song("Cingenem", Ebru, 89, 4);
		Song es2 = new Song("Yaparim bilirsin", Ebru, 78, 3);
		Song es3 = new Song ("Cennet", Ebru, 82, 5);
		Song es4 = new Song("Harika", Ebru, 81, 2.2);
		
		
		Playlist pl1 = new Playlist("List1" , "Emir");
		Playlist pl2 = new Playlist("List2" , "Hazal");
		Playlist pl3 = new Playlist("List3" , "Muhammet");
		
		pl1.addSong(Shape);
		pl1.addSong(Man);
		pl1.addSong(es3);
		
		pl2.addSong(es4);
		pl2.addSong(Shape);
		pl2.addSong(Day);
		
		pl3.addSong(Shape);

		printSongNamesOfArtist("Sting", pl1);
		printSongNamesOfArtist("Ebru", pl1);
		printSongNamesOfArtist("Sting", pl2);
		printSongNamesOfArtist("Ebru", pl2);
		printSongNamesOfArtist("Sting", pl3);
		printSongNamesOfArtist("Ebru", pl3);

		System.out.println();

		printAvgSongsCost(pl1);
		printAvgSongsCost(pl2);
		printAvgSongsCost(pl3);
		
	}

	public static void printSongNamesOfArtist(String artistName, Playlist playlist) {
		System.out.println("-----------------------------------------");
		System.out.println(artistName + "'s songs from the playlist:");
		for (Song song : playlist.getSongArray()) {
			if(song == null) {
				
			}			
			else if (song.getArtist().getName()  == artistName){
				System.out.println("   " + song);
			}
		}
		System.out.println("-----------------------------------------");
		
	}
	
	public static void printAvgSongsCost(Playlist songsList) {
		double averageCost = songsList.Price() / songsList.getNumSongs();
		String label;
		
		if(averageCost <= 4) {
			label = "D";
		}
		else if(4 < averageCost && averageCost <= 8) {
			label = "C";
		}
		else if(8 < averageCost && averageCost <= 12) {
			label = "B";
		}
		else {
			label = "A";
		}
		
		System.out.println("PlayList: " + songsList.getName());
		System.out.println("         Label: " + label);
		System.out.println("         Total cost: " + songsList.Price());
		System.out.println("         Average cost: " + averageCost);
	}
}
