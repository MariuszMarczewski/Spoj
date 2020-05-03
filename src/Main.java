import arith.Arith;
import factorial.Factorial;
import palindrome.Palin;
import prime1generator.Prime;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int i = factorial.makeSilniaRecursive(4);
        System.out.println(i);
    }
}
