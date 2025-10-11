class Solution {
  //A fun variation of Moore's voting algorithm.
  //Think about it, it makes a lot of sense.
  //It took a long time to grab my head around it, I still doubt a lot of things in here. But let's make peace for now.
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int count2=0;
        int candidate1=0;
        int candidate2=0;
        for(int num: nums){
            if(num==candidate1){
                count1++;
            } else if(num==candidate2){
                count2++;
            } else if(count1==0){
                candidate1=num;
                count1=1;
            } else if(count2==0){
                candidate2=num;
                count2=1;
            } else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num: nums){
            if(num==candidate1){
                count1++;
            } else if(num==candidate2){
                count2++;
            }
        }
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(count1 > n/3){
            ans.add(candidate1);
        }
        if(count2> n/3){
            ans.add(candidate2);
        }
        return ans;
    }
}
