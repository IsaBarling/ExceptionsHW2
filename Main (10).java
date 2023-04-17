import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float user_input = getFloatInput("Введите дробное число: ");
        System.out.println("Вы ввели: " + user_input);
    }

    public static float getFloatInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            try {
                float value = Float.parseFloat(scanner.next());
                if (Math.floor(value) == value) {
                    throw new IllegalArgumentException();
                }
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Ошибка: Введенное значение должно быть дробным числом. Попробуйте еще раз.");
            } catch (IllegalArgumentException ex) {
                System.out.println("Ошибка: Введенное значение не должно быть целым числом. Попробуйте еще раз.");
            }
        }
    }
}

