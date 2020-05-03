package palindrome;

import java.util.*;

public class Palin {

    public void operatePalindrome(int n) {
        for (int i = 0; i < n; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            int a = in.nextInt();
            in.nextLine();
            System.out.println(findPalindrome(a));
        }
    }

    public int findPalindrome(int a) {
        List<Integer> list = new ArrayList<>();
        for (int i = a + 1; i < 1000; i++) {
            if(isPalindrome(i)){
                list.add(i);
            }
        }
        return Collections.min(list);
    }

    public boolean isPalindrome(int a) {
        String s = String.valueOf(a);
        String[] array = s.split("");
        String[] arrayCopy = Arrays.copyOf(array, array.length);

        String[] reversedArray = reverseArray(array);

        if (Arrays.equals(reversedArray, arrayCopy)) {
            return true;
        }
        return false;
    }

    private String[] reverseArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        return sb.reverse().toString().split("");
    }

    public int convertStringArrayToInt(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        return Integer.parseInt(sb.toString());
    }

}
