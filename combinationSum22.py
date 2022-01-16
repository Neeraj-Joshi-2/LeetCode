class Solution:
    def combinationSum(self, candidates, target):
        res = []
        candidates.sort()
        
        def dfs(target, index, path):
            if target < 0:
                return  
            if target == 0:
                res.append(path)
                return 
            for i in range(index, len(candidates)):
                if i > index and candidates[i] == candidates[i-1]:
                    continue
                dfs(target-candidates[i], i+1, path+[candidates[i]])
        
        dfs(target, 0, [])
        return res
    
o = Solution()
candidates = [10,1,2,7,6,1,5]
target = 8
print(o.combinationSum(candidates,target))
