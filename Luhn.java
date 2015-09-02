/**
*
* A utility class providing methods for using the Luhn algorithm.
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
     * Given an arbitrary number, determine the rightmost check digit that
     * when added as the least significant bit will result in a new number,
     * one digit longer, that forms a valid Luhn number.
     * 
     * @param incomplete a number lacking a check digit
     * 
     * @return a valid Luhn number consisting of the original input with an
     *     additional check digit appended as the rightmost value.
     */
    public static int generate(int incomplete) {
        // to be implemented
    }
    
}