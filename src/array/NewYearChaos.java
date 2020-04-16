package array;

import java.util.Arrays;

public class NewYearChaos {
    public static void minimumBribes(int[] q){
        int count=0;
        int temp =0;
        int givenArr[] = new int[q.length];
        int noOfItr= 0;
        for(int j=0;j<q.length;j++){
            givenArr[j] = j+1;
        }
        for(int i=q.length-1;i>=0;){
            //System.out.println(i);
           if(noOfItr>q.length) break;
           if(givenArr[i]==q[i]){
               i--;
           }else{
               temp = givenArr[i];
               givenArr[i] = givenArr[i-1];
               givenArr[i-1] = temp;
               count++;
               noOfItr++;
           }
        } if(givenArr[0]!=q[0]) System.out.println("Too chaotic");
          else System.out.println(count);
    }
    public static void main(String args[]){
        //int outputArr[] = {2,1,5,3,4};
        //int outputArr[] = {2,5,1,3,4};
        //int outputArr[] = {5,1,2,3,7,8,6,4};
        int outputArr[] = {1,2,5,3,7,8,6,4};
        minimumBribes(outputArr);
    }
}
