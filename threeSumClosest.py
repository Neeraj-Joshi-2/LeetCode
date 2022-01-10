"""
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.
"""

def threeSumClosest(nums, target):
        nums = sorted(nums)
        result = nums[0] + nums[1] + nums[2]
        for i in range(len(nums)):
            l = i + 1
            r = len(nums) - 1
            while l < r:
                sum_ = nums[i] + nums[l] + nums[r]
                if sum_ == target:
                    return sum_
                
                if abs(sum_ - target) < abs(result - target):
                    result = sum_
                
                if sum_ < target:
                    l += 1
                    
                elif sum_ > target:
                    r -= 1
                    
        return result

l = [-1,2,1,-4]
target = 1
print(threeSum(l,target))
