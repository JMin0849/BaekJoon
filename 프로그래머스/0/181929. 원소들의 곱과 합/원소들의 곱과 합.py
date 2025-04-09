def solution(num_list):
    answer = 0
    mul = 1
    sums = 0
    
    for i in num_list:
        mul *= i
        sums += i
    
    if sums**2 > mul:
        answer = 1
    else:
        answer = 0
        
    return answer