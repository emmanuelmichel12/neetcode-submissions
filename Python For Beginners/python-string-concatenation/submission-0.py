def concatenate(s1: str, s2: str) -> str:
    s3 = s1 + s2
    n = len(s3)

    if n > 10:
        return "Too long!"
    else:
        return s3




# do not modify below this line
print(concatenate("He", "llo"))
print(concatenate("Hello ", "world!"))
print(concatenate("Length", "of10"))
