package test1;

import java.util.Arrays;

/*https://leetcode.com/problems/jump-game-ii/discuss?currentPage=1&orderBy=hot&query=&tag=java*/

public class jumpGameII {
	
	public int jump(int[] nums) {
		int furtherest =0, results = 0,i = 0;
				while(i<nums.length && furtherest < nums.length - 1) {// 
			int max =0;
			while(i<=furtherest ) {
				max = Math.max(max,nums[i]+i); // max 和当前位置加上下一步的最大长度比较
				i++;
			}
			
			furtherest = max;// find the max and reset furtherest flag
			results++;
		}
		return results;
	}
	
	public int jumpdp(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		Arrays.fill(dp, n+1);
		dp[0] = 0;
		for(int i=0;i<n; i++) {
			for(int j=i+1; j<=i+nums[i] && j < n; j++) {
				dp[j] = Math.min(dp[j],dp[i] + 1);// dp[j] get the mininal one 
			}
		}
		
		return dp[n-1];// last one 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,1,1,4};
		//jump(a);
		jumpGameII jp = new jumpGameII();
		System.out.println("results is "+jp.jump(a));
		System.out.println("results is "+jp.jumpdp(a));

		
	}
}
