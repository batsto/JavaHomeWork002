import java.util.Random;

// 2. Реализовать алгоритм сортировки вставками.



public class task002 {
    public static int[] arrayBilder(int count){
        int[] Arr = new int[count];
        Random rand = new Random();
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = rand.nextInt(100);
        }
        return Arr;
    }

    public static void printArray(int[] Array){
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + ", ");
        }
        System.out.println();
    }

    public static int[] sortArray(int[] Array){
        int temp;
        int len = Array.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && Array[j] < Array[j-1]; j--) {
                temp = Array[j];
                Array[j] = Array[j-1];
                Array[j-1] = temp;
            }
        }
        return Array;
    }

    public static void main(String[] args) {
        
        int[] Arr = arrayBilder(10);
        printArray(Arr);
        Arr = sortArray(Arr);
        printArray(Arr);
    }

    
}
