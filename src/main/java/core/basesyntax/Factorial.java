package core.basesyntax;

public class Factorial {
    public int getFactorial(int number) {
        int result = 1;
        if (number == 1 || number == 0) {
            return 1;
        }
        result = number * getFactorial(number - 1);
        return result;
    }
}
