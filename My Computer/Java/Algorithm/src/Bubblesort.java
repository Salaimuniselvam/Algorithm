import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {

    public  static void bubblesort(int[] array){
        int n= array.length,temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(array[j-1]>array[j]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }

            }
        }
    }

    public static void main(String[] args){

        Scanner reader= new Scanner(System.in);

//        char[] sms={'s','a','s','a','r'};
//        System.out.println(sms);
//        Arrays.sort(sms);
//        System.out.println(sms);
        System.out.println("Enter the No of Elements of Array");
        int n=  reader.nextInt();
        int [] array= new int[n];
        System.out.println("Enter the Elements Of Array");
        for(int i=0; i<=(n-1);i++){
            array[i]=reader.nextInt();
        }

        System.out.println("Before Bubble Sort..");
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("After Bubble Sort..");
        bubblesort(array);
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
