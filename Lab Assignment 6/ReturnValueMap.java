/**
 * Author Lavanya Subbiah 
 * date 4/11/2020
 * desc return sorted values in map
 */
import java.util.*;
public class ReturnValueMap {private static ArrayList<String> getValues(HashMap<Integer, String> hashMap) {
	ArrayList<String> list = new ArrayList<>();
	for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
		/**
		 * Returns the value corresponding to this entry
		 */
		list.add(entry.getValue());
	}
	Collections.sort(list); // Sorting the list
	return list; // Returns the sorted list
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of pairs");
	int num = sc.nextInt();
	HashMap<Integer, String> hashMap = new HashMap<>(); // Creation of HashMap
	/**
	 * Adding Key-Value pairs into the HashMap
	 */
	for (int i = 0; i < num; i++) {
		int key = sc.nextInt();
		String value = sc.next();
		hashMap.put(key, value);
	}
	ArrayList<String> list = getValues(hashMap); // Function Call
	/**
	 * Printing the sorted list
	 */
	for (String str : list) {
		System.out.println(str);
	}
	sc.close();

}


}
