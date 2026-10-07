def solution(strArr):
    count_dict = {}
    
    for s in strArr:
        length = len(s)
        count_dict[length] = count_dict.get(length, 0) + 1
    
    return max(count_dict.values())