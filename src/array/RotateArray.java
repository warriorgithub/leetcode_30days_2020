package array;

import java.util.Arrays;

public class RotateArray {

    public static void rotateArray(int arr[],int d){
        int temp=0;
        int k=0;
        while(k<d) {
            temp =arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                    arr[i] =arr[i+1];
            }
            arr[arr.length-1] = temp;
            System.out.println(Arrays.toString(arr));
            k++;
        }


    }

    public static void main(String args[]){
        int arr[] = {41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51};
        int n=10;
        rotateArray(arr,n);
    }
}
