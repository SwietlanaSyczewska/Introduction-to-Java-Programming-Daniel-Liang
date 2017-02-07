package Exercise_21_07;

public class WordOccurence implements Comparable<WordOccurence> {
	String word;
	int count;

	public WordOccurence(String word, int count) {
		this.word = word;
		this.count = count;
	}

	@Override
	public String toString() {
		return "WordOccurence [word=" + word + ", count=" + count + "] \n";
	}

	@Override
	public int compareTo(WordOccurence wordOccurence) {
		if (this.count > wordOccurence.count) {
			return 1;
		} else if (this.count < wordOccurence.count) {
			return -1;
		} else {
			return 0;
		}

	}

}
