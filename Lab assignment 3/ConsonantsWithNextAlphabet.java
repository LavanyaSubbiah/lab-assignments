/**
 * 
 * @author Lavanya Subbiah
 *date 25/10/2020
 *desc method which accepts a String and replaces all the consonants in the String with the next alphabet
 */
import java.util.*;

public class ConsonantsWithNextAlphabet {
     private static String alterString(String word) {
		char[] charArray=word.toCharArray();
		String addString="";
		int length=word.length();
		for(int i=0;i<length;i++) {// finds the consonants
			if(charArray[i]!='a'&& charArray[i]!='e' && charArray[i]!='i' && charArray[i]!='o'&& charArray[i]!='u'
					&& charArray[i]!='A' && charArray[i]!='E' && charArray[i]!='I' && charArray[i]!='O' && charArray[i]!='U')
			{
				char ch=(char)(charArray[i]+1);// finds the next consonants
			    addString=addString+ch;// adds next consonants into the string
			}
			else 
			{
				addString=addString+charArray[i];// adds vowels into the string
			}
		}
	       return addString;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.next();
		String replacedWord=alterString(word);
		System.out.println("The replaced String is "+replacedWord);
                                    sc.close();
	}

}
