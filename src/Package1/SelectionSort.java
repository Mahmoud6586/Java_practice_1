package Package1;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSize, number[];

        System.out.println(" Enter the array length:\n");
        numSize = input.nextInt();
        number = new int[numSize];

        System.out.println(" Now enter " + numSize + " numbers:\n");
        for (int i = 0; i < numSize; i++) {
            number[i] = input.nextInt();
        }
        SelectionSort example = new SelectionSort();
        example.SelSort(number);
        example.Print(number);
    }

    void SelSort(int numb[]) {
        int maxIndex, temp, j;
        //4 7  9 5

        for (int i = 0; i < numb.length; i++) {
            maxIndex = i;

            for (j = i + 1; j < numb.length; j++) {
                if (numb[maxIndex] < numb[j])
                    maxIndex = j;
            }
            //Test Fucking SSH
            temp = numb[i];
            numb[i] = numb[maxIndex];
            numb[maxIndex] = temp;
        }

    }

    void Print(int arr[]) {
        for (int k = 0; k < arr.length; k++)
            System.out.println(arr[k]);

    }
}

