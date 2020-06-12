import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int ticket = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();

        int total = foodCostPerDay * days + ticket * 2 + hotelCostPerNight * (days - 1);
        System.out.println(total);
    }
}