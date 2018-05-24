package textExcel;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args) {
	  Scanner scanner = new Scanner (System.in);
	  Spreadsheet spreadsheet = new Spreadsheet();
	  String input = scanner.nextLine();
	  while (!input.toLowerCase().equals("quit")) {
				System.out.println(spreadsheet.processCommand(input));
				input = scanner.nextLine();
			} 
				scanner.close();
	 	}
}

