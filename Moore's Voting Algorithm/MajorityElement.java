//LC: https://leetcode.com/problems/majority-element/description
class Solution {
    public int majorityElement(int[] nums) {
        //Moore's voting algorithm 
        //I miss Physic days idk why. 
        int count = 0;
        int majorityElement = nums[0];
        for(int num: nums){
            if(count==0){
                majorityElement = num;
            }
            if(num==majorityElement){
                count++;
            } else{
                count--;
            }
            
        }
        return majorityElement;
    }
}
