from typing import List


def create_grid(rows: int, cols: int, value: int) -> List[List[int]]:
    grid = [[0] * cols] * rows
    while rows - 1 >= 0:
        grid[rows - 1][0] = value
        rows -= 1

    while cols - 1 >= 0:
        grid[0][cols - 1] = value
        cols -= 1

    return grid


# do not modify below this line
print(create_grid(2, 3, 0))
print(create_grid(3, 2, 1))
print(create_grid(4, 4, 4))
print(create_grid(1, 1, 5))
print(create_grid(1, 5, 5))
