class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i=0;
        int j=1;
        int count=1;
        while(j<nums.size()){
            if(nums[i]==nums[j]){
                count++;
                j++;
                if(count==2){
                    i++;
                    nums[i]=nums[j-1];
                }    
            }
            else{
                nums[++i]=nums[j++];
                count=1;
            }
        }
        return i+1;
        
    }
};