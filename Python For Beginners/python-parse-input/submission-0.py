from typing import List

def read_integers() -> List[int]:
    userInput = input()
    myList = userInput.split(",")
    for i in range(len(myList)):
        myList[i] = int(myList[i])

    return myList

# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())
