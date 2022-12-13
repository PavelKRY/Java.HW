package Homework_1;
public class Task_02 {
    public static void main(String[] args) {
        int treangle = 5;
        int SumTreangle = 1;
        for (int i = 1; i < treangle+1; i++){
            SumTreangle *= i;
        }
        System.out.println(SumTreangle);
    }
}
