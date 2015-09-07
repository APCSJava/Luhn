# Luhn
Working with the Luhn algorithm for validating numerical data entry

In this project, you will explore the Luhn algorithm,  a method for detecting typing errors that can occur when entering long number sequences (credit card numbers, certain ID numbers, etc.) 

## Implement the class Luhn:
* Implement the static method *checkValid()* to return true if an int argument passes the Luhn mod10 test; return false, otherwise
* Implement the static method *generate()* to determine the [rightmost, missing] check digit that must be appended to the supplied parameter to transform it into a Luhn number (ie. if '123' is provided, return '0' since '1230' is valid)
* This class serves as a utility class to be used by other classes.  Do not add a *main()* method.  Observe the hidden constructor.

##Implement the class LuhnTester:
* Implement the *main()* method 
* Invoke the method Luhn.checkValid() [and print the result] to determine whether it returns the correct result for both valid and invalid Luhn sequences. **
* Invoke the method Luhn.generate() [and print the result] to verify that it generates valid check digits when given a positive int argument.**

** Note: the specification above requires only that your code must work for all possible int values; however, in the real world account numbers are typically longer than can fit into an int value.  If you'd like to create code that can handle longer numbers (like a 16-digit bank card) you will need to  add additional methods to your Luhn class that accept a "long" or a "String" sequence. I encourage you to do so and to add additional methods but DO NOT ALTER THE EXISTING METHODS.
