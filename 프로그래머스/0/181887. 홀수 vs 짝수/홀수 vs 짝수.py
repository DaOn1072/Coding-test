def solution(num_list):
    even, odd = 0, 0
    
    for i, num in enumerate(num_list):
        if i % 2 == 0:
            even += num
        else:
            odd += num
            
    return max(even, odd)