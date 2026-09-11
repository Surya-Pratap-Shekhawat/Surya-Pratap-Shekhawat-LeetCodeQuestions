class Solution {
    public int removeDuplicates(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        // int k = 1;
        // list.add(nums[0]);
        // for (int j = 0; j < nums.length; j++) {
        //     int check = nums[j];
        //     if (j == nums.length - 1) {
        //         if(nums.length == 1){
        //             return k;
        //         }
        //     }

        //     else if (check != nums[j + 1]) {
        //         list.add(nums[j + 1]);
        //         check = nums[j + 1];
        //         k++;
        //     }
        // }
        // for(int i = 0 ; i < list.size() ; i++){
        //     nums[i] = list.get(i);
        // }
        // return k;
        
        //Second time Solution
        int slow = 0 ;
        int fast = 0;
        int unique = 1;
        int ind = 0;
        while(fast < nums.length-1){
            if(nums[fast+1] == nums[fast]){
                fast++;
            }
            else{
                nums[++ind] = nums[fast+1];
                fast++;
                slow = fast;
                unique++;
            }
        }
        return unique;
    }
}