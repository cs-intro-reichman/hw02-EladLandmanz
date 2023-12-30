/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String input_word = args[0];
		int word_length = input_word.length();
		//int middle_character = str.charAt(word_length/2);
		for (int i = (word_length - 1); i>=0; i--){
			System.out.print (input_word.charAt(i));
		}
		System.out.print("\n");
		System.out.println("The middle character is " + input_word.charAt((word_length - 1)/2));


	}
}
