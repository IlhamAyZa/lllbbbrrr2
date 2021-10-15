package trackPlay;

import trackPlay.Artist;

public class Song {
	private String title;
	private Artist artist;
	private int duratio;
	private double cost;
	
	public Song(String title, Artist artist, int duratio, double cost) {
		this.title = title;
		this.artist = artist;
		this.duratio = duratio;
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public int getDuratio() {
		return duratio;
	}

	public void setDuratio(int duratio) {
		this.duratio = duratio;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return title;
	}
	
}
