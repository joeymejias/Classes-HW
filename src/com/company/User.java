package com.company;

import java.util.*;

/**
 * Created by joey on 6/27/16.
 */
public class User{
    String mName;
    HashMap<String, Playlist> mPlaylists;

    Scanner scanner = new Scanner(System.in);

    public User(String name){
        mName = name;
        mPlaylists = new HashMap<>();
    }

    public void addPlaylist(Playlist playlist){
        mPlaylists.put(playlist.getName(),playlist);
    }

    public Set<String>

    getAllPlaylistNames(){
        System.out.print("playlists: ");
        return mPlaylists.keySet();
    }

    public Playlist getPlaylistByName(String name){
        if (!mPlaylists.containsKey(name)) return null;

        return mPlaylists.get(name);
    }

    public void setName(){
        mName = scanner.nextLine();
    }

    public void removePlaylist(){
        mPlaylists.remove(scanner.nextLine());
    }
}
