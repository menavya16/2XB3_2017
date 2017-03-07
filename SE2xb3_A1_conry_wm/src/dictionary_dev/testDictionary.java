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
	
	public static void testInsert() throws Exception {
		FileWriter fw = new FileWriter("output.txt");
		fw.write("\nInserting dictionary key,value from input.txt");
		Scanner sc = new Scanner(new File("input.txt"));
		Dictionary d = new Dictionary();
		while (sc.hasNext()) {
			String current = sc.next();
			int key = Integer.parseInt(current.split(",")[0]);
			String value = current.split(",")[1];
			d.insert(key, value);
		}
		sc.close();
		fw.write("\nFinished");	
		fw.close();
	}
	
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
			if(value != d.getValue(key)) {
				fw.write("\nError with value: " + value);
			}
		}
		sc.close();
		fw.write("\nFinished");	
		fw.close();		
	}

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
			if(key != d.getKey(value)) {
				fw.write("\nError with key: " + String.valueOf(key));
			}
		}
		sc.close();
		fw.write("\nFinished");	
		fw.close();
	}
	
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
			if(d.isEmpty() != true) {
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
