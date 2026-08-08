n = int(input())

numbers = list(map(int, input().split()))
numbers = [x for x in numbers if x % 2 == 0]

print(*numbers[::-1])