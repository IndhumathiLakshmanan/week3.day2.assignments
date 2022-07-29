package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {


		int[] number = {3,2,11,4,6,7};
		Arrays.sort(number);

		List<Integer> list = new ArrayList<Integer>();
		for (Integer integer : number) {
			list.add(integer);
		}
		int size =list.size()-2;
		System.out.println("Second Largest No : " + list.get(size));

	}

}


