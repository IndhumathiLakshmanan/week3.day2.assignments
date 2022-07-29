package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
	
		int[] number = {1,2,3,4,7,6,8};
		Arrays.sort(number);
		
		List <Integer> list = new ArrayList<Integer>();
		for (Integer integer : number) {
			list.add(integer);
		}
		list.add(0, 0);
		
		for (int i = 0; i < list.size(); i++)
		{
			if(!list.contains(i))
			System.out.print("Missing number  : " +i);

	}

	}
}
