import java.util.ArrayList;


public class Task_2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>();


        for(int i = 0; i < 10; i++){
            nums.add((int)(Math.random()*100));
        }
        System.out.println(nums);

        for(int i = nums.size()-1; i >= 0; i--){
            if (i%2 != 0){
                nums.remove(i);
        }
        // System.out.println(nums);
    }
    System.out.println(nums);
}
}