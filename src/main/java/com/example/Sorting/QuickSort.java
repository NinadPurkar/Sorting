package main.java.com.example.Sorting;

public class QuickSort {


    public static int PartitionPoint(int arr[], int start, int end)
    {
        int pivot = arr[end];
        int pindex = start;
        int temp;
        for (int i = start; i < end; i++)
        {
            if(arr[i] <= pivot)
            {
                temp = arr[i];
                arr[i]  = arr[pindex];
                arr[pindex]= temp;
                pindex++;
            }
        }
        temp = pivot;
        arr[end] = arr[pindex];
        arr[pindex] =  pivot;

        return pindex;
    }

    public static void QuickSortMethod(int arr[],int startIndex, int lastindex)
    {
        if (startIndex < lastindex)
        {
            int partionpointindex = PartitionPoint(arr,startIndex,lastindex);

            QuickSortMethod(arr,startIndex,partionpointindex-1);
            QuickSortMethod(arr,partionpointindex+1,lastindex);
        }

    }

    public static void main(String gg[])
    {
        System.out.println("This is Quick Sort");

        int array[] = {1,1,5,7,8,5,4,3,88,99,55,44};
        QuickSortMethod(array, 0 , 11);
        for (int j : array) {
            System.out.println(j);
        }
    }
}
