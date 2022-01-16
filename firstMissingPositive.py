class Solution(object):
    def firstMissingPositive(self, nums):
        if 1 not in nums :
            return 1
        nums.sort()
        j=len(nums)-1
        for i in range(len(nums)) :
            if nums[i]< 0 :
                continue
            k = i + 1
            if k<=j :
                if (nums[k]-nums[i] == 1) or (nums[k]-nums[i] == 0) :
                    continue
                else :
                    return nums[i] + 1
        return nums[len(nums)-1] + 1
            

o = Solution()
nums = [1,2,3,4,8]
print(o.firstMissingPositive(nums))

#O(nlgn)
def firstMissingPositive(nums):
    nums.sort()
    res = 1
    for num in nums:
        if num == res:
            res += 1
    return res

nums = [2,3,4]
print(firstMissingPositive(nums))
