package core.basesyntax;

public class Factorial {

    public int getFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        int[] abc = new int [number];
        for (int i = 1; i <= abc.length; i++) {
            abc[abc.length - i] = number;
            number--;
        }
        return abc[abc.length - 1] * getFactorial(abc[abc.length - 2]);
    }
}
