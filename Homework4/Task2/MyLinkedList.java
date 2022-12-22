package Homework4.Task2;

public class MyLinkedList {

    int[] arr;
    int size = 0;
    int index = 0;

    public MyLinkedList(){
        arr = new int[10]; 
    }
    public MyLinkedList(int size){
        arr = new int[size];
    }


    public void enqueue(int item) {
        arr[index++] = item;
        size++;
        if(size>arr.length -2){
            rebuildArr();
        }
    }
    private void rebuildArr(){
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
}
    public int dequeue() {
            size--;
            int temp = arr[0];
            arr[0] = 0;
            index--;
            return temp;
            
    }
    public int first() {
        
        return arr[0];
}
    public int[] get(){
        return arr;
    }
}