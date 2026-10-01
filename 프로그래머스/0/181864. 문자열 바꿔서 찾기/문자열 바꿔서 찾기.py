def solution(myString, pat):
    string = myString.replace("A", "X").replace("B", "A").replace("X", "B")
    
    return int(pat in string)