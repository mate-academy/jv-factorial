package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        int numberFactorial = 1;
        if (number == 0 || number == 1) {
            return 1;
        }
        return numberFactorial = number * getFactorial(number - 1);
    }
}
