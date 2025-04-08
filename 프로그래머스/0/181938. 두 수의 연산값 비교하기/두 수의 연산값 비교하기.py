def solution(a, b):
    answer = 0
    tmp1 = int(str(a) + str(b))
    tmp2 = 2 * a * b
    
    if tmp1 > tmp2:
        answer = tmp1
    elif tmp2 > tmp1:
        answer = tmp2
    else:
        answer = tmp1
    
    return answer