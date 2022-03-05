package programmers.level1;


public class P_12977 {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 7, 6, 4};
		int sum = 0;
		int count = 0;
		int answer = 0;
		
		for(int i = 0; i < nums.length-2; i++) {
			sum = 0;
			sum += nums[i];
			
			for(int q = i+1; q < nums.length-1; q++) {
				sum += nums[q];
				
				for(int w = q+1; w< nums.length; w++) {
					count = 0;
					sum += nums[w];
					for(int e = 1; e <= sum; e++) {
						if(sum % e == 0 || sum % e == 0) {
							count++;
						}
					}
					if(count == 2) {
						answer++;
					}
					sum -= nums[w];
				}
				sum -= nums[q];
			}
			
		}
		
		System.out.println(answer);
		
	}
}
