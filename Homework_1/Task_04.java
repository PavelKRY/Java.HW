package Homework_1;
import java.util.Scanner;


public class Task_04 {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, первое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Введите, пожалуйста, второе число: ");
        int numberOne = scan.nextInt();
        System.out.println("Введите, пожалуйста, операцию, которую хотели-бы произвести(+, -, *, /) ");
        String Symb = scan.next();
        System.out.println("Ваше выражение: \n" + number + Symb + numberOne);
        switch (Symb){
            case "+":
            System.out.println("= " + number + numberOne);
            break;
            case "-":
            System.out.println("= " + (number - numberOne));
            break;
            case "*":
            System.out.println("= " + number * numberOne);
            break;
            case "/":
            System.out.println("= " + number / numberOne);
            break;
        }
        scan.close();


}
}