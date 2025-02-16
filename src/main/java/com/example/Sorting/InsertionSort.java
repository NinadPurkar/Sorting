package main.java.com.example.Sorting;

public class InsertionSort {

    public static void InsertionSortMethod(int arr[] , int n)
    {
        for(int i=0;i<n;i++)
        {
            int value = arr[i];
            int hole = i;
            while(hole > 0 && arr[hole-1] > value)
            {
                arr[hole] = arr[hole-1];
                hole--;
            }
            arr[hole] = value;
        }
    }

    public static void main(String gg[])
    {
        System.out.println("This is Insertion Sort");

        int array[] = {1,1,5,7,8,5,4,3,88,99,55,44};
        InsertionSortMethod(array,array.length);
        for (int j : array) {
            System.out.println(j);
        }
    }


}
