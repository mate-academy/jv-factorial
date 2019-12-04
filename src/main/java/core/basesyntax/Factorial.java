package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        if (number == 2) {
            return 2;
        }
        return number * getFactorial(--number);
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().getFactorial(5));
    }
}
