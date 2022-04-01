'''------------------------------------------------------------------
LAB5.py
5.Write a Python program to Count overlapping substring in a given string
RegNo: 2117010
15-01-2022
------------------------------------------------------------------'''

MainString = str(input("Enter the String :"))
SubString = str(input("Enter Sub String :"))

j = c = 0

for i in MainString:
    pos = MainString.find(SubString, j,len(MainString))
    if (pos != -1):
        j = pos +1
        c += 1
    else:
        j += 1
print("Overlaping String Count is",c)

# print(MainString[0:9])
# print((MainString[10:18]))

# MainString = "PythonforPythonforPythonforPython"
# SubString = "PythonforPython"
