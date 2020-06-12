import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peanut = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        System.out.println((isWeekend && peanut >= 15 && peanut <= 25) || (!isWeekend && peanut >= 10 && peanut <= 20));
    }
}