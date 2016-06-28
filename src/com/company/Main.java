package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Joey");

        Song song1 = new Song("song 1 ", "artist 1 ", "album 1");
        Song song2 = new Song("song 2 ", "artist 2 ", "album 2");
        Song song3 = new Song("song 3 ", "artist 3 ", "album 3");
        Song song4 = new Song("song 4 ", "artist 4 ", "album 4");
        Song song5 = new Song("song 5 ", "artist 5 ", "album 5");

        Playlist playlist1 = new Playlist("playlist1");
        Playlist playlist2 = new Playlist("playlist2");

        playlist1.addSong(song1);
        playlist1.addSong(song3);
        playlist1.addSong(song5);
        playlist2.addSong(song2);
        playlist2.addSong(song4);

        user1.addPlaylist(playlist1);
        user1.addPlaylist(playlist2);

        System.out.println(user1.getAllPlaylistNames());
        System.out.println(user1.getPlaylistByName("playlist"));

        System.out.println(playlist1.getName());
        playlist1.playAll();
        System.out.println(playlist2.getName());
        playlist2.playAll();

        System.out.println("Song Name:");
        song1.setSongName();
        System.out.println(song1.mSongName);

        System.out.println("Artist Name:");
        song1.setArtistName();
        System.out.println(song1.mArtistName);

        System.out.println("Album Name:");
        song1.setmAlbumName();
        System.out.println(song1.mAlbumName);

        System.out.println("Playlist Name:");
        playlist1.setName();
        System.out.println(playlist1.mName);

        System.out.println("User Name:");
        user1.setName();
        System.out.println(user1.mName);

        System.out.println("User Name to remove:");
        user1.removePlaylist();
        System.out.println(user1.mName);
    }
}
