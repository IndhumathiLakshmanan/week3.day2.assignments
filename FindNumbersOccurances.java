package week3.day2.assignments;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {

		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};

		Arrays.sort(input);

		Map<Integer, Integer> number = new TreeMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++)
		{
			int key = input[i];

			if(number.containsKey(key))
			{
				int value = number.get(key);
				number.put(input[i], value+1);
			}else
			{
				number.put(input[i], 1);

			}

		}
		System.out.println(number);


	}

}
