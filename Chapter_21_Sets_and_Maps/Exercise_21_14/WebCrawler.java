package Exercise_21_14;

import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*********************************************************************************
 * (Web crawler) Rewrite Listing 12.18, WebCrawler.java, to improve the *
 * performance by using appropriate new data structures for listOfPendingURLs
 * and * listOfTraversedURLs. *
 *********************************************************************************/

public class WebCrawler {
	String url;

	public WebCrawler(String url) {
		this.url = url;
		crawler(url);
	}

	public static void crawler(String startingURL) {
		Set<String> setOfPendingURLs = new LinkedHashSet<>();
		Set<String> setOfTraversedURLs = new HashSet<>();
		Set<String> setOfSubURLs = new HashSet<>();
		int count = 0;
		setOfPendingURLs.add(startingURL);
		while (!setOfPendingURLs.isEmpty() && setOfTraversedURLs.size() <= 100) {
			for (String urlString : setOfPendingURLs) {
				count++;
				System.out.println("Craw " + urlString);
				setOfSubURLs.addAll(getSubURLs(urlString));
			}
			setOfTraversedURLs.addAll(setOfPendingURLs);
			setOfSubURLs.removeAll(setOfTraversedURLs);
			setOfPendingURLs.addAll(setOfSubURLs);
		}
		;
	}

	public static Set<String> getSubURLs(String urlString) {
		Set<String> set = new LinkedHashSet<>();

		try {
			java.net.URL url = new java.net.URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while (input.hasNext()) {
				String line = input.nextLine();
				current = line.indexOf("http:", current);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) { // Ensure that a correct URL is found
						set.add(line.substring(current, endIndex));
						current = line.indexOf("http:", endIndex);
					} else
						current = -1;
				}
			}
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		return set;
	}
}
