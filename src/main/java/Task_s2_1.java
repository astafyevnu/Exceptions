/** Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_s2_1 {
    public static void main(String[] args) {

        while (true) {
            System.out.print("Введите дробное число: ");
            try {
                System.out.println("Вы ввели: " + input());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод данных! Вы ввели текст.");
            }
        }

    }
    public static float input() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }
}
