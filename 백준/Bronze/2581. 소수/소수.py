m = int(input())
n = int(input())

prime = []

for i in range(m,n+1):
    if i>1:
        for j in range(2, i+1):
            if i % j == 0:
                if i == j:
                    prime.append(i)
                else:
                    break
        
if prime == []:
    print(-1)
else:
    print(sum(prime))
    print(min(prime))