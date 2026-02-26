package fidelity.collections;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExp {
	 public static void main(String[] args) {
		 
	        HashMap<Integer, String> countryMap = new HashMap<>();
	 
	        countryMap.put(1, "India");
	        countryMap.put(2, "USA");
	        countryMap.put(3, "Germany");
	        countryMap.put(4, "France");
	        countryMap.put(5, "Japan");
	        countryMap.put(6, "Canada");
	        countryMap.put(7, "Australia");
	        countryMap.put(8, "Brazil");
	        countryMap.put(9, "Italy");
	        countryMap.put(10, "China");
	 
	        System.out.println("Original Country Map: " + countryMap);
	 
	        System.out.println("All Keys: " + countryMap.keySet());
	 
	        System.out.println("All Values: " + countryMap.values());
	 
	        System.out.println("Contains value 'India'? "
	                + countryMap.containsValue("India"));
	 
	        System.out.println("Contains key 45? "
	                + countryMap.containsKey(45));
	 
	        countryMap.remove(3);
	        System.out.println("After removing key 3: " + countryMap);
	 
	        HashMap<Integer, String> stateMap = new HashMap<>();
	 
	        stateMap.put(11, "Karnataka");
	        stateMap.put(12, "Tamil Nadu");
	        stateMap.put(13, "Kerala");
	 
	        System.out.println("State Map: " + stateMap);
	 
	        countryMap.putAll(stateMap);
	        System.out.println("After Merging: " + countryMap);
	 
	        countryMap.remove(5);
	        System.out.println("After deleting key 5: " + countryMap);
	 
	        System.out.println("Is Map Empty? " + countryMap.isEmpty());
	 
	        TreeMap<Integer, String> sortedMap = new TreeMap<>(countryMap);
	        System.out.println("Sorted Map: " + sortedMap);
	 
	        countryMap.clear();
	        System.out.println("After clearing: " + countryMap);
	    }
}
