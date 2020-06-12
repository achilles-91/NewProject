import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("How many squirrels?");
        int squirrels = scanner.nextInt();
//        System.out.println("How many nuts?");
        int nuts = scanner.nextInt();

        System.out.println(nuts % squirrels);
    }
}