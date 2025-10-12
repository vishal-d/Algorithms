//Solution 1: Fun variation of Kadane's algorithm
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefixSum = 0;
        int min = 0;
        int max = 0;
        
        for(int num: nums){
            prefixSum+=num;
            min = Math.min(prefixSum, min);
            max = Math.max(prefixSum, max);
        }
        return max-min;
    }
}

//Solution 2: Think about the mountain example, where this can be used to calculate the evelation gain relative. 
//Think about plotting it on a graph.
//This is simple, and smart. Just uses prefix sum.
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefixSum = 0;
        int min = 0;
        int max = 0;
        
        for(int num: nums){
            prefixSum+=num;
            min = Math.min(prefixSum, min);
            max = Math.max(prefixSum, max);
        }
        return max-min;
    }
}
