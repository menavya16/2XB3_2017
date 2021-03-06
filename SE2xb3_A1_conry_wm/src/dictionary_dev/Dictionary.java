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
                   System.out.println("Duplicate key and corresponding value ommited"); // This message is a little unclear
               } else {//otherwise
                   this.keys.add(Integer.valueOf(keys[i]));// add the keys
                   this.values.add(values[i]);// and corresponding values to the arraylists keys,values
               }
           }
        }
    }
    /**
     * Inserts a (key,value) pair in the arraylist. This is quite similar to the constructor
     * SUGGESTION - instead of using add methods of arraylist, the insert method
     * created here could be used to push the pair on the arraylist.
     * This code also looks like a repetition of the constructor which takes key and value arrays
     * as arguments
     * 
     * @param key
     * @param value
     */

    public void insert(int key, String value) {
        if (this.keys.size() == 20) { // when the (key,value) pair is inserted, if the size of the 
        	//array is already 20
            System.out.println("Error dictionary is full with 20 entries");//it displays an error message
        }
        
        /**Too similar to the Dictionary(int[] keys, String[] values) constructor
         * see that constructor for the comments**/
        if (this.keys.contains(Integer.valueOf(key))) {
            System.out.println("Error duplicate keys aren't allowed");
        } else {
            this.keys.add(Integer.valueOf(key));
            this.values.add(value);
        }
    }

    /** 
     * @param key
     * @return For a given input key, the string value is returned
     */
    public String getValue(int key) {
    	// instantiation of new variable was unnecessary, return statement could have been 
    	//return this.values.get(this.keys.indexOf(Integer.valueOf(key)));
        int index = this.keys.indexOf(Integer.valueOf(key));
        return this.values.get(index);
    }
    
    /**
     * @param value
     * @return key for a String value that user has input
     */
    public int getKey(String value) {
    	// allocation of new memory unnecessary as both 
    	//the statements can be merged into one
        int index = this.values.indexOf(value);
        return this.keys.get(index).intValue();
    }
    
    /**
     *When the user inputs the key, the corresponding (key,value) pair is removed from the 
     *arraylist
     * @param key
     */ 
    public void remove(int key) {
        int index = this.keys.indexOf(Integer.valueOf(key));
        this.values.remove(index);
        this.keys.remove(index);
    }
    
    /**
     * Compares the string values at two different keys to check whether 
     * or not the values are the same
     * @param key1
     * @param key2
     * @return
     */
    public boolean compare(int key1, int key2) {
        int index1 = this.keys.indexOf(key1);
        int index2 = this.keys.indexOf(key2);
        if(this.values.get(index1).equals(this.values.get(index2))) {//If the value of the two keys are equal
            return true;// it returns true
        } else {// otherwise 
            return false;// it returns false
        }
    }
    
    /**
     * @param key
     * @return checks whether or not key exists in the arraylist
     */
    public boolean contains(int key) {
        return this.keys.contains(Integer.valueOf(key));
    }
    
    /**
     * 
     * @return total (key,value) pairs in the list
     */
    public int count() {
    	return this.keys.size();
    }
    
    /**
     * @return - true if the list is empty false if otherwise
     */
    public boolean isEmpty() {
    	return this.keys.isEmpty();
    }
    
    /**
     * prints the keys in {key1,key2,key3} format
     */
    public void printKeys() {
    	System.out.print("{");
    	for(int i = 0; i < this.keys.size(); i++) {
    		System.out.print(this.keys.get(i));
    		System.out.print(", ");
    	}
    	System.out.print("}");
   	} 

}