import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a message: ");
		String message = in.nextLine();

		System.out.println("Enter shift number: ");
		int shift = in.nextInt();
		in.nextLine();
		System.out.println("Encode or Decode???? (E/D): ");
		char choice = in.next().toUpperCase().charAt(0);
		if (choice == 'D') {
			shift = -shift;

		}

		String result = "";

		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				ch = (char) ((ch - 'A' + shift + 26) % 26 + 'A');

			else if (ch >= 'a' && ch <= 'Z') {
				ch = (char) ((ch - 'a' + shift + 26) % 26 + 'a');

			}
			result += ch;
		}
		System.out.println("Output: " + result);

		// Read in message

		// Read in shift

		// Loop through message
		// if letter is alphabetic
		// apply shift
		// if letter is past 'Z'
		// subtract 26
		// add letter to output

		// print output

	}
}
