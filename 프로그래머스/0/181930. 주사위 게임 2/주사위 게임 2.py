def solution(a, b, c):
    answer = 0
        
    if a == b == c: 
        answer = (3*a)*(3*a**2)*(3*a**3)
    elif a == b or b == c or c == a:
        answer = (a+b+c)*(a**2+b**2+c**2)
    else:
        answer = a + b + c
    
    return answer