
public class Song {
	private String artist;
	private String title;
	
	public Song(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title + ", " + artist;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		
		Song song = (Song) obj; // cast as song
		return artist.equals(song.artist) && title.equals(song.title);
	}
}
