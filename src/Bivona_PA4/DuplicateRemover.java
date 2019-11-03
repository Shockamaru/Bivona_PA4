package Bivona_PA4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
   
	private Set<String> uniqueWords;
   
    public void remove(String dataFile) throws FileNotFoundException{
       String word;
       uniqueWords = new HashSet<String>();
       Scanner scan = new Scanner(new File(dataFile));
       while(scan.hasNext()){
           word = scan.next();
           uniqueWords.add(word);
       }
       scan.close();
    }
  
    public void write(String outputFile) throws IOException {
	   	File output;
	   	FileWriter inv = null;
	   	output = new File(outputFile);
	   	if(output.exists()) {
	   		inv = new FileWriter(output,false);
	   		inv = new FileWriter(output,true);
	   		Iterator itr = uniqueWords.iterator();
	   		while(itr.hasNext()){
	   			String str = (String)itr.next();
	   			inv.write(str+"\n");     
	   		}
	   		inv.close();
	   	}else{
	   		output.createNewFile();
	   		inv = new FileWriter(output);
	   		Iterator itr = uniqueWords.iterator();
	   		while(itr.hasNext()){
	   			String str = (String)itr.next();
	   			inv.write(str+"\n");     
	   		}
	   		inv.close();
	   	}
    }
}