package com.example.week6daily5testassignment;

public class Problem1 {

    public static int[] array;
    public static int[] tempMergArr;
    public static int length;

    public static void main(String a[]){

        int[] unsortedArrary = {99,12,11,12,13,2,87,75,7,54};

        sort(unsortedArrary);

        for(int i:unsortedArrary){

            System.out.print(i);
            System.out.print(" ");

        }
    }

    public static void sort(int inputArr[]) {
        array = inputArr;
        length = inputArr.length;
        tempMergArr = new int[length];
        mergeSort(0, length - 1);
    }

    private static void mergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {

            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            mergeSort(lowerIndex, middle);
            mergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);

        }
    }

    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {

            tempMergArr[i] = array[i];

        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {

            if (tempMergArr[i] <= tempMergArr[j]) {

                array[k] = tempMergArr[i];
                i++;

            } else {

                array[k] = tempMergArr[j];
                j++;

            }

            k++;

        }
        while (i <= middle) {

            array[k] = tempMergArr[i];
            k++;
            i++;

        }

    }
}
