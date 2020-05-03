package factorial;

public class Factorial {

    public int makeSilnia(int a){
        int z = 1;
        for (int i = 2; i <= a; i++) {
           z *= i;
        }
     return z;
    }

    public int makeSilniaRecursive(int a){
        if (a == 0){
            return 1;
        }
        return a * makeSilniaRecursive(a-1);
    }

}
