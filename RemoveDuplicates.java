package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] text1 = text.split(" ");
		Set<String> removeduplicates = new LinkedHashSet<String>();

		for (int i = 0; i < text1.length; i++) {
			removeduplicates.add(text1[i]);
		}
		 {
			 for (String string : removeduplicates)
				 System.out.print(string + " ");

		}
	}
}
