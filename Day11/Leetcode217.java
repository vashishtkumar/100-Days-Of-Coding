import java.util.HashMap;

public class Leetcode217 {
    class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
         if(hs.containsKey(nums[i]))
         hs.put(nums[i],hs.get(nums[i])+1);
         else
         hs.put(nums[i],1);
            }
           for(int i=0;i<nums.length;i++){
            if(hs.get(nums[i])>1)
            return true;
           }
           return false;

        }
        
}
}
