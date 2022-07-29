package week3.day2.assignments;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Findintersection {

	public static void main(String[] args) {

		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};

		Map<Integer, Integer> newset = new HashMap<Integer,Integer>();

		for (int i = 0; i < arr2.length; i++) {
			newset.put(arr1[i], arr2[i]);
		}

		for (Entry<Integer, Integer> entry : newset.entrySet()) {
			if(entry.getValue() == entry.getKey())
			{
				System.out.println(entry.getKey());
			}

		}

	}
}
