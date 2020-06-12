import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourFirst = scanner.nextInt();
        int minuteFirst = scanner.nextInt() + hourFirst * 60;
        int secondFirst = scanner.nextInt() + minuteFirst * 60;
        
        int hourAnother = scanner.nextInt();
        int minuteAnother = scanner.nextInt() + hourAnother * 60;
        int secondAnother = scanner.nextInt() + minuteAnother * 60;

        System.out.println(secondAnother - secondFirst);


    }
}