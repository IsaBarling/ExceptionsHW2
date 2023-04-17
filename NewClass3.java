import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Введите строку: ");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Пустые строки вводить нельзя!");
                throw new IllegalArgumentException("Пустая строка");
            }
        } while (input.isEmpty());

        System.out.println("Вы ввели: " + input);
    }
}
