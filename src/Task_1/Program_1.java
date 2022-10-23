package Task_1;

import java.util.Scanner;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
запросить у пользователя ввод данных.
 */
public class Program_1 {
    public static void main(String[] args) {
        CheckNumber();
    }
    public static void CheckNumber(){
        System.out.print("Введите число: ");
        Scanner number = new Scanner(System.in);
        if(number.hasNextFloat()){
            System.out.println("Вы ввели " + number.nextFloat());
        }
        else{
            System.out.println("Вы ввели не число. Повторите ввод");
            CheckNumber();
        }
    }

}
