class Solution {
    public int maxSubArray(int[] nums) {
        int min=nums[0];
        int ans=nums[0];
        for (int i=0;i<nums.length;i++) {
            int temp=nums[i];
            int j=i+1;
            while (j<nums.length && nums[j]>=min) {
                temp+=nums[j];
                j++;
                System.out.println("j="+j);
            }
            if (temp>ans) ans=temp;
            if (j<nums.length) {
                min=nums[j];
                i=j;
                System.out.println("j="+j);
            }
        }
        return ans;
    }
}
