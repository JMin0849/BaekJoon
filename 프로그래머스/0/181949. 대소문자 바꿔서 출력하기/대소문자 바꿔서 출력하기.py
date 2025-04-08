str = input()
result = ''
for i in str:
    if i.islower() is True:
        result += i.upper()
    else:
        result += i.lower()
print(result)