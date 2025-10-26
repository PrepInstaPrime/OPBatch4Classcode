# Question 1
https://leetcode.com/problems/two-sum/submissions/1812074623/ 
## Solution 
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map= new HashMap<>();
       for(int i=0;i<nums.length;i++){
          int comp=target-nums[i];
          if(map.containsKey(comp)){
            return new int[]{map.get(comp),i};
          }else{
            map.put(nums[i],i);
          }
       }
       return new int[]{-1,-1};
    }
}
```
# Question 2
https://leetcode.com/problems/missing-number/
## Solution 
```
class Solution {
    public int missingNumber(int[] nums) {
       /* HashSet<Integer> set= new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1; */
        int sum=0;
        for(int val:nums){
            sum+=val;
        }
        int n=nums.length;
        int mathSum= n*(n+1)/2;
        return mathSum-sum;
    }
}
```