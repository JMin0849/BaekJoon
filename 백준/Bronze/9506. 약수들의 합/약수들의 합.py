while True:
    N = int(input())
    if N == -1:
        break
    
    num = []
    for i in range(1, N):
        if N % i == 0:
            num.append(i)
            
    if sum(num) == N:
        print(N, end=' = ')
        print(*num, sep=' + ')
    else:
        print(N, 'is NOT perfect.')
            