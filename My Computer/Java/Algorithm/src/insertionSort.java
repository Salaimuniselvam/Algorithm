import java.util.Scanner;

class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    public static void main(String args[])
    {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter the NO of elements of array");
        int n=reader.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");

//        Getting User Inputs For  the array
        for(int i=0;i<n;i++){
            arr[i]= reader.nextInt();
        }
//        Before Sorting the array
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println();
        printArray(arr);
    }
}
