package service;

import exception.SongNotFoundException;
import repository.SongRepository;
import model.Song;
import java.util.List;

public class SongService {
	private SongRepository songRepository;
	
	public SongService() {
		songRepository=new SongRepository();
	}
	
	public void addSong(Song song) {
		songRepository.addSong(song);
	}
	
	public List<Song> getAllSong(){
		return songRepository.getAllSong();
	}
	
	public Song getSongById(int id) {
		 Song song = songRepository.getSongById(id);
		 if(song==null) {
			 throw new SongNotFoundException("Song with ID " + id + " not found.");
		 }
		return song;
		
	}
	
	public void deleteSong(int id) {
		boolean removed =songRepository.deleteSong(id);
		 if (!removed) {
	            throw new SongNotFoundException("Cannot delete. Song with ID " + id + " not found.");
	        }
	}
	
	 public void updateSong(int id, Song updatedSong) {
	        Song existingSong = songRepository.getSongById(id);
	        if (existingSong == null) {
	            throw new SongNotFoundException("Cannot update. Song with ID " + id + " not found.");
	        }
	        existingSong.setSong(updatedSong.getSong());
	        existingSong.setYear(updatedSong.getYear());
	 }
}
