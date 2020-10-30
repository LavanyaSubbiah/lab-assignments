/**
 * 
 * @author Lavanya Subbiah
 *date :25/10/2020
 *desc :class containing a method to create the mirror image of a String. 
 */
import java.util.*;
public class MirrorImage {
private static String getImage(String word) {
		StringBuilder sb=new StringBuilder(word);
	    String Image=sb.reverse().toString();       //Converted into mirror image
	    return Image;
	}

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the word to be converted");
	   String word=sc.next();
	   String mirrorImage=getImage(word);
	   System.out.println("The Mirror Image is "+word+"|"+mirrorImage);
                     sc.close();
	}

	
}
