def findMedianSortedArrays(nums1, nums2):
        l=[]
        for i in nums1 :
            l.append(i)
        for i in nums2 :
            l.append(i)
        l.sort() 
        n = len(l)
        
        if n%2!=0 :
            print('here')
            m = int(n/2) 
            return l[m]
        else :
            x = int(n/2)
            y = int(x-1)

            print(x,y)
            return (l[x]+l[y])/2

nums1 = [1,2] 
nums2 = [3,4]
findMedianSortedArrays(nums1, nums2)
 
 
