n = int(input())
for i in range(1, n+1):
    if i % 2 != 0:
        cnt = 0
        for j in range(n):
            cnt += 1
            print(cnt, end="")
        print()
    else:
        cnt = n
        for j in range(n):
            print(cnt, end="")
            cnt -= 1
        print()