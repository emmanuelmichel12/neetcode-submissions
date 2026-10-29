class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):

            return False

        mymap = {}
        mymap2 = {}

        for i in s:
            if i in mymap:
                mymap[i] += 1
            else:
                mymap[i] = 1

        for i in t:
            if i in mymap2:
                mymap2[i] += 1
            else:
                mymap2[i] = 1

        for key, val in mymap2.items():
            if key not in mymap:
                return False
            else:
                val1 = mymap.get(key)
                val2 = mymap2.get(key)
                if val1 != val2:
                    return False
        return True