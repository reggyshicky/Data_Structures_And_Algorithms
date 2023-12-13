def answer_queries(nums, queries, limit):
    prefix = [nums[0]]
    
    for i in range(1, len(nums)):
        prefix.append(nums[i] + prefix[-1])
        
    ans = []
    for x, y in queries:
        currSum = prefix[y] - prefix[x] + nums[x]
        ans.append(currSum < limit)
    return ans

print(answer_queries([1, 6, 3, 2, 7, 2], [[0, 3], [2, 5], [2, 4]], 13))
        