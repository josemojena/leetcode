**1437. Check If All 1's Are at Least Length K Places Away**

Given an array nums of 0s and 1s and an integer k, return True if all 1's are at least k places away from each other, otherwise return False.


*Example 1:*  
**Input:** nums = [1,0,0,0,1,0,0,1], k = 2  
**Output:** false  
Explanation: Each of the 1s are at least 2 places away from each other. 

*Example 2:*  
**Input:** nums = [1,0,0,1,0,1], k = 2  
**Output:** false  
Explanation: The second 1 and third 1 are only one apart from each other.

*Example 3:*  
**Input:** [1,1,1,1,1], k = 0  
**Output:** true  
 

**Constraints:**
1. 1 <= nums.length <= 10^5
2. 0 <= k <= nums.length
3. nums[i] is 0 or 1
