def solution(arr):
    length = len(arr)
    target = 1
    
    while target < length:
        target *= 2
        
    if target == length:
        return arr
    
    answer = [0] * target
    
    for i in range(length):
        answer[i] = arr[i]
        
    return answer