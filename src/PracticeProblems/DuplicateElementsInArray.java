package PracticeProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {


		String names[] = {"Java" , "Javascript", "Ruby" ,"C", "Python", "Java"};
		
		// 1. compare each element --O(n*n)--- time complexity -- worst solution
		for(int i=0;i<names.length ;i++) {
			for(int j=i+1;j<names.length ;j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is:"+ names[i]);
				}
			}
		}
		
		System.out.println("*****");
		
		// 2.Using HashSet: Java collection : it stores unique values: O(n) -- time complexity
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name) == false) {
				System.out.println("Duplictae element is: "+ name);
			}
		}
		
		System.out.println("*****");
		
		// 3.Using HashMap:stores the duplicate values
		Map<String, Integer> storeMap = new HashMap<String,Integer>();
		
		for(String name:names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}
		}
		
		
		// get the values from this HashMap
		Set<Entry<String,Integer>> entryset = storeMap.entrySet();
		for(Entry<String,Integer> entry : entryset ) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate  element is:"+ entry.getKey());
			}
		}
		

	}

}
