package fidelity.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExp {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Mango");
		arrList.add("Apple");
		arrList.add("Orange");
		arrList.add("Banana");
		arrList.add("Pineapple");
		arrList.add("Watermelon");
		
		arrList.add("Bengaluru");
		arrList.add("Mysore");
		
		arrList.add("Singing");
		arrList.add("Cricket");
		
		System.out.println("List: "+ arrList);
		
		arrList.remove("Cricket");
		System.out.println("After removing the Cricket: "+ arrList);
		
		arrList.remove("Mysore");
		arrList.remove("Banana");
		System.out.println("After removing the 1 city and 1 fruit: "+ arrList);
		
		System.out.println("4th and 6th elements: "+ arrList.get(4) + ", " + arrList.get(6));
        		
		int index = arrList.indexOf("Singing");
		if(index != -1) {
			arrList.set(index, "Dancing");
		}
		System.out.println("After replacing Singing: "+ arrList);
		
		Collections.reverse(arrList);
		System.out.println("After reversing: "+ arrList);
		
		arrList.add(3, "Kerala");
		arrList.add(1, "Mango");
		
		System.out.println("After adding Kerala and Mango: "+ arrList);
		
		System.out.println("Size of ArrayList: "+ arrList.size());
		
		arrList.clear();
		System.out.println("After clearing: "+ arrList);
	}

}
