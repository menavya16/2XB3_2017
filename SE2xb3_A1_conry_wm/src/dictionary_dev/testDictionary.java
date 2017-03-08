package dictionary_dev;

/*      Student Information
 *       -------------------
 *       Student Name:   Conry, Will
 *       Student Number: 001049852
 *       Course Code:    SE 2XB3
 *       Lab Section:    03
 *	
 *       I attest that the following code being
 *       submitted is my own individual work.
 */

import java.util.*;
import java.io.*;
public class testDictionary {
	

	public static void main(String[] args) throws Exception {
		
		testInsert();
		testGetValue();
		testGetKey();
		testRemove();
		testContains();
		testCount();
		testIsEmpty();
		testPrintKeys();
		
	}
	
	/**
	 * takes values from an input file, tests insert method in Dictionary.java,
	 * by inserting key,value pairs into a new output file
	 * 
	 * @throws Exception
	 */
	public static void testInsert() throws Exception {
		FileWriter fw = new FileWriter("output.txt");
		fw.write("\nInserting dictionary key,value from input.txt");
		Scanner sc = new Scanner(new File("input.txt")); //Scanner reads the data from input file
		Dictionary d = new Dictionary(); 
		while (sc.hasNext()) { //while there is input in the lines of input file
			String current = sc.next(); //every input in a line in the input.txt is stored as a string
			int key = Integer.parseInt(current.split(",")[0]); // which is split on comma,which is internally appended to an array
			//and the 0th index is stored in key
			// after it is parsed into an integer
			String value = current.split(",")[1];// and the first index of the current(string) is stored in value as a string
			//since values is an arraylist of string
			d.insert(key, value);// then the pair is inserted onto the arraylist and internally
			//the constructor is called from Dictionary.java
		}
		//All the files are closed, if they arent closed, the output will not be displayed
		sc.close(); 
		fw.write("\nFinished");	
		fw.close();
	}
	
	/**
	 * tests the GetValue method from Dictionary.java
	 * @throws Exception
	 */
	public static void testGetValue() throws Exception {
		
		FileWriter fw = new FileWriter("output.txt");
		fw.write("\nTesting getValue");
		Scanner sc = new Scanner(new File("input.txt"));
		Dictionary d = new Dictionary();
		while (sc.hasNext()) {
			String current = sc.next();
			int key = Integer.parseInt(current.split(",")[0]);
			String value = current.split(",")[1];
			d.insert(key, value);
			if(value != d.getValue(key)) {// if the value being tested is not same as the
				fw.write("\nError with value: " + value);//value in the arraylist then the error message is displayed
				//in the output file
			}
		}
		sc.close();
		fw.write("\nFinished");	
		fw.close();		
	}

	/**
	 * tests GetKey method from Dictionary.java
	 * @throws Exception
	 */
	public static void testGetKey() throws Exception {
		FileWriter fw = new FileWriter("output.txt");
		fw.write("\nTesting");
		Scanner sc = new Scanner(new File("input.txt"));
		Dictionary d = new Dictionary();
		while (sc.hasNext()) {
			String current = sc.next();
			int key = Integer.parseInt(current.split(",")[0]);
			String value = current.split(",")[1];
			d.insert(key, value);
			if(key != d.getKey(value)) {//if the key being tested is not the same as the key in the arraylist
				fw.write("\nError with key: " + String.valueOf(key));//error message is displayed, also it is important 
				//to use String. before the valueOf because the string representation is being concatenated and returned 
			}
		}
		sc.close();
		fw.write("\nFinished");	
		fw.close();
	}
	
	/**
	 * tests the remove method from Dictionary.java
	 * @throws Exception
	 */
	public static void testRemove() throws Exception {
		FileWriter fw = new FileWriter("output.txt");
		fw.write("\nTesting");
		Scanner sc = new Scanner(new File("input.txt"));
		Dictionary d = new Dictionary();
		while (sc.hasNext()) {
			String current = sc.next();
			int key = Integer.parseInt(current.split(",")[0]);
			String value = current.split(",")[1];
			d.insert(key, value);
			d.remove(key);
			if(d.isEmpty() != true) {// If the list is not empty and conains the 
				fw.write("\nError with key" + String.valueOf(key));
			}
		}
		sc.close();
		fw.write("\nFinished");	
		fw.close();
	}
	
	public static void testContains() throws Exception {
		FileWriter fw = new FileWriter("output.txt");
		fw.write("\nTesting");
		Scanner sc = new Scanner(new File("input.txt"));
		Dictionary d = new Dictionary();
		while (sc.hasNext()) {
			String current = sc.next();
			int key = Integer.parseInt(current.split(",")[0]);
			String value = current.split(",")[1];
			d.insert(key, value);
			if(d.contains(key) != true) {
				fw.write("\nError with key" + String.valueOf(key));
			}
		}
		sc.close();
		fw.write("\nFinished");	
		fw.close();
	}
	
	public static void testCount() throws Exception {
		FileWriter fw = new FileWriter("output.txt");
		fw.write("\nTesting");
		Scanner sc = new Scanner(new File("input.txt"));
		Dictionary d = new Dictionary();
		while (sc.hasNext()) {
			String current = sc.next();
			int key = Integer.parseInt(current.split(",")[0]);
			String value = current.split(",")[1];
			d.insert(key, value);
			if(d.contains(key) != true) {
				fw.write("\nError with key" + String.valueOf(key));
			}
		}
		sc.close();
		fw.write("\nFinished");
		fw.close();
	}
	
	public static void testIsEmpty() throws Exception {
		FileWriter fw = new FileWriter("output.txt");
		fw.write("\nTesting");
		Scanner sc = new Scanner(new File("input.txt"));
		Dictionary d = new Dictionary();
		while (sc.hasNext()) {
			String current = sc.next();
			int key = Integer.parseInt(current.split(",")[0]);
			String value = current.split(",")[1];
			d.insert(key, value);
			d.remove(key);
			if(d.isEmpty() != true) {
				fw.write("\nError with key" + String.valueOf(key));
			}
		}
		sc.close();
		fw.write("\nFinished");
		fw.close();
	}
	
	public static void testPrintKeys() throws Exception {
		FileWriter fw = new FileWriter("output.txt");
		fw.write("\nTesting");
		Scanner sc = new Scanner(new File("input.txt"));
		Dictionary d = new Dictionary();
		while (sc.hasNext()) {
			String current = sc.next();
			int key = Integer.parseInt(current.split(",")[0]);
			String value = current.split(",")[1];
			d.insert(key, value);
			d.printKeys();
		}
		sc.close();
		fw.write("\nFinished");
		fw.close();
	}
}
