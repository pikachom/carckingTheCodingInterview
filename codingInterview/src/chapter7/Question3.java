package chapter7;

import java.util.ArrayList;

public class Question3 {
	/* components list
	 * 	current state
	 * 		playing / ready
	 * 		song
	 * 	playlist
	 * 		list title
	 * 		cd list
	 * 		song name list
	 * 		total playtime
	 * 	cd collection
	 * 		cd
	 * 	cd
	 * 		cd title
	 * 		song list
	 * 	song
	 * 		artist
	 * 		title
	 * 		length
	 * ================
	 * action list
	 * 	playlist
	 * 		play from first song
	 * 		play from certain song
	 * 	currentState	
	 * 		skip this song
	 * 		stop this song
	 * 		play this song 
	 * */
}
class JukeBox{
	ArrayList<CD> CdCollection;
	ArrayList<Playlist> playlists;
	CurrentState state;
	
	public JukeBox() {
		CdCollection = new ArrayList<CD>();
		playlists = new ArrayList<Playlist>();
		state = new CurrentState();
	}
	void addCd2Collection(CD c){
		///
	}	
	class CurrentState{
		Playlist currentPlaylist;
		Song currentSong;
		jukeBoxState playingState;
		public CurrentState() {
			this.currentSong = null;
			this.playingState = jukeBoxState.paused;
		}
		
	}
	void playSong(){
		///
	}
	void skipSong() {
		///
	}
	void pauseSong() {
		///
	}
	void showState() {
		System.out.println("Playlist Name : " + state.currentPlaylist.playlistTitle);
		System.out.println("Song Title : " + state.currentSong.songTitle);
		System.out.println("State : " + state.playingState);
	}
	
}
class Song{
	String songTitle;
	String artist;
	int secLength;	
}
class Playlist{
	String playlistTitle;
	ArrayList<CD> CdList;
	ArrayList<String> songNameList;
	int totalPlayTime = 0;
	public Playlist(String s) {
		this.playlistTitle = s;
		this.CdList = new ArrayList<CD>();
		this.songNameList = new ArrayList<String>();
	}
	void addCd2Playlist(CD c) {
		///
	}
	void playFromFirstSong() {
		///
	}
	void playFromCertainSong(String songName) {
		///
	}
	
}
class CD{
	String Cdtitle;
	ArrayList<Song> songList;
	public CD(String t) {
		this.Cdtitle = t;
		this.songList = new ArrayList<Song>();
	}
	
}


enum jukeBoxState{
	playing, paused;
}