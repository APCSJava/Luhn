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
    public static boolean checkValid(long toBeTested) {
        long sum = 0;
        while (toBeTested/100>0) {
            long currentPair = toBeTested%100;
            toBeTested = toBeTested/100;
            sum += currentPair%10;
            long secondDigit = currentPair/10;
            long doubled = secondDigit*2;
            if (doubled >= 10) {
                sum+=doubled%10+1;
            } else {
                sum+=doubled;
            }
        }
        return sum%10==0;
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
    public static long generate(long incomplete) {
        for (int i = 0; i<10; i++) {
            long proposed = incomplete*10+i;
            if (Luhn.checkValid(proposed)){
              return proposed;  
            } 
        }
        return -1;
    }
    
    public static int getLuhnRemainder(int toBeTested) {
        return 0;
    }
    
}