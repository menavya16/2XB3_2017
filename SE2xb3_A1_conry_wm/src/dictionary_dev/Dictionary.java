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

import java.util.*;			// For ArrayList
public class Dictionary {
    
    private ArrayList<Integer> keys = new ArrayList<Integer>(20);
    private ArrayList<String> values = new ArrayList<String>(20);

    public Dictionary() {}
    
    public Dictionary(int key, String value) {
        this.keys.add(Integer.valueOf(key));
        this.values.add(value);    
    }
    
    /**
     * The (key,value) pairs cannot be more than 20, and for every key inserted there 
     * should be a value. There can be various values for a given key but a key cannot 
     * have the same value. If these conditions are met then the (key,value) pair will
     * be added to it. 
     * 
     * @param keys
     * @param values
     */
    public Dictionary(int[] keys, String[] values) {
        if(keys.length > 20 | values.length > 20) {
            System.out.println("Error maximum entries for dictionary is 20");
        } if(keys.length != values.length) {
            System.out.println("Error each key must have a corresponding value");
        } else {       
            for(int i = 0; i < keys.length; i++) {                          
               if(this.keys.contains(Integer.valueOf(keys[i]))) {
                   System.out.println("Error duplicate keys aren't allowed");
                   System.out.println("Duplicate key and corresponding value ommited");
               } else {
                   this.keys.add(Integer.valueOf(keys[i]));
                   this.values.add(values[i]);
               }
           }
        }
    }

    public void insert(int key, String value) {
        if (this.keys.size() == 20) {
            System.out.println("Error dictionary is full with 20 entries");
        }
        if (this.keys.contains(Integer.valueOf(key))) {
            System.out.println("Error duplicate keys aren't allowed");

        } else {
            this.keys.add(Integer.valueOf(key));
            this.values.add(value);
        }
    }

    public String getValue(int key) {
        int index = this.keys.indexOf(Integer.valueOf(key));
        return this.values.get(index);
    }
    
    public int getKey(String value) {
        int index = this.values.indexOf(value);
        return this.keys.get(index).intValue();
    }
    
    public void remove(int key) {
        int index = this.keys.indexOf(Integer.valueOf(key));
        this.values.remove(index);
        this.keys.remove(index);
    }
    
    public boolean compare(int key1, int key2) {
        int index1 = this.keys.indexOf(key1);
        int index2 = this.keys.indexOf(key2);
        if(this.values.get(index1).equals(this.values.get(index2))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(int key) {
        return this.keys.contains(Integer.valueOf(key));
    }
    
    public int count() {
    	return this.keys.size();
    }
    
    public boolean isEmpty() {
    	return this.keys.isEmpty();
    }
    
    public void printKeys() {
    	System.out.print("{");
    	for(int i = 0; i < this.keys.size(); i++) {
    		System.out.print(this.keys.get(i));
    		System.out.print(", ");
    	}
    	System.out.print("}");
   	} 

}