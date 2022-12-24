import java.util.ArrayList;

import java.util.Collections;


public class Task_3 {
    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>();


        for(int i = 0; i < 10; i++){
            nums.add((int)(Math.random()*100));
        }

        System.out.println(nums);

        int min = Collections.min(nums);
        int max = Collections.max(nums);
        int average = nums.get(nums.size()/2);
        // while (iterator.hasNext()){
        //     tmp = iterator.next();
        //     if (tmp > (max)){
        //         max = tmp;
        //         tmp = 0;
        //     }
    
        // if (tmp < (min)){
        //     min = tmp;
        //     tmp = 0;
        // }
        // average += iterator.next();
    
    System.out.println("min = " + min);
    System.out.println("max = " + max);
    System.out.println("average = " + average);
}
}
