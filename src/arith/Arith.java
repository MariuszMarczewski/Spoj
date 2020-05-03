package arith;

import java.util.Scanner;

public class Arith {

    public void operate(int n){
        for (int i = 0; i < n; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Wprowadź działanie arytmetyczne: ");
            String s = in.nextLine();
            makeOperation(s);
        }
    }

    public void makeOperation(String s) {
        if(s.contains("+")){
            makeAddition(s);
        }
    }

    private void makeAddition(String s) {
        String[] split = s.split("\\+");

        System.out.println(" " + split[0]);
        System.out.println("+" + split[1]);
        System.out.print(" ");
        for (int i = 0; i < split[0].length(); i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println(" " + (Integer.parseInt(split[0]) + Integer.parseInt(split[1])));
    }

}
