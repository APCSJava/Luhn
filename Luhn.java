/**
*
* A utility class providing methods related to Luhn values.
*
*/

public final class Luhn {
    
    // hide the constructor
    private Luhn() {}
    
    /**
     * Determine whether the integer provided satisfies the Luhn
     * algorithm.
     * 
     * @param toBeTested the number to check for compliance
     * 
     * @return true, if the number is valid; false, otherwise
     *
     */
    public static boolean checkValid(int toBeTested) {
        //to be implemented
    }
    
    /**
     * Given an arbitrary int value, determine the rightmost check digit that
     * when added as the least significant bit will result in a new number,
     * one digit longer, that forms a valid Luhn number.
     * 
     * @param incomplete a number lacking a check digit
     * 
     * @return a single digit that when concatenated onto the right side of the
     *     parameter supplied will result in a valid Luhn number. 
     */
    public static int generate(int incomplete) {
        // to be implemented
    }
    
    // If you wish to write additional method headers and implement them
    // (perhaps to handle String or long arguments, for example), please do so 
    // in the space below.  
    
}
