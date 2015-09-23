package strings;

import java.util.Scanner;

public class ScannerDelimiter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner("12, 42, 78, 99, 42");
		System.out.println(scanner.delimiter());
		scanner.useDelimiter("\\s*,\\s*");
		while(scanner.hasNextInt())
			System.out.println(scanner.nextInt());
	}

}
