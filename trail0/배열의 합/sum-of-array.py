arr = []

for i in range(4):
    arr.append(list(map(int, input().split())))

for i in range(4):
    hap = 0
    for j in range(4):
        hap += arr[i][j]
    print(hap)