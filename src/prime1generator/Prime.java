package prime1generator;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {

    public void showPrimes(int n) {
        for (int i = 0; i < n; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter first value: ");
            int b = in.nextInt();
            in.nextLine();
            System.out.println("Enter second value: ");
            int c = in.nextInt();
            in.nextLine();
            isPrime(b, c);
        }
    }

    private void isPrime(int b, int c) {
        if (b <= 0 || c <= 0 || b == c) {
            throw new IllegalArgumentException("Values need to be natural and must not be equal");
        }
        if (b < c) {
            checkPrime(b, c);
        }
    }

    private void checkPrime(int b, int c) {
        for (int i = b; i <= c; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime(100);
            if (probablePrime) {
                System.out.println(i);
            }
        }
    }

}
