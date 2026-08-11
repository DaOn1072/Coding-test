arr = []
cnt = 0

for i in range(4):
    arr.append(list(map(int, input().split())))

for i in range(4):
    for j in range(4):
        if arr[i][j] % 5 == 0:
            cnt += 1

print(cnt)