package Homework5;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int aray[] = new int [25];
        Random rand = new Random();
        for (int i = 0; i < aray.length; i++) {
            aray[i] = rand.nextInt(16);
        }
        System.out.printf("Original array is \t%s\n", arrToString(aray));
        HeapSort(aray);
        System.out.printf("Sorted array is \t%s\n", arrToString(aray));
    }
    public static void HeapSort(int[] numbers) {
        int arrLen = numbers.length;

        
        for (int i = arrLen / 2 - 1; i >= 0; i--) {
            heapify(numbers, arrLen, i);
        }

        for (int i = arrLen - 1; i >= 0; i--)
        {
            
            swap(numbers, i, 0);

            
            heapify(numbers, i, 0);
        }
    }

    private static int getRight(int i) {
        return 2 * i + 2;
    }
    private static int getLeft(int i) {
        return 2 * i + 1;
    }
    public static void swap(int[] aray, int i, int j) {
        int tmp = aray[i];
        aray[i] = aray[j];
        aray[j] = tmp;
    }


    public static void heapify(int aray[], int heapLen, int source) {
        int bigest = source;            
        int left = getLeft(source);      
        int right = getRight(source);    

        
        if (left < heapLen && aray[left] > aray[bigest]) bigest = left;
        if (right < heapLen && aray[right] > aray[bigest]) bigest = right;
        if (bigest != source) {
            swap(aray, source, bigest);
            heapify(aray, heapLen, bigest);
        } 
    }

    private static String arrToString(int[] aray) {
        StringBuilder result = new StringBuilder();
        result.append("[ ");
        for (int i : aray) {
            result.append(String.format("%s ", i));
        }
        result.append("]");
        return result.toString();
    }
    

}
