package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p> 6 1*2*3*4*5*6
 */
public class Factorial {
    public int getFactorial(int number) {
        return number == 0 ? 1 : number * getFactorial(number - 1);
    }
}
