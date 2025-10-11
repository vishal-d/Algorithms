class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Very commmon prefix sum problem.
        //Import to note here that we don't check sum>k because 
        //the number can be negative
        //Another important observation is that, we only add
        //in the sum if it doesn't already contain the sum
        //This is basically to stop overriding the map index to a 
        //later index. In this was we would maximize the array
        int ans = 0; 
        int n = arr.length;
        long sum  = 0;
        HashMap<Long, Integer> prefixSum = new HashMap<>();
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            if(sum==k){
                ans = Math.max(ans, i+1);
            }
            if(prefixSum.containsKey(sum-k)){
                ans = Math.max(ans, i-prefixSum.get(sum-k));
            }
            if(!prefixSum.containsKey(sum)){
                prefixSum.put(sum, i);
            }
        }
        return ans;
    }
}
