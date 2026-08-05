a = int(input())
answer = True

if a % 13 == 0 or a % 19 == 0:
    print(answer)
else:
    answer = False
    print(answer)