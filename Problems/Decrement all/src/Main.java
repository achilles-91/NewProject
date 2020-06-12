import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int firstNum = scanner.nextInt();
//        int secondNum = scanner.nextInt();
//        int thirdNUm = scanner.nextInt();
//        int fourthNum = scanner.nextInt();

//        System.out.println(--firstNum + " " + --secondNum + " " + --thirdNUm + " " + --fourthNum);

        char ch = 65;
        int b = ch;
        System.out.println("ch  > " + ch);

        char ch1 = '\u00D0';
        System.out.println(ch1);
        System.out.println(++ch1);


        char ch3 = '\u0031' + '\u0035';
        System.out.println("ch3 > " + ch3);

        char test = '1' + '3';
        char test1 = '3';
        System.out.println(test);

        char test2 = 'z' + 'a';
        System.out.println("test2 > " + ++test2);
        System.out.println("sdada\n \\ dasda ");

        String name = "Marko je kralj ";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        char lastChar = name.charAt(name.length() -1);
        System.out.println(lastChar);
        name.toUpperCase();
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.startsWith("Marko "));
        System.out.println(name.contains("ra"));
        System.out.println(name.substring(4, 9));
        System.out.println(name.replace('k', 'f'));
        System.out.println(name.trim());
        System.out.println(name);

        String firstName = "Markiza";
        String lastName = "Milanukus";
        String fullName = firstName + " " + lastName;
        String fullName1 = firstName.concat(" ").concat(lastName).concat(" ").concat("wufuuuuuuuu");
        System.out.println(fullName1);
        String firstNameLowerLet = "markiza";
        System.out.println(firstName.equals(firstNameLowerLet));
        System.out.println(firstName.equalsIgnoreCase(firstNameLowerLet));
    }
}