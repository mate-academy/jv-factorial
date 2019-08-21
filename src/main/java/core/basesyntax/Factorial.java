package core.basesyntax;

/**
 * Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 */
public class Factorial {
    public int getFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return (number == 1 ? 1 : number * getFactorial(number - 1));
    }
}
