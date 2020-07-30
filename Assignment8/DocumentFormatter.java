package Assignment8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DocumentFormatter {
	private static Scanner scan;
	private static BufferedWriter out;
	private static BufferedReader in;

	public static void main(String ar[]) throws IOException {
		scan = new Scanner(System.in);
		System.out.println("Enter the name of the file you want to create");
		String fileName = scan.next() + ".txt";
		File file1 = new File(fileName);
		file1.createNewFile();
		out = new BufferedWriter(new FileWriter(fileName, true));
		in = new BufferedReader(new FileReader("TopProverbs.txt"));
		String s;
		while ((s = in.readLine()) != null) {
			s = s.trim().replaceAll("\\s+", " ");
			out.write(s);
			out.newLine();
			out.flush();

		}

	}

}