/**
 * 
 * @author Lavanya Subbiah
 *date 25/10/2020
 *desc checks if it is a positive string
 *
 */
import java.util.*;
public class PositiveString {
                      private static boolean checkPositiveString(String word) {
		String str="";
		char[] Array=word.toCharArray();
	    Arrays.sort(Array);//sort all the characters 
	    for(int i=0;i<Array.length;i++)
	    {
	    	str=str+Array[i];// add all characters in a string
	    }
	    if(word.equals(str))// compares sorted string and original string
	    {
	    	return true;
	    }
	    else
		return false;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word");
	String word=sc.next();
	boolean result=checkPositiveString(word);
	System.out.println("The given string is a positive string : "+result);
                 sc.close();
	}

	

}
