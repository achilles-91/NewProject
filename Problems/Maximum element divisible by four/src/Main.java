import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;

        for (int i = scanner.nextInt(); i > 0; i--) {
            int numb = scanner.nextInt();
            if (numb % 4 == 0 && numb > largest) {
                largest = numb;
            }
        }
        System.out.println(largest);
    }
}