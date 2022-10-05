import java.util.Arrays;
public class LeetTwoSumSolution {
	public  static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[j] == target - nums[i]){
					return new int [] {i,j};
				}

			}
		}
		return null;
	}	

	public static void main(String[] args){
		int [] n = {2, 7, 11, 15};
		//int [] result = twoSum(n,9);
		System.out.println(Arrays.toString(twoSum(n,9)));

	}

	
}