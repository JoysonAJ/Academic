'''------------------------------------------------------------------
LAB18.py
18.Write a function called string_dict that will take as parameter a string. The string can have alphabets, spaces, question marks, periods and apostrophes only. The function returns a dictionary. The keys of the dictionary should be the words from the original string, and the values should be the frequency of that word.
RegNo: 2117010
26-02-2022
------------------------------------------------------------------'''


def SetInput(num1):
    print("---------- Set", num1, "---------------- ")
    n = int(input("Enter the number of elements for Set"))
    print("insert the", n, "Element")
    set3 = set()
    for i in range(0, n):
        set3.add(int(input()))
    return set3


def SetCheck(s1, s2):
    if s1.issubset(s2):
        return 'Sub set'
    else:
        return 'Not the Subset'


set1 = set()
set2 = set()

set1 = SetInput(1)
set2 = SetInput(2)

print(set1 ,"\n",set2)

Ans = SetCheck(set1, set2)
print("Set 1 is", Ans, " of Set 2")

Ans1 = SetCheck(set2, set1)
print("Set 2 is", Ans1, " of Set 1")
