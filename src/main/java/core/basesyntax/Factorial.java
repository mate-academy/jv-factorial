package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        return number = (number == 1) ? number : (number == 0) ? 1
            : number * getFactorial(number - 1);
    }

}
