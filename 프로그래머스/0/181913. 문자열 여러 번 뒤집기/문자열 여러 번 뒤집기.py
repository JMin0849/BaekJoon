def solution(my_string, queries):
    arr = list(my_string)
    
    for s, e in queries:
        tmp = arr[s:e+1]
        arr[s:e+1] = tmp[::-1]
    
    return "".join(arr)