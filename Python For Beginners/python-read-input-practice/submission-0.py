def add_two_numbers() -> int:
    twoNums = input()
    listNum = twoNums.split(",")
    tSum = 0
    for i in range(len(listNum)):
        tSum += int(listNum[i])
    return tSum



# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
