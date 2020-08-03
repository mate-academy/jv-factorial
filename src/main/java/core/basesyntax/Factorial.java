package core.basesyntax;

public class Factorial {
    public int getFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }
}
