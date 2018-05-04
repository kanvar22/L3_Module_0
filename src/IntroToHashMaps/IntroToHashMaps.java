package IntroToHashMaps;

import java.util.HashMap;

public class IntroToHashMaps {
public static void main(String[] args) {
	

	HashMap<Integer, Double> roots = new HashMap<Integer, Double>();
	
	for (int i = 0; i < 501; i++) {
		roots.put(i, Math.sqrt(i));
	}
for ( Integer I: roots.keySet()) {
	System.out.println("The square root of " + I + " is " + roots.get(I));
}
	
	// 1. Create a HashMap called roots with Integers for the keys and Doubles for the values.

	// 2. Using a for-loop, add 500 entries to your HashMap. The key entry will be the

	// current iteration of the loop (i). The value entry will be the square root of i.

	// 3. Iterate through all the entries in your HashMap displaying the keys with their respective
	// square roots (values). Use the following format.

	// The square Root of 0 is 0.0
	// The square Root of 1 is 1.0
	// The square Root of 2 is 1.4142135623730951
	// The square Root of 3 is 1.7320508075688772

	
	
	
	
	
	
	
	
	
	
	
	
//	HashMap<Integer, String> roots = new HashMap<Integer, String>();
//	for (int i = 0; i < 399; i++) {
//		roots.put(i, Math.sqrt(i) + "");
//	}
//
//	System.out.println("\nAll the keys:");
//	for (Integer i : roots.keySet()) {
//		System.out.println("The square root of " + i + "is" + roots.get(i));
//	}
}
}