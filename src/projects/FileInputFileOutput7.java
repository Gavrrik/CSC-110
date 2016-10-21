package projects;

import java.util.Scanner;
import java.io.*;

// Lab#7-File Input - File Output
public class FileInputFileOutput7 {

	public static void main(String[] args) throws IOException {

		File temperature = new File("/Users/Halcyon/Desktop/Eclipse Files/InputFile.txt");
		Scanner inputfile = new Scanner(temperature);
		PrintWriter outputFile = new PrintWriter("/Users/Halcyon/Desktop/Eclipse Files/OutputConversion.txt");

		while (inputfile.hasNext()) {

			String FahNum = inputfile.nextLine();

			double fahrenheit = Double.parseDouble(FahNum);
			double celsius = 5 * (fahrenheit - 32) / 9;

			// output Celsius
			outputFile.println("Celsius:" + celsius);

			System.out.println("Finish!");
		}

		inputfile.close();
		outputFile.close();

	}
	
}
