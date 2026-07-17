class Solution {
    public int search(int[] nums, int target) {
        return search(nums,0,nums.length - 1,target);
    }

    public int search(int[] nums , int s, int e , int t){
        if(s > e) return -1;

        int mid = (s + e)/2;

        if(nums[mid] == t) return mid;

        if(nums[mid] < t) return search(nums , mid + 1 , e, t);

        return search(nums,s,mid - 1 , t);
    }
}