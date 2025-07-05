package model;

public class Song {
	private int id;
	private String song;
	private int year;

	public Song(int id, String song, int year) {
		super();
		this.id = id;
		this.song = song;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public String getSong() {
		return song;
	}

	public int getYear() {
		return year;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return " id=" + id + ", song=" + song + ", year=" + year;
	}

}
