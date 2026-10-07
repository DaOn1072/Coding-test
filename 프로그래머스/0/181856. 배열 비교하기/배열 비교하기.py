def solution(arr1, arr2):
    lenA, lenB = len(arr1), len(arr2)
    hapA, hapB = 0, 0
    
    if lenA != lenB:
        return 1 if lenA > lenB else -1
    
    for i in range(lenA):
        hapA += arr1[i]
        hapB += arr2[i]
        
    if hapA == hapB:
        return 0
    else:
        return 1 if hapA > hapB else -1
