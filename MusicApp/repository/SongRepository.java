package repository;

import java.util.ArrayList;
import java.util.List;

import model.Song;

public class SongRepository {
	private List<Song> songList = new ArrayList<>();
	
	public void addSong(Song song) {
		songList.add(song);
	}
	public List<Song> getAllSong(){
		return songList;
	}
	
	public Song getSongById(int id) {
		for (Song song : songList) {
			if(song.getId()==id)return song;
		}
		return null;
	}
	public boolean deleteSong(int id) {
		return songList.removeIf(song -> song.getId() == id);
	}
}
