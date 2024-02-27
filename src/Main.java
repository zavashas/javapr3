import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            String dropProbel = input.replaceAll("\\s", "").toLowerCase();
            boolean palindrome = true;

            for (int i = 0; i < dropProbel.length() / 2; i++) {
                if (dropProbel.charAt(i) != dropProbel.charAt(dropProbel.length() - 1 - i)) {
                    palindrome = false;
                    break;
                }
            }

            if (palindrome) {
                System.out.println("Строка является палиндромом");
            } else {
                System.out.println("Строка не является палиндромом.");
                break;
            }
        }
        scanner.close();
    }
}
