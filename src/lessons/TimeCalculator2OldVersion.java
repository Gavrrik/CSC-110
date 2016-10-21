package lessons;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TimeCalculator2OldVersion {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int i = 7;

		do {
			double seconds; // The number of seconds
			String input; // This is to hold the keyboard input

			// constants
			final double SECONDS_PER_MINUTE = 60.0; // Seconds in a minute
			final double SECONDS_PER_HOUR = 3600.0; // Seconds in an hour
			final double SECONDS_PER_DAY = 86400.0; // Seconds in a day

			// This is to get the number of seconds
			input = JOptionPane.showInputDialog("Enter the number of seconds");
			seconds = Double.parseDouble(input);

			// Display the number of minutes, hours, and days
			if (seconds >= SECONDS_PER_MINUTE + SECONDS_PER_HOUR + SECONDS_PER_DAY); {
				// Calculate the number of minutes, hours, and days
				double minutes = seconds / SECONDS_PER_MINUTE;
				double hours = seconds / SECONDS_PER_HOUR;
				double days = seconds / SECONDS_PER_DAY;

				// Display the number of minutes, hours, and days.
				JOptionPane.showMessageDialog(null, " There are " + minutes + " minutes" + ", " + hours + " hours"
						+ ", and " + days + " days, in " + seconds + " seconds.");

				input = JOptionPane.showInputDialog(null, "If You want to continue type  7, otherwise type 9");
				i = Integer.parseInt(input);
			}

		} while (i < 9);

		keyboard.close();
	}
	
}
