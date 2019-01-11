package br.com.elotech;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AllLongestStrings {
	public List<String> longestStrings(List<String> strings) {
		List<String> longestStrings;
		strings.sort(Comparator.comparingInt(String::length).reversed());
		int maxLenght = strings.get(0).length();
		longestStrings = strings.stream().filter(word -> word.length() == maxLenght).collect(Collectors.toList());
		return longestStrings;
	}
}
