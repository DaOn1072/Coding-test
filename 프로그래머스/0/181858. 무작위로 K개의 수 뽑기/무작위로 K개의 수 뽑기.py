def solution(arr, k):
    answer = [-1] * k
    used = []
    
    for i in arr:
        if i not in used:
            used.append(i)
        if len(used) == k:
            break
    
    for j in range(len(used)):
        answer[j] = used[j]
        
    return answer