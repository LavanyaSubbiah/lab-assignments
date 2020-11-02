/**
 * Author Lavanya subbiah
 * date 30/10/2020
 * desc creating abstract class writtenItem and extending item
 */
package Books;
import java.util.Scanner;
public abstract class WrittenItem extends Item{
	/**
	 * Parameterised constructor
	 * @param identificationNumber
	 * @param title
	 * @param numberOfCopies
	 */
	public WrittenItem(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
	}
	Scanner sc=new Scanner(System.in);
	/**
	 * declaring the attributes
	 */
    private String author;
    /**
     * getters and setters
     * @return
     */
    public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	/**
	 * overriding adddetails
	 */
	public void addDetails() {
		System.out.println("Enter the identification number");
		int idNum=sc.nextInt();
		setIdentificationNumber(idNum);
		System.out.println("Enter the title");
		String title=sc.next();
		setTitle(title);
		System.out.println("Enter the number of copies");
		int numOfCopies=sc.nextInt();
		setNumberOfCopies(numOfCopies);
		System.out.println("Enter the author name");
		this.author=sc.next();
	}
	/**
	 * overriding printdetails
	 */
	@Override
	public void printDetails() {
		System.out.println("Identification Number : "+getIdentificationNumber());
		System.out.println("Title : "+getTitle());
		System.out.println("Number of copies : "+getNumberOfCopies());
		System.out.println("Author : "+getAuthor());
	}
}
