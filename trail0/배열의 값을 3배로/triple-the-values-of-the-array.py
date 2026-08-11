matrix = []

for i in range(3):
    matrix.append(list(map(int, input().split())))

for j in range(3):
    for x in range(3):
        matrix[j][x] *= 3
        print(matrix[j][x], end=" ")
    print()
    
