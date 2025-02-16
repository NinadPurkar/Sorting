package main.java.com.example.Sorting;

public class BubbleSort {

    public static void BubbleSortMethod(int arr[], int n)
    {
        int temp;
        // How to remember Buble sort loops.
        // So we are creating bubbles all over the array So inner for loop.
        // Now how many times we will need to create this bubles. that is n-2 times.
        // so the outer loops how many times to create these bubles , inner to create bubble.
        for(int k=0;k<n-2;k++)
        {

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }

    public static void main(String gg[])
    {
        System.out.println("Hello world Its your Bubble sort");

        int array[] = {1,1,5,7,8,5,4,3,88,99,55,44};
        BubbleSortMethod(array,array.length);
        for (int j : array) {
            System.out.println(j);
        }
    }
}
