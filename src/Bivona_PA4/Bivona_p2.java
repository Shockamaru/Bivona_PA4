package Bivona_PA4;

public class Bivona_p2 {
	//application
	public static void main(String[] args) {
		String inFilename = "problem2.txt";
	    String outFilename = "unique_word_counts.txt";
	    DuplicateCounter indication = new DuplicateCounter();
	    indication.count(inFilename);
	    indication.write(outFilename);

	}

}
