import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        int firstClass = firstGroup / 2 + firstGroup % 2;
        int secondClass = secondGroup / 2 + secondGroup % 2;
        int thirdClass = thirdGroup / 2 + thirdGroup % 2;

        int total = firstClass + secondClass + thirdClass;

        System.out.println(total);
    }
}