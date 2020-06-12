import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int day = 0;
        int feet = 0;
        boolean reached = false;

        while (!reached) {
            day++;
            feet += up;
            if (feet >= height) {
                reached = true;
                System.out.println(day);
                break;
            }
            feet -= down;
        }
    }
}