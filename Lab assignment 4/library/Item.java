package Books;

public abstract class Item {
	private int identificationNumber;
	private String title;
	private int numberOfCopies;
	public abstract void addDetails();    
	public abstract void printDetails();
	public Item(int identificationNumber, String title, int numberOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getTitle() {
		return title;
		
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOCopies) {
		this.numberOfCopies = numberOCopies;
	}

}
