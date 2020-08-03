package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        int result = 1;
        return (number == 0 || number == 1) ? result :
                number * getFactorial(number - 1);
    }
}
