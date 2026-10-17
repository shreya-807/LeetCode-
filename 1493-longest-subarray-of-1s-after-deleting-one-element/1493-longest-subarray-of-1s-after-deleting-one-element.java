// class Solution {
//     public int longestSubarray(int[] nums) {
//         int count0 = 0;
//         int ans = 0;
//         int i = 0;
//         int j = 0;
//         while (j != nums.length - 1 && i < nums.length - 1) {
//             if (nums[i] == 1) {
//                 i++;

//             } else if (nums[i] == 0) {
//                 count0++;
//                 i++;

//             }
//             if (count0 > 1) {
//                 if (nums[j] == 0) {
//                     count0--;
//                 }
//                 j++;
//             }
//             ans = Math.max(ans, i - j);

//         }
//         return ans;
//     }
// }
class Solution {
    public int longestSubarray(int[] nums) {
        int count0 = 0;
        int ans = 0;
        int i = 0;
        int j = 0;
        
        // Fixed loop condition to iterate through the entire array safely
        while (i < nums.length) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                count0++;
                i++;
            }
            
            if (count0 > 1) {
                if (nums[j] == 0) {
                    count0--;
                }
                j++;
            }
            
            // ans is correctly tracked by the window size (i - j)
            ans = Math.max(ans, i - j);
        }
        return ans-1;
    }
}