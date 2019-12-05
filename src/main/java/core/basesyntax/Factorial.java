package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        int factorial = 1;
        if (number == 0 || number == 1) {
            return factorial;
        }
        return number * getFactorial(--number);
    }
}
