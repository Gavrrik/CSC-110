package projects;

import java.util.Scanner;
import java.io.*;

// Lab#8-C2F\F2C\K2C\C2K\K2F\F2K FileInput-FileOutput
public class TemperatureConverterFileInFileOut8 {

	public static void main(String[] args) throws IOException {

		// Scanner for keyboard input.
		Scanner in = new Scanner(System.in);
		// Input File path
		File temperature = new File("/Users/Halcyon/Desktop/Eclipse Files/InputFile.txt");
		// Scanner for File input.
		Scanner inputfile = new Scanner(temperature);
		// Output File Path
		PrintWriter outputFile = new PrintWriter("/Users/Halcyon/Desktop/Eclipse Files/OutputConversion.txt");

		// Ask the user to choose the conversion formula
		System.out.print("Type 1 to convert Fahrenheit to Celsius.\n");
		System.out.print("Type 2 to convert Celsius to Fahrenheit.\n");
		System.out.print("Type 3 to convert Kelvin to Celsius.\n");
		System.out.print("Type 4 to convert Celsius to Kelvin.\n");
		System.out.print("Type 5 to convert Kelvin to Fahrenheit.\n");
		System.out.print("Type 6 to convert Fahrenheit to Kelvin.");
		int choice = in.nextInt();

		// What did he or she choose?
		if (choice == 1) {
			// Keep reading file while it has a next line.
			while (inputfile.hasNext()) {

				String FahNum = inputfile.nextLine();

				double fahrenheit = Double.parseDouble(FahNum);
				double celsius = 5 * (fahrenheit - 32) / 9;

				// Celsius
				outputFile.println("celsius:" + celsius);
				System.out.println("Finish!");
			}
		}

		if (choice == 2) {

			while (inputfile.hasNext()) {
				String FahNum = inputfile.nextLine();

				double celsius = Double.parseDouble(FahNum);
				double fahrenheit = 9 * (celsius / 5) + 32;

				// Fahrenheit
				outputFile.println("Fahrenheit: " + fahrenheit);
				System.out.println("Finish!");
			}
		}

		if (choice == 3) {
			while (inputfile.hasNext()) {
				String FahNum = inputfile.nextLine();

				double kelvin = Double.parseDouble(FahNum);

				double celsius = kelvin - 273.0;

				// Celsius
				outputFile.println("Celsius: " + celsius);
				System.out.println("Finish!");
			}
		}

		if (choice == 4) {
			while (inputfile.hasNext()) {
				String FahNum = inputfile.nextLine();

				double celsius = Double.parseDouble(FahNum);
				double kelvin = celsius + 273.15F;

				// Kelvin
				outputFile.println("Kelvin: " + kelvin);
				System.out.println("Finish!");
			}
		}

		if (choice == 5) {
			while (inputfile.hasNext()) {
				String FahNum = inputfile.nextLine();

				double kelvin = Double.parseDouble(FahNum);
				double fahrenheit = ((kelvin - 273) * (9.0 / 5)) + 32;

				// Fahrenheit
				outputFile.println("Fahrenheit: " + fahrenheit);
				System.out.println("Finish!");
			}
		}

		else {
			while (inputfile.hasNext()) {
				String FahNum = inputfile.nextLine();

				double fahrenheit = Double.parseDouble(FahNum);
				double kelvin = (fahrenheit - 32) * (5.0 / 9) + 273;

				// Kelvin
				outputFile.println("Kelvin: " + kelvin);
				System.out.println("Finish!");
			}
		}
		
		in.close();
		inputfile.close();
		outputFile.close();
	}
	
}
