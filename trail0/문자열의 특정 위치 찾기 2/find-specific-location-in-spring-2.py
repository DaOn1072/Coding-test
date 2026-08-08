words = ["apple", "banana", "grape", "blueberry", "orange"]
s = input()
cnt = 0

for w in words:
    if w[2] == s or w[3] == s:
        print(w)
        cnt += 1

print(cnt)