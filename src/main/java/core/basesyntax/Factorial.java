package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.</p>
 */
public class Factorial {

    public int getFactorial(int number) {
        return (number == 1 || number == 0) ? 1 : getFactorial(number - 1) * number;
    }
}
