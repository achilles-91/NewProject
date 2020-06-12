import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".contains(String.valueOf(ch));

//        if (ch == 65 || ch == 97 || ch == 69 || ch == 101 || ch == 105 || ch == 73 ||
//            ch == 79 || ch == 111 || ch == 85 || ch == 117) {
//            return true;
//        }
//        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}