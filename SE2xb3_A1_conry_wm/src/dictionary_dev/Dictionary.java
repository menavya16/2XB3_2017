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
    
    /**
     * Two arraylists are created for keys and values with a fixed size, providing extra methods 
     *  functionalities.
     */
	private ArrayList<Integer> keys = new ArrayList<Integer>(20);
    private ArrayList<String> values = new ArrayList<String>(20);

    /**
     * this constructor is empty, and is quiet redundant here, should be removed 
     */
    public Dictionary() {}
    
    /**
     * Initializes the contructor and instantiates the lists using valueOf method
     * that is part of arraylist library which takes in the value input by the user
     * and returns the string representation which is then parsed into an integer because
     * the arraylist is of integer type. Value is added into the values (arraylist) 
     * @param key
     * @param value
     */
    public Dictionary(int key, String value) {
        this.keys.add(Integer.valueOf(key));
        this.values.add(value);    
    }
    
    /**
     *  Initialization happens in array form for both keys and values
     *  
     * @param keys
     * @param values
     */
    public Dictionary(int[] keys, String[] values) {
        if(keys.length > 20 | values.length > 20) {//If the length of either keys or values exceeds 20 
            System.out.println("Error maximum entries for dictionary is 20");//display the error message, because
            //the lists cannot exceed more than 20, since the size was specified in the beginning of the class
        } if(keys.length != values.length) { // If the length of the keys exceeds values or vice versa
            System.out.println("Error each key must have a corresponding value");//display the error message
            	// since it has to be a (key,value) pair. So, for every key there must be a corresponding value
        } else { //otherwise      
            for(int i = 0; i < keys.length; i++) {// for every i... over the keys arraylist                          
               if(this.keys.contains(Integer.valueOf(keys[i]))) { // checks to see if all the keys are unique
            	   // as multiple keys can have same values but vice versa is not allowed
                   System.out.println("Error duplicate keys aren't allowed");// hence it displays error message
                   // if multiple values have same keys 
                   System.out.println("Duplicate key and corresponding value ommited");
               } else {//otherwise
                   this.keys.add(Integer.valueOf(keys[i]));// add the keys
                   this.values.add(values[i]);// and corresponding values to the arraylists keys,values
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