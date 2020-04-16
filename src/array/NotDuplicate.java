package array;

import java.util.Arrays;

public class NotDuplicate {
    public static void main(String args[]){
        int arr[]= {1,2,1,2,4};
        int xor=arr[0];
        for(int i=1;i<arr.length;i++) {
            xor^=arr[i];
        }
        System.out.println(xor);
    }
}
