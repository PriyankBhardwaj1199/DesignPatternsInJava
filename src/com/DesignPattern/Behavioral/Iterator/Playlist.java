package com.DesignPattern.Behavioral.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Playlist implements Iterable<Song> {

    private Song[] songs;
    private int index;

    public Playlist(int size) {
        songs = new Song[size];
        index = 0;
    }

    public void addSong(Song song) {
        if (index < songs.length) {
            songs[index++] = song;
        }
    }

    @Override
    public Iterator<Song> iterator() {
        return new SongIterator();
    }

    class SongIterator implements Iterator<Song> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < songs.length && songs[currentIndex] != null;
        }

        @Override
        public Song next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return songs[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }
}



