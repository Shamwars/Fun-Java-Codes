/*
Program to create a secret word
Manipulate the word Hello to make a new word elloHay
*/

class SecretWord{
	public static void main(String[] args){
		// Make declarations
		String word = "Hello";
		String newWord;

		StringBuilder str = new StringBuilder();

		// iterate through the String word startingat the second letter

		for (int i=1; i<word.length(); i++){
			str.append(word.charAt(i));
		}
		str.append(word.charAt(0));
		str.append("ay");

		// convert StringBuilder str back to an immutable string

		newWord = str.toString();

		System.out.println(str);
	}
}