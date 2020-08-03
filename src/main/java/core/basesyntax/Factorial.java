package core.basesyntax;

public class Factorial {
    public int getFactorial(int number) {
        return number == 0 ? 1 : number * getFactorial(number - 1);
    }
}
