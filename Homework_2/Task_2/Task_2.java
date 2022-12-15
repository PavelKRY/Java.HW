package Homework_2.Task_2;
import java.util.Random;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;


public class Task_2 {
    public static void main(String[] args) throws IOException  {

        int[] arr = new int[10];
        Random rand = new Random();
        int tmp = 0;
        Logger log = Logger.getLogger(Task_2.class.getName());
        FileHandler fh = new FileHandler("logger.log");
        log.addHandler(fh);
        fh.setFormatter(new SimpleFormatter());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(11);
        }
            
        for (int j = 0; j < arr.length-1; j++) {
            for (int k = j+1; k < arr.length; k++) {
                if (arr[k]<arr[j]){
                    tmp = arr[j];
                    log.setLevel(Level.INFO);
                    log.log(Level.INFO, String.format("Присвоили tmp значение для дальнейшей сортировки"));
                    arr[j] = arr[k];
                    arr[k] = tmp;
                    log.setLevel(Level.INFO);
                    log.log(Level.INFO, String.format("Поменяли местами значения, меньшее убрали влево, согласно пузырьковой сортировке"));
                }
                String str = Arrays.toString(arr);
                System.out.println(str);
                log.log(Level.INFO, String.format(str));
    }
}
        System.out.println(Arrays.toString(arr));
        String str = Arrays.toString(arr);
        log.log(Level.INFO, String.format("Сортировка окончена, результат достигнут"));
        log.log(Level.INFO, String.format(str));
    }
}