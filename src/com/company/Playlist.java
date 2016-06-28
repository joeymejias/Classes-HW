package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by joey on 6/27/16.
 */
public class Playlist{
    String mName;
    ArrayList<Song> mSongs;

    Scanner scanner = new Scanner(System.in);

    public Playlist(){
        super();
    }

    public Playlist(String name){
        mName = name;
        mSongs = new ArrayList<>();
    }

    public String getName(){
        return mName;
    }

    public void addSong(Song song){
        mSongs.add(song);
    }

    public void setName(){
        mName = scanner.nextLine();
    }

    public void playAll(){
        for (Song song : mSongs) {
            song.play();
        }
    }
}
