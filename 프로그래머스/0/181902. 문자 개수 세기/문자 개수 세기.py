def solution(my_string):
    answer = [0] * 52
    
    for s in my_string:
        if s >= 'A' and s <= 'Z':
            answer[ord(s) - ord('A')] += 1
        elif s >= 'a' and s <= 'z':
            answer[ord(s) - ord('a') + 26] += 1
    
    return answer