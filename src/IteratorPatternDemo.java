import com.DesignPattern.Behavioral.Iterator.Playlist;
import com.DesignPattern.Behavioral.Iterator.Song;

import java.util.Iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        Playlist playlist = new Playlist(5);
        playlist.addSong(new Song("Imagine", "John Lennon"));
        playlist.addSong(new Song("Hey Jude", "The Beatles"));
        playlist.addSong(new Song("Bohemian Rhapsody", "Queen"));
        playlist.addSong(new Song("Hotel California", "Eagles"));
        playlist.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));

        Iterator<Song> iterator = playlist.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            playSong(song);
        }
    }

    public static void playSong(Song song) {
        System.out.println("Playing: " + song);
    }
}
