import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        int count = 0;
        boolean itIs = false;
        for (long i = number; i > 0; i--) {
            if (count >= 2) {
                itIs = true;
                break;
            }
            if (number % i == 0) {
                count++;
            }
        }
        return itIs;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}