package Bivona_PA4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Bivona_p1 {
	//application
	public static void main(String[] args) throws IOException {
		String inFileName = "problem1.txt";
		String outFileName = "unique_words.txt";   
		DuplicateRemover indication = new DuplicateRemover();
		indication.remove(inFileName);
	    indication.write(outFileName);
	}

}
