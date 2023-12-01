import java.util.Scanner;

public class MyCharArray {

	public static void main(String[] args) {
		String myName = "Akila Sathianathan";
		String reverseString = "";
		for (int i = myName.length() - 1; i >= 0; i--) {
			reverseString = reverseString + myName.charAt(i);

		}
		System.out.println(reverseString);
		MyCharArray ob = new MyCharArray();
		ob.evenorodd();
		ob.sTringrevers();
	}

	public void evenorodd() {
		Scanner getInput = new Scanner(System.in);
		System.out.println("\nEnter value:\n");
		int val = getInput.nextInt();

		if (val % 2 == 0) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number is odd");
		}

	}

	public void sTringrevers() {
		String original = "Hello";
		StringBuffer newString = new StringBuffer(original);
		String newVal = newString.reverse().toString();
		if (newVal.equalsIgnoreCase(original)) {
			System.out.println("the given string is palindrome");
		} else {
			System.out.println("the given string is not palindrome");
		}
	}

}
