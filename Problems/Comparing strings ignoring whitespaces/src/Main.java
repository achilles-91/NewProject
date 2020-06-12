import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine().replace(" ", "");
        String b = scanner.nextLine().replace(" ", "");
        System.out.println(a.equals(b));

        System.out.println(a.substring(0, 3));

//        String str = "a simple string";
//
//        str = str.replace("a", "A SIMPLE");
//        System.out.println(str);

        String str = "a simple string";
        str.c
        str = str.replace("a", "A SIMPLE").substring(2, 8);

//        moze i ovako, samo ne prihvata rjesenje
//        System.out.println(new Scanner(System.in).nextLine().replace(" ", "").equals(new Scanner(System.in).nextLine()));
    }
}