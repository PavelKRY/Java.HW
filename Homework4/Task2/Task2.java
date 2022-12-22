package Homework4.Task2;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        MyLinkedList outputs = new MyLinkedList(15);
        outputs.enqueue(1);
        outputs.enqueue(2);
        outputs.enqueue(3);
        System.out.println(Arrays.toString(outputs.get()));
        System.out.println(outputs.first());
        System.out.println(outputs.dequeue());
        outputs.dequeue();
        System.out.println(Arrays.toString(outputs.get()));
    }
}
