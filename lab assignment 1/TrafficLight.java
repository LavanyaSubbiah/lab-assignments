/**
 * 
 * @author Lavanya Subbiah
 * date  22/10/2020
 * desc  traffic lights
 *
 */
import java.util.*;
public class TrafficLight {
    static String lights;
    static String display;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		lights=sc.next();
		display=calculateDisplays(lights);
		System.out.println("The light is "+display);

	}
	private static String calculateDisplays(String lights2) {
		// TODO Auto-generated method stub
		if(lights.equalsIgnoreCase("red!!!")) {
		return "STOP";
		}
		else if(lights.equalsIgnoreCase("yellow!!!")) {
			return "READY";
			}
		else if(lights.equalsIgnoreCase("green!!!")) {
			return "GO";
		}
		return null;
	}

}
