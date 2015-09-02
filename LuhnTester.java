import java.math.BigInteger;

public class LuhnTester {
    public static void main(String[] args) {
        System.out.println("The number provided is a Luhn number: "+Luhn.checkValid(new Long.parseLong(args[0])));
        long incompleteSequence = Long.parseLong(args[1]);
        System.out.println("The Luhn check digit for "+ incompleteSequence+" is "+Luhn.generate(incompleteSequence));
    }
}