package main.java.com.example.Sorting;
public  class SelectionSort
{

    public static void SelectionSortMethod(int arr[], int n)
    {
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>=arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World");

        int[] array = {1,5,8,7, 9,4,6,6,6,9};

        SelectionSortMethod(array, array.length);

        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

    }
}