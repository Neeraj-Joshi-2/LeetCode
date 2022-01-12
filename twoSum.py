def twoSum(nums,target):
        lst=[]
        for i in range(len(nums)) :
            t=nums[i]
            l = i + 1
            r = len(nums)
            while l < r :
                if target - nums[l] == t :
                    lst.append(i)
                    lst.append(l)
                    return lst
                else :
                    l=l+1
                    
                    
l = [2,8,7,4]
target = 9
print(twoSum(l,target))
 
