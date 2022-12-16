package Homework_2.Task_4;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) throws IOException{

        Logger log = Logger.getLogger(Task_4.class.getName());
        FileHandler fh = new FileHandler("Calculator.log");
        log.addHandler(fh);
        fh.setFormatter(new SimpleFormatter());

        System.out.println("Введите, пожалуйста, первое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        log.setLevel(Level.INFO);
        log.log(Level.INFO, String.format("Enter first diggit = " + number));
        System.out.println("Введите, пожалуйста, второе число: ");
        int numberOne = scan.nextInt();
        log.setLevel(Level.INFO);
        log.log(Level.INFO, String.format("Enter second diggit = " + numberOne));
        System.out.println("Введите, пожалуйста, операцию, которую хотели-бы произвести(+, -, *, /) ");
        String Symb = scan.next();
        log.setLevel(Level.INFO);
        log.log(Level.INFO, String.format("Enter symbol diggit = " + Symb));
        System.out.println("Ваше выражение: \n" + number + Symb + numberOne);
        switch (Symb){
            case "+":
            int result = number + numberOne;
            System.out.println("= " + result);
            log.setLevel(Level.INFO);
            log.log(Level.INFO, String.format("= " + result));
            break;
            case "-":
            int result1 = number - numberOne;
            System.out.println("= " + result1);
            log.setLevel(Level.INFO);
            log.log(Level.INFO, String.format("= " + result1));
            break;
            case "*":
            int result2 = number * numberOne;
            System.out.println("= " + result2);
            log.setLevel(Level.INFO);
            log.log(Level.INFO, String.format("= " + number + " * " + numberOne));
            break;
            case "/":
                if (numberOne != 0){
                    int result3 = number / numberOne;
                    System.out.println("= " + result3);
                    log.setLevel(Level.INFO);
                    log.log(Level.INFO, String.format("= " + number + " / " + numberOne));
                    break;
                }
                else {
                    System.out.println("Are you trying to divide by" + numberOne);
                    log.setLevel(Level.INFO);
                    log.log(Level.WARNING, String.format("divide by" + numberOne));
                    break;
                }

        }
        scan.close();
    
    
    }
    
}
