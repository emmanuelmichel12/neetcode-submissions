from typing import List


def create_list_of_odds(n: int) -> List[int]:
    newlist = []
    for i in range(n + 1):
        if i % 2 != 0:
            newlist.append(i)
    return newlist


# do not modify below this line
print(create_list_of_odds(1))
print(create_list_of_odds(5))
print(create_list_of_odds(6))
print(create_list_of_odds(10))
