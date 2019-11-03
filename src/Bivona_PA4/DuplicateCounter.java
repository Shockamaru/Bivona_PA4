package Bivona_PA4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

	 private Map<String, Integer> wordCounter;
	  
	   public DuplicateCounter(){
	       wordCounter = new HashMap<String,Integer>();
	   }
	  
	   public void count(String dataFile){
	       Scanner input = null;
	       try {
	           input = new Scanner(new File(dataFile));
	       }catch (FileNotFoundException e) {
	           System.out.println(e.getMessage());
	           return;
	       }
	       input.useDelimiter("([0-9]|[.,!?:;'\"-]|\\s)+");
	       while(input.hasNext()) {
	           String word = input.next();
	           Integer count = wordCounter.get(word); 
	           if(count == null)
	               count = 1;
	           else
	               count = count + 1;
	           wordCounter.put(word, count);
	       }
	       input.close();
	   }
	  
	   public void write(String dataFile){
		   try {
	           PrintWriter outfile = new PrintWriter(new File(dataFile));
	           for(String k : wordCounter.keySet()) {
	               outfile.println(k + " " + wordCounter.get(k));
	           }
	           outfile.close();
	       } catch (FileNotFoundException e) {
	           System.out.println(e.getMessage());
	       }
	   }
	}