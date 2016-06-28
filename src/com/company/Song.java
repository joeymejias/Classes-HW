package com.company;

import java.util.Scanner;

/**
 * Created by joey on 6/27/16.
 */
public class Song {
    String mSongName;
    String mArtistName;
    String mAlbumName;

    Scanner scanner = new Scanner(System.in);

    public Song(String songName, String artistName, String albumName){
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void play(){
        System.out.println("Now playing: " + mSongName + "by " + mArtistName + "from " + mAlbumName);
    }

    //Bonus
    public void setSongName(){
        mSongName = scanner.nextLine();
    }

    public void setArtistName(){
        mArtistName = scanner.nextLine();
    }

    public void setmAlbumName(){
        mAlbumName = scanner.nextLine();
    }
}
