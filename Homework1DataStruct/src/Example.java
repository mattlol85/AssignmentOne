
//Matthew Fitzgerald
//Assignment 1
import java.util.*;
import java.io.*;

public class Example {

	public static void main(String[] args) throws FileNotFoundException {
		File readFile = new File("input.txt");

		// Scanner scanner = new Scanner(System.in);

		Scanner scanner = new Scanner(readFile);

		// read in words and determine whether it is composed of unique characters
		while (scanner.hasNextLine()) {
			String s = scanner.nextLine();
			// System.out.println(s);
			System.out.println(isUniqueChar(s) + " " + sortWord(s));
		}
		scanner.close();
	}

	private static boolean isUniqueChar(String s) {
		boolean outcome = true;
		char[] charStr = s.toCharArray();

		for (int i = 0; i < charStr.length - 1; i++) // Scan the word
			for (int j = i + 1; j < charStr.length; j++) // Take the first letter
				if (charStr[i] == charStr[j]) {
					return false; // There is a duplicate
				}

		return outcome;
	}

	private static String sortWord(String s) {
		s.toLowerCase();
		char[] c = s.toCharArray(); // Split up the string
		insertionSort(c); // Sort the word
		return new String(c);
	}

	public static void insertionSort(char[] word) {

		if (word == null || word.length == 0) // Check if there is a word
			//return "No Word"; // Return if there is no word
		
		for (int i = 0; i < word.length; i++) { // Scan the whole word for the first sorted char
			char temp = word[i]; // Assign the first char to temp
			int j = i; 
			while (j > 0 && word[j - 1] > temp) { // Organize by value with while loop
				word[j] = word[j - 1]; // Assign position
				j--;
			}
			word[j] = temp;
		}
	//return ;
	}

}