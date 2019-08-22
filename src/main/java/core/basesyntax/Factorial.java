package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < number; i++){
            result *= number - i;
        }
        return result;
    }
}
