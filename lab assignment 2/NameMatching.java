/**
 * 
 * @author Lavanya Subbiah
 *date 23/10/2020
 *desc Name Matching
 */
public class NameMatching {

	public static void main(String[] args) {
      String[][] name= {
    		  {"Mr","Mrs","Ms"},
    		  {"Prateek","Surya","Aishwarya","Rohan","Leena"}
      };                                                 // The matchings are
      System.out.println(name[0][0]+". "+name[1][0] );
      System.out.println(name[0][0]+". " +name[1][1]);
      System.out.println(name[0][2] +". "+name[1][2]);
      System.out.println(name[0][0] +". "+name[1][3]);
      System.out.println(name[0][2]+". " +name[1][4]);
	}

}
