from typing import List


def get_index_of_seven(nums: List[int]) -> int:
    for index, val in enumerate(nums):
        if val == 7:
            return index
    return -1


def get_dist_between_sevens(nums: List[int]) -> int:
    first = -1
    second = -1
    flag = 0

    for index, value in enumerate(nums):
        if value == 7 and first == -1:
            first = index
        
        if value == 7 and first != index:
            second = index
            break

    return second - first


# do not modify below this line
print(get_index_of_seven([1, 2, 3, 4, 5, 6, 7, 8, 9]))
print(get_index_of_seven([1, 2, 3, 4, 5, 6, 8, 9]))
print(get_index_of_seven([2, 4, 7, 5, 7, 8, 4, 2]))

print(get_dist_between_sevens([1, 2, 7, 4, 5, 6, 7, 8, 9]))
print(get_dist_between_sevens([2, 7, 7, 7, 8]))
print(get_dist_between_sevens([7, 4, 8, 4, 2, 7]))
