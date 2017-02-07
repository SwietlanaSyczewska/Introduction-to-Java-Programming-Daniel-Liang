package Exercise_21_14;

public class Exercise_21_14 {
	public static void main(String[] args) {
		WebCrawler webCrawler1 = new WebCrawler(getURL());
	}

	private static String getURL() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a URL: ");
		return input.nextLine();
	}
}
