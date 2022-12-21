
package Homework4;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            nums.add(i);
        }
        System.out.println(nums);
        System.out.println(ReturnSwapList(nums));

    }

    private static LinkedList<Integer> ReturnSwapList(LinkedList<Integer> list) {

        for (int i = list.size() - 1; i >= 0; i--) {
            int tmp = list.get(i);
            list.remove(i);
            list.add(tmp);
        }
        return list;

    }
}