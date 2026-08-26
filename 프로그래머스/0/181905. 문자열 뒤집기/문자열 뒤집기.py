def solution(my_string, s, e):
    my_string = list(my_string)
    
    while s < e:
        my_string[s], my_string[e] = my_string[e], my_string[s]
        
        s += 1
        e -= 1
    return "".join(my_string)