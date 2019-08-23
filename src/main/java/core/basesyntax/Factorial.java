package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.</p>
 */
public class Factorial {
    public int getFactorial(int number)
    {
        return number == 0 || number == 1 ? 1 : number * getFactorial(number - 1);
    }
}
