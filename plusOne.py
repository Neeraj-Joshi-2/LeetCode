def plusOne(nums) :
    for i in range(len(nums)-1 , -1 , -1) :
        if(nums[i] < 9) :
            nums[i]+=1
            return nums
        nums[i] = 0
        
    l = [0]*(len(nums)+1)
    l[0] = 1
    return l

print(plusOne([9,9]))


def plusOne(nums) :
    l = []
    number = 0
    for i in nums :
        number = number*10 + i
    
    number = str(number + 1)
    for i in number :
        l.append(i)
        
    return l
    

print(plusOne([9]))
