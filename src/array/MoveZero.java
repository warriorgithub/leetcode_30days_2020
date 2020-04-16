package array;
import java.util.Arrays;

public class MoveZero {

	public static void main(String args[]) {

		int nums[] = {0, 1, 0, 3, 12};
		int k=0;
		for(int i=0;i< nums.length;i++){
			if(nums[i]!=0){
				nums[k] = nums[i];
				k++;
			}
		}for(int j=k;j<nums.length;j++){
			nums[j] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}
}/*
	int arr[] = new int[nums.length];
	int k = 0;
	int count = 0;
	int lastNonZero = 0;
		for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 0) {
		count++;
		} else {
		arr[k] = nums[i];
		k++;
		}
		}
		for (int j = k; j <(k + count); j++) {
		arr[j] = 0;
		}
		System.out.println(Arrays.toString(arr));*/