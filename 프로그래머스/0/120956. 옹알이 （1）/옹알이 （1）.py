from itertools import permutations

def solution(babbling):
    speak = ["aya", "ye", "woo", "ma"]
    possible = set()
    
    for i in range(1, 5):
        for p in permutations(speak, i):
            possible.add("".join(p))
    
            
    return sum(1 for b in babbling if b in possible)