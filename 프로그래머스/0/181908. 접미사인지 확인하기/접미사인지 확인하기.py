def solution(my_string, is_suffix):
    answer = 0
    list1 = []
    
    for i in range(len(my_string)):
        list1.append(my_string[i:])
    
    if is_suffix in list1:
        answer = 1
    else:
        answer = 0
    
    return answer