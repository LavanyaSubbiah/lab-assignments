/**
 * 
 * @author Lavanya Subbiah
 *date 25/10/2020
 *desc number of characters, lines and words in a text
 */
import java.util.*;
public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text");
		String text=sc.nextLine();
		int characters=countCharacters(text);
		System.out.println("The number of characters : " +characters);
		int words=countWords(text);
		System.out.println("The number of words : "+words);
        int lines=countLines(text);
        System.out.println("The number of Lines : "+lines);
	}

	private static int countLines(String text) {
		String[] linesSplit=text.split("\n");
		int length=linesSplit.length;// count number of lines
		return length;
	}

	private static int countWords(String text) {
		String[] wordSplit=text.split(" ");
		int length=wordSplit.length;//counts number of words
		return length;
	}

	private static int countCharacters(String text) {
		int length=text.length();//finds number of characters
		return length;
	}

}
