package array;

import java.util.Arrays;

public class MinimumSwap {
    public static void main(String args[]){
        int [] givenArr = {2,3,4,1,5};
                            //[1, 2, 3, 0, 4]
        int [] indices = new int[givenArr.length];
        for(int k=0;k<givenArr.length;k++){
            indices[givenArr[k]-1] = k;
        }
        System.out.println(Arrays.toString(indices));
        int j=0;
        int count=0;
        for(int i=0;i<givenArr.length-1;i++){
                if(givenArr[i]!=i+1) {
                    int temp = givenArr[i];
                    givenArr[i] = givenArr[indices[i]];
                    givenArr[indices[i]] = temp;
                    count++;
                }
        }

        System.out.println(Arrays.toString(givenArr));
        System.out.println(count);
    }
}
