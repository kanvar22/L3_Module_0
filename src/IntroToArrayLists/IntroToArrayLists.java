package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Bob");
		names.add("Mark");
		names.add("Jimmy");
		names.add("Kanvar");
		names.add("Brandon");
		
		
		
		
		for(int i = 0; i < names.size(); i++){
			String s = names.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		
		

		

		

	}
}
