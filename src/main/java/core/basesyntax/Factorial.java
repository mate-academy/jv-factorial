package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.</p>
 */
public class Factorial {

    public int getFactorial(int number) {
        int factorial;

        if (number == 1 || number == 0) {
            return 1;
        }

        factorial = getFactorial(number - 1) * number;
        return factorial;
    }
}
