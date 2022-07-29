package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;

public class FirstMostDuplicate_Map {

	public static void main(String[] args)
	{
		String input = "abbbaba";
		char[] letter = input.toCharArray(); 	
		int max=0; int value =0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();	
		
		for (int i = 0; i < input.length(); i++) {
			char key = letter[i];

			if(map.containsKey(key)) {
				value = map.get(key);
				map.put(letter[i], value+1);
				max = map.get(key);
				if (max > value) {
					System.out.println("First Most Duplicate : " +letter[i]);
					break;
					}
			}else
				map.put(letter[i], 1);
		}

	}

}
