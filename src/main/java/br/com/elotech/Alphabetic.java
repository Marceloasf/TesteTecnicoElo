package br.com.elotech;

public class Alphabetic {
	public String alphabetic(String word) {
		String finalWord = "";

		for (int x = 0; x < word.length(); x++) {
			char letter = word.charAt(x);
			if (letter != ' ') {
				if (letter == 'z') {
					letter = 'a';
				} else if (letter == 'Z') {
					letter = 'A';
				} else {
					letter++;
				}

				finalWord = finalWord.concat(String.valueOf(letter));
			}
		}
		return finalWord;
	}
}
