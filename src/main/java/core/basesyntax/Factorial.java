package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public static int getFactorial(int number) {
        return (number == 0 || number == 1) ? 1 : number * getFactorial(number - 1);
    }
}
