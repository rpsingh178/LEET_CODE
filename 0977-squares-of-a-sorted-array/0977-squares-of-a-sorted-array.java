class Solution {
    public int[] sortedSquares(int[] nums) {
          int i=-1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]<0)
                i++;
            nums[j]=nums[j]*nums[j];    
        }
        int j=i+1;
        int result[]=new int[nums.length];
        int pointer=-1;
        while(pointer<result.length-1){
            result[++pointer]=(i>=0 && j<nums.length)?((nums[i]<nums[j])?nums[i--]:nums[j++]):((i<0)?nums[j++]:nums[i--]);
        }
        return result;
    }
}