import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int check = scanner.nextInt();
            if (check == 1) {
                larger++;
            } else if (check == -1) {
                smaller++;
            } else if (check == 0) {
                perfect++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}