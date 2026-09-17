def solution(arr):
    idx = 0
    pre = arr
    
    while True:
        tmp = []
        for x in pre:
            if x >= 50 and x % 2 == 0:
                tmp.append(x // 2)
            elif x < 50 and x % 2 != 0:
                tmp.append(x * 2 + 1)
            else:
                tmp.append(x)
                
        if pre == tmp:
            break
        
        idx += 1
        pre = tmp
        
    return idx