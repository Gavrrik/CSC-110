package projects;

import javax.swing.JOptionPane;

// Lab#3-TimeCalculator
public class TimeCalculator3 {

	public static void main(String[] args) {

		// constants
		final int SECONDS_PER_MINUTE = 60; // Seconds in a minute
		final int MINUTES_PER_HOUR = 60; // minutes in an hour
		final int HOURS_PER_DAY = 24; // hours in a day

		// This is to get the number of seconds
		String input = JOptionPane.showInputDialog("Enter the number of seconds");
		int seconds = Integer.parseInt(input);
		// this is to catch the seconds entered and display them in the output.
		int totalseconds = seconds;

		// Calculate the number of minutes, hours, and days
		int minutes = seconds / SECONDS_PER_MINUTE;
		seconds -= minutes * SECONDS_PER_MINUTE;

		int hours = minutes / MINUTES_PER_HOUR;
		minutes -= hours * MINUTES_PER_HOUR;

		int days = hours / HOURS_PER_DAY;
		hours -= days * HOURS_PER_DAY;

		// Display the number of minutes, hours, and days.
		JOptionPane.showMessageDialog(null, "Total Seconds Entered: " + totalseconds + " Seconds" 
		+ "\n There are " + +days + " days" + ", " + hours + " hours" + ", " + minutes + " minutes" 
		+ " , and " + seconds + " seconds.");

		// Exit the application
		System.exit(0);
	}

}
