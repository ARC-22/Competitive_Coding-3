// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// create hasmap of array elements as key and their occurrence as a value.
// iterate over elements of hashmap and if diffrence of element - k is found in hashmap inrease pair count
// if k is zero check if frequency count greater than 1 is present. return pair count at the end.

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length ==0 ){
            return 0;
        }
        HashMap<Integer, Integer>map = new HashMap<>();
        int count=0;

        // save array in hashmap
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        // iterate to find pairs
        for(int n: map.keySet()){
           int diff = n - k;
           
           if(k == 0){
                if(map.get(n) >= 2){
                    count++;
                }
           }
           else if(map.containsKey(diff)){   
                count++;
           }
        }
        return count;
    }
}