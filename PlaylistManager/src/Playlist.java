import java.util.List;

public class Playlist {

	private List<Song> songList = new MyDoubleLinkedList<>();
	
	public static void main(String[] args) {
		Playlist playlist = new Playlist();
		playlist.songList.add(new Song("", ""));
		System.out.println(playlist.songList);
	}
}
