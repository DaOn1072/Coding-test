a, b, c = map(int, input().split())

hap = a + b + c
avg = int(hap / 3)
diff = hap - avg

print(f"{hap}\n{avg}\n{diff}")