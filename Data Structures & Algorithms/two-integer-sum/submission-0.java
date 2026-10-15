class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index_i = 0;
        int index_j = 0;
        HashMap<Integer, Integer> rest = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            rest.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int remaining = target - nums[i];
            if(rest.containsKey(remaining)){
                if(rest.get(remaining) != i){
                    index_i = i;
                    index_j = rest.get(remaining);
                }
            }

        }
        int [] result = new int [2];
        if (index_i < index_j){
            result[0] = index_i;
            result[1] = index_j;
        }
        if (index_i > index_j){
            result[0] = index_j;
            result[1] = index_i;
        }
        return result;
    }
}
