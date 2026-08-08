n = []
for _ in range(10):
    n.append(int(input()))

t_cnt, f_cnt = 0, 0

for i in range(10):
    if n[i] % 3 == 0:
        t_cnt += 1
        
        if n[i] % 5 == 0:
            f_cnt += 1

    elif n[i] % 5 == 0:
        f_cnt += 1

print(t_cnt, f_cnt)
    