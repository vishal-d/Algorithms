//Crazy variation of classic perfix sum
//I was not able to figure it out. Had to see the solution to know it.
//Ideally I should have, since I knew the algorithm. But I guess only practising will make it perfect.
//But I understand the solution now.
//We maintain a prefix sum and a count hashmap
//Every time sum == k, the sum-k would be 0, and that would be handled by prefixSumFreq.put(0L, 1): Touche
//In other cases when sum-k logic will take care to increase the counter.
//And it doesn't happen, then we would not increate the counter and would put default 0
//In all the cases our loop is anyhow increasing we will keep incrementing the sum by 1 always, and if it exist we will get the sum values and increment by 1: prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0)+1);

//I am at a stage where I can thorougly understand the solution, but I can not comne up with solution to the varitaiton of the same medium problem.
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Long, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0L, 1);
        int count = 0;
        long sum = 0;
        for(int num: nums){
            sum += num;
            count+=prefixSumFreq.getOrDefault(sum-k, 0);
            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0)+1);
            
        }
        return count;
    }
}
