# Luhn
Working with the Luhn algorithm for validating numerical data entry

In this project, you will explore the Luhn algorithm,  a method for detecting typing errors that can occur when entering long number sequences (credit card numbers, certain ID numbers, etc.) 

Create a Java class, Luhn, that meets the following specifications:
*Provides a static method, checkValid, that returns true if an int argument representing the account number and check digit passes the Luhn mod10 test; false, otherwise
*Provides a static method, generate, that determines the [rightmost, missing] check digit required for a given account number to pass the test
*Does not provide a main method

Create a second Java class, LuhnTester, that meets the following specifications:
*Contains a main method 
*Tests whether the Luhn check method works for a known good sequence -- perhaps, a number you have verified by hand?**
*Tests whether the Luhn generate method returns the correct check digit for valid, positive int's**

** Note: the specification above requires only that your code must work for all possible int values; however, in the real world account numbers are typically longer than can fit into an int value.  If you'd like to create code that can handle longer numbers (like a 16-digit bank card) you will need to  add additional methods to your Luhn class that accept a "long" or a "String" sequence. I encourage you to do so and to add additional methods but DO NOT ALTER THE EXISTING METHODS.
