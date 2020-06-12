import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimum = scanner.nextInt();
        int recomended = scanner.nextInt();
        int sleep = scanner.nextInt();

        if (sleep >= minimum && sleep <= recomended) {
            System.out.println("Normal");
        } else if (sleep < minimum) {
            System.out.println("Deficiency");
        } else if (sleep > recomended) {
            System.out.println("Excess");
        }
    }
}