def solution(my_strings, parts):
    answer = ''
    
    for i, str in enumerate(my_strings):
        s, e = parts[i]
        answer+=(str[s:e+1])
    
    return answer