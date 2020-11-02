/**
 * Author Lavanya Subbiah
 * date 30/10/2020
 * desc creating video class and extends mediaItem
 */
package Books;
import java.util.Scanner;
public class Video extends MediaItem{
	/*
	 * Parameterised constructor
	 */
	public Video(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
	}
	Scanner sc=new Scanner(System.in);
	/*
	 * declaring the attributes
	 */
	private String director;
	private String genre;
	private int yearReleased;
	/**
	 * getters and setters
	 * @return
	 */
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	@Override
	/**
	 * overriding addDetails
	 */
	public void addDetails() {
		super.addDetails();
		System.out.println("Enter the director name");
		this.director=sc.next();
		System.out.println("Enter the genre");
		this.genre=sc.next();
		System.out.println("Enter the released year");
		this.yearReleased=sc.nextInt();
	}
	@Override
	/**
	 * overriding printdetails
	 */
	public void printDetails() {
		super.printDetails();
		System.out.println("Director : "+getDirector());
		System.out.println("Genre : "+getGenre());
		System.out.println("Released year : "+getYearReleased());
	}
}
