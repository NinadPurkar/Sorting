package main.java.com.example.Sorting;

public class MergeSort {

    public static void Merge(int arrLeft[],int arrRight [], int arr[])
    {
        int i=0;
        int j=0;
        int k=0;
        while(i<arrLeft.length && j<arrRight.length)
        {
            if(arrLeft[i] < arrRight[j])
            {
                arr[k] = arrLeft[i];
                k++;
                i++;
            }
            else
            {
                arr[k] = arrRight[j];
                k++;
                j++;
            }
        }
        while(i<arrLeft.length)
        {
            arr[k] = arrLeft[i];
            i++;
            k++;
        }
        while (j<arrRight.length)
        {
            arr[k] = arrRight[j];
            j++;
            k++;
        }
    }

    public static  void MergeSortMethod(int arr[])
    {
        int n = arr.length;
        int mid = arr.length/2;
        if (n<2)
        {
            return;
        }
        int l = arr.length/2;
        int r = arr.length/2;
        int arrLeft[] = new int [mid];
        int arrRight[]= new int [n-mid];

        for(int i=0;i<mid;i++)
        {
            arrLeft[i]= arr[i];
        }
        for (int i=mid;i<n;i++)
        {
            arrRight[i-mid]=arr[i];
        }
        MergeSortMethod(arrLeft);
        MergeSortMethod(arrRight);
        Merge(arrLeft,arrRight,arr);

    }


    public static void main(String gg[])
    {
        System.out.println("This is Quick Sort");

        int array[] = {1,1,5,7,8,5,4,3,88,99,55,44};
        MergeSortMethod(array);
        for (int j : array) {
            System.out.println(j);
        }
    }
}
