//----------------------------------------------
//Assignment 1

//Written by: Mark Benedict Agluba, 40294956
//For COMP 248 Section S - Fall 2024
//----------------------------------------------

/*This program is to utilize the Java's String methods to perform various checks and modifications on the inputs. */
import java.util.Scanner;

public class A1_Q2 {

	public static void main(String[] args) {
		//Initializing the Scanner
		Scanner input = new Scanner(System.in);
		
		//Welcoming message
		System.out.println("********** String Inspector **********");
		
		//User input for the given sentence
		System.out.print("Enter the given sentence (longer than 5 characters): ");
		String sentence = input.nextLine();
		
		//user input for the given  word
		System.out.print("Enter the given word: ");
		String word = input.nextLine();
		
		//user input for the char to join 2 strings
		System.out.print("Enter a separator to join the two strings: ");
		String separator = input.nextLine();
		
		//closing the scanner
		input.close();
		//Blank space to jump a line
		System.out.println();
		
		//showing the results
		System.out.println("Given sentence contain the given  word: " + containsWord(sentence, word));
		System.out.println("Given sentence start with an \'i\': " + startsWithI(sentence));
		System.out.println("Sentence with \'a\' replaced by \'e\': " + replaceA(sentence));
		System.out.println("Joined string: " + joinWords(sentence, word, separator));
		System.out.println("\'a\' appears at index "+ indexOfA(sentence)+ " in the given sentence.");
		System.out.println("Character at 3rd position in the given sentence: "+ charAt3rd(sentence));
		
		//Blank space to jump a line
		System.out.println();
		
		//Closing message
		System.out.println("Thank you for using the String Inspector tool. Have a great day!");
	}
	
	//method to check if it contains the word
	private static boolean containsWord(String sentence, String word) {
		return sentence.contains(word);
	}
	
	//method to check if it starts with i
	private static boolean startsWithI(String sentence) {
		return sentence.startsWith("i");
	}
	
	//method that replaces all the a's with e's
	private static String replaceA(String sentence) {
		return sentence.replaceAll("a", "e");
	}
	
	//method to do a join method
	private static String joinWords(String sentence, String word, String separator) {
		return String.join(separator, sentence, word);
	}
	
	//method to check the index of the first a
	private static int indexOfA(String sentence) {
		return sentence.indexOf("a");
	}
	
	//method to show which char is positionned in index 2
	private static char charAt3rd(String sentence) {
		return sentence.charAt(2);
	}

}
