/**Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
import java.util.Scanner;

public class Task_s2_4 {
    public static void main(String[] args) {

        System.out.print("Введите данные: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        } else {
            System.out.println("Вы ввели " + input);
        }
    }
}
