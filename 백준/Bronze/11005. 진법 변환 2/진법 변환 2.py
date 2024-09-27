num, change = map(int,input().split())

arr='0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
answer=''

while num:
    answer+=str(arr[num % change])
    num //= change
print(answer[::-1])