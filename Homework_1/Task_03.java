package Homework_1;

public class Task_03 {
    public static void main(String[] args) {
        
        // boolean flag =true;
       
        for(int i = 2; i < 1001; i++){
            int k = 0;
            
            for (int j=2; j <= i; j++ ){
                if(i%j == 0){
                    k++;
                }
            }
            if(k<2){
                System.out.println(i);

            }
// решение с boolean почему-то выдавало не верные решения(55,209 и т.д.)
                    // if (i % j == 0){
                    //     flag = false;
                    //     break;
                    // }
                    // if (i % 5 == 0){
                    //     flag = false;}
                    //     if (i % 5 == 0){
                    //         flag = false;}
                    // if (i==5)
                    // {
                    //     flag = true;
                    // }
                    // if (flag){
                    //     System.out.println(i);
                    //     break;
                    // }
                    // else{
                    //     flag = true;
                    }
                }
            }
        

