/**
 * author Lavanya Subbiah
 * date 30/10/2020
 * desc creating abstract class mediaItem and extends Item
 */
package Books;
import java.util.*;
public abstract class MediaItem extends Item{
	/**
	 * Paramterised constructor
	 * @param identificationNumber
	 * @param title
	 * @param numberOfCopies
	 */
	 public MediaItem(int identificationNumber, String title, int numberOfCopies) {
			super(identificationNumber, title, numberOfCopies);
			
		}
	    Scanner sc=new Scanner(System.in);
	    /*
	     *declaring the attributes 
	     */
	    private int runtime;
	    /**
	     * getters and setters
	     * @return
	     */
	    public int getRuntime() {
			return runtime;
		}
		public void setRuntime(int runtime) {
			this.runtime = runtime;
		}
		@Override
		/**
		 * override adddetails
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
			System.out.println("Enter the runtime");
			this.runtime=sc.nextInt();
		}
		/**
		 * overriding printdetails
		 */
		@Override
		public void printDetails() {
			System.out.println("Identification Number : "+getIdentificationNumber());
			System.out.println("Title : "+getTitle());
			System.out.println("Number of copies : "+getNumberOfCopies());
			System.out.println("Runtime : "+getRuntime());
		}

}
