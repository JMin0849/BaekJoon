# 1. 첫번째 쿼리의 s~e까지의 인덱스에 있는 요소들 중에 k보다 큰 요소를 찾는다.
# 2. k보다 큰 요소들 중 최솟값을 찾는다.
# 3. 해당 요소들 중 최솟값을 answer에 추가한다.
# 4. 만약 k보다 큰 요소가 없다면 -1을 answer에 추가한다.
def solution(arr, queries):
    answer = []
    
    for a,b,c in queries:
        list1=[]
        for d in range(a, b+1):
            if arr[d] > c:
                list1.append(arr[d])
        
        if list1:
            answer.append(min(list1))
        else:
            answer.append(-1)
    return answer