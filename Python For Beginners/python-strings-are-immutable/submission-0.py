def remove_fourth_character(word: str) -> str:
    str1 = word[:3]
    str2 = word[4:]
    return str1 + str2

# do not modify below this line
print(remove_fourth_character("NeetCode"))
print(remove_fourth_character("Hello"))
