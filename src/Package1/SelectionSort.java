package Package1;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSize, number[];

        System.out.println(" Enter the array length:\n");
        numSize = input.nextInt();
        number = new int [numSize] ;

        System.out.println(" Now enter" + numSize + " numbers:\n");
        for (int i = 0; i < numSize ; i++){
            number [i] = input.nextInt() ;
        }
    }
}

    void SeSort() {

    }

    void Print( int arr[]) {
    for ( int k = 0 ; k < arr.length ; k++)
        System.out.println(arr[k]);

    }