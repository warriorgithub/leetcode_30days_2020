package array;

public class MaximumSubarray {
    public static void main(String args[]){
        int []nums= {4,-1,2,1};
        int sum=0;
        int current = 0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = current+nums[i];
            current = Math.max(sum,nums[i]);
            max = Math.max(max,current);
        }
        System.out.println(max);
    }
}
