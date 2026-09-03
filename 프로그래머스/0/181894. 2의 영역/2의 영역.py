def solution(arr):
    
    idx = []
    
    for i in range(len(arr)):
        if arr[i] == 2:
            idx.append(i)
            
    if idx:
        if len(idx) == 1:
            return [arr[idx[0]]]
        else:
            idx[-1] += 1
            return arr[idx[0]:idx[-1]]
            
    return [-1]