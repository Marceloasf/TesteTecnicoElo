package br.com.elotech;

import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {
	public List<String> longestStrings(List<String> strings) {
		List<String> longestStrings = new ArrayList<String>();
		int maxLenght = 0;

		for (String word : strings) {
			if (word.length() > maxLenght) {
				longestStrings.clear();
				maxLenght = word.length();
				longestStrings.add(word);
			} else if (word.length() == maxLenght) {
				longestStrings.add(word);
			}
		}

		return longestStrings;

	}
}
