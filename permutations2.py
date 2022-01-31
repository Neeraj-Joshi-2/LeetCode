def permuteUnique(nums):
    res = []
    nums.sort()
    dfs(nums, [], res)
    return res
    
def dfs(nums, path, res):
    if not nums:
        res.append(path)
    for i in range(len(nums)):
        if i > 0 and nums[i] == nums[i-1]:
            continue
        dfs(nums[:i]+nums[i+1:], path+[nums[i]], res)
        
print(permuteUnique([1,1,2]))
