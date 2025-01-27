package englishexercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> savedWords = new ArrayList<>();

		TreeMap<String, String> words = new TreeMap<>();

		String phrase;

		int phraseCounter = 1;

		String wordValue;

		String word;

		int lastSpace = 0;

		int actualPosition;

		System.out.println("Introduce the phrase");
		phrase = sc.nextLine();

		while (!phrase.equalsIgnoreCase("end")) {

			savedWords.removeAll(savedWords);

			lastSpace = 0;
			actualPosition = 0;
			wordValue = "";

			while (phrase.indexOf(' ', lastSpace) > 0) {

				savedWords.removeAll(savedWords);

				actualPosition = phrase.indexOf(' ', lastSpace);

				word = phrase.substring(lastSpace, actualPosition);

				if (word.length() > 2) {

					if (words.containsKey(word) && !savedWords.contains(word)) {

						wordValue = words.get(word);

						words.put(word, wordValue + " " + phraseCounter);
						savedWords.add(word);

					} else {

						words.put(word, " " + phraseCounter);
						savedWords.add(word);

					}

				}

				lastSpace = actualPosition;

				lastSpace += 1;

			}

			word = phrase.substring(lastSpace);

			if (word.length() > 2) {

				if (words.containsKey(word)) {

					if (!savedWords.contains(word)) {

						wordValue = words.get(word);

						words.put(word, wordValue + " " + phraseCounter);
						savedWords.add(word);

					}

				} else {

					words.put(word, " " + phraseCounter);
					savedWords.add(word);

				}

			}

			phraseCounter++;

			System.out.println("Introduce the phrase");
			phrase = sc.nextLine();

		}

		System.out.println(words);

	}

}
