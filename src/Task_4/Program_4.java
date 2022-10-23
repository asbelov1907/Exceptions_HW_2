package Task_4;

import java.util.Scanner;

/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Program_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        if (in == ""){
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
        else System.out.println("Вы ввели " + in);

    }

}
