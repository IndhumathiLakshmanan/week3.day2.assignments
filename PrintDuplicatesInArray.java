package week3.day2.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) 
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> onlyunique = new LinkedHashSet<Integer>();
		
		for (Integer value : arr) {
			boolean collection=unique.add(value);
		if(!collection)
			onlyunique.add(value);
		}
		System.out.println("Duplicates : " + onlyunique);

	}

}
