package Exercise_21_09;

import java.util.HashMap;
import java.util.Scanner;

/*********************************************************************************
 * (Guess the capitals using maps) Rewrite Programming Exercise 8.37 to store *
 * pairs of each state and its capital in a map. Your program should prompt the
 * * user to enter a state and should display the capital for the state *
 *********************************************************************************/
public class Exercise_21_09 {
	public static void main(String[] args) {
		HashMap<String, String> statesAndCapitals = getDate();
		startGame(statesAndCapitals);
	}

	private static void startGame(HashMap<String, String> map) {
		Scanner input = new Scanner(System.in);
		String state;
		System.out.println("Enter a state. Press \"q\" to quit:");
		while ((state = input.nextLine()) != "q") {
			if (map.containsKey(state)) {
				System.out.println("Capital is " + map.get(state));
			} else {
				System.out.println("Wrong state");
			}
		}
	}

	private static HashMap<String, String> getDate() {
		HashMap<String, String> map = new HashMap<String, String>();

		String[][] data = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" }, { "Arizona", "Phoenix" },
				{ "Arkansas", "Little Rock" }, { "California", "Sacramento" }, { "Colorado", "Denver" },
				{ "Connecticut", "Hartford" }, { "Delaware", "Dover" }, { "Florida", "Tallahassee" },
				{ "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" }, { "Illinois", "Springfield" },
				{ "Maryland", "Annapolis" }, { "Minnesota", "Saint Paul" }, { "Iowa", "Des Moines" },
				{ "Maine", "Augusta" }, { "Kentucky", "Frankfort" }, { "Indiana", "Indianapolis" },
				{ "Kansas", "Topeka" }, { "Louisiana", "Baton Rouge" }, { "Oregon", "Salem" },
				{ "Oklahoma", "Oklahoma City" }, { "Ohio", "Columbus" }, { "North Dakota", "Bismark" },
				{ "New York", "Albany" }, { "New Mexico", "Santa Fe" }, { "New Jersey", "Trenton" },
				{ "New Hampshire", "Concord" }, { "Nevada", "Carson City" }, { "Nebraska", "Lincoln" },
				{ "Montana", "Helena" }, { "North Carolina", "Raleigh" }, { "Missouri", "Jefferson City" },
				{ "Mississippi", "Jackson" }, { "Massachusetts", "Boston" }, { "Michigan", "Lansing" },
				{ "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" }, { "South Carolina", "Columbia" },
				{ "South Dakota", "Pierre" }, { "Tennessee", "Nashville" }, { "Texas", "Austin" },
				{ "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" }, { "Virginia", "Richmond" },
				{ "Washington", "Olympia" }, { "West Virginia", "Charleston" }, { "Wisconsin", "Madison" },
				{ "Wyoming", "Cheyenne" } };
		for (int i = 0; i < data.length; i++)
			map.put(data[i][0], data[i][1]);
		return map;
	}
}
