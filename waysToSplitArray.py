"""
Given an integer array nums, find the number of ways to split the array into two parts so that the first section has a sum greater 
than or equal to the sum of the second section. The second section should have at least one number.
"""
import typing
def waysToSplitArray(nums: typing.List[int], ) -> int:
    n = len(nums)
    prefix = [nums[0]]
    
    for i in range(1, n):
        prefix.append(nums[i] + prefix[-1])
        
    ansArr = 0 
    for j in range(n - 1):
        left_section = prefix[j]
        right_section = prefix[-1] - prefix[j]
        if left_section >= right_section:
            ansArr += 1
            
    return ansArr
            
        
print(waysToSplitArray([10, 4, -8, 7]))

        
    