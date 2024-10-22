import sys
n = int(sys.stdin.readline())

x_num, y_num = [], []

for i in range(n):
    x, y = map(int, sys.stdin.readline().split())
    x_num.append(x)
    y_num.append(y)
    
print((max(x_num)-min(x_num))*(max(y_num)-min(y_num)))