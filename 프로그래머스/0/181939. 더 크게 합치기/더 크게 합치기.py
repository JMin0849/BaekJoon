def solution(a, b):

    if int(str(a) + str(b)) > int(str(b) + str(a)):
        answer = int(str(a) + str(b))
    elif int(str(a) + str(b)) < int(str(b) + str(a)):
        answer = int(str(b) + str(a))
    else:
        answer = str(a) + str(b)
    return int(answer)