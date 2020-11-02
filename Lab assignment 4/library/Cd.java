/**
 * Author Lavanya Subbiah
 * Date 30/10/2020
 * desc creating cd class and extends mediaItem
 */
package Books;
import java.util.*;
public class Cd extends MediaItem{
	/*
	 * Paramterised constructor
	 */
	public Cd(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
	}
	Scanner sc=new Scanner(System.in);
	/**
	 * declaring private attributes
	 */
	private String artist;
	private String genre;
	/**
	 * getters and setters
	 * @return
	 */
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * overriding addDetails
	 */
	@Override
	public void addDetails() {
		super.addDetails();
		System.out.println("Enter the artist name");
		this.artist=sc.next();
		System.out.println("Enter the genre");
		this.genre=sc.next();
	}
	/**
	 * overridding printDetails
	 */
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Artist : "+getArtist());
		System.out.println("Genre : "+getGenre());
	}

}
