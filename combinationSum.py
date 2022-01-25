class Solution:  
    def combinationSum(self, candidates, target):
        res = []  
        candidates.sort() 
        
        def dfs(target, index, path): 
            if target < 0:
                return  # backtracking
            if target == 0:
                res.append(path)
                return 
            for i in range(index, len(candidates)):
                dfs(target-candidates[i], i, path+[candidates[i]]) 
        
        dfs(target, 0, [])
        return res 
    
o = Solution()
candidates = [2,3,5] 
target = 8
print(o.combinationSum(candidates,target))
