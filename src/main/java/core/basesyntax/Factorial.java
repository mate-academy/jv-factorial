package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        int fac = 1;
        if (number == 1 | number == 0) {
            return fac;
        }
        fac = number * getFactorial(number - 1);
        return fac;
    }
}
