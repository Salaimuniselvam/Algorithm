import java.util.Scanner;

public class SelectionSort {

    public static void selectionsortalgorithm(int array[]){

        int length= array.length;

        for(int i=0;i<length-1;i++){
            int min=i;
            for(int j=i+1;j<length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
//            Swapping the elements.
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;



        }

    }

    public static void main (String[] args){
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter the NO of elements of array");
        int n=reader.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements");

//        Getting User Inputs For  the array
        for(int i=0;i<n;i++){
            array[i]= reader.nextInt();
        }
//        Before Sorting the array
        for(int i=0;i<n;i++){
            System.out.print(array[i] + " ");
        }
//        sorting the array using selectionsort algorithm
        selectionsortalgorithm(array);
        System.out.println();

//        After Sorting the array
        for(int i=0;i<n;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();





    }
}
