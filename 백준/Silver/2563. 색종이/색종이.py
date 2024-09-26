n = int(input())
arr = [ [0 for _ in range(100)] for _ in range(100)]

for i in range(n):
    x, y = map(int, input().split())
    for row in range(x, x+10):
        for col in range(y, y+10):
            arr[row][col] = 1
        
wide = 0

for k in arr:
    wide += k.count(1)
print(wide)