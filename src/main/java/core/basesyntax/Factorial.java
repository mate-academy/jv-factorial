package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        int factorial = 1;
        if (number == 0) {
            return factorial;
        }
        if (number == 1) {
            return factorial;
        }
        factorial = number * getFactorial(number - 1);
        return factorial;
    }
}
