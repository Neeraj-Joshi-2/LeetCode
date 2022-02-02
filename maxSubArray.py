def maxSubArray(nums) :
    max_ = -9999
    sum_ = 0 
    for i in nums :
        sum_ = sum_ + i
        max_ = max(sum_ , max_)
        
        if sum_ < 0 : sum_ = 0

    return max_
    
print(maxSubArray([-8,-6,-1,3,2,3,-9]))
