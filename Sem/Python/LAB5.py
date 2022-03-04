'''------------------------------------------------------------------
LAB5.py
5.Write a Python program to Count overlapping substring in a given string
RegNo: 2117010
15-01-2022
------------------------------------------------------------------'''

MainString = str(input("Enter the String :"))
SubString = str(input("Enter Sub String :"))

if (MainString.count(SubString) > 0):
    flag = True;
else:
    flag = False
    print("Not Possible")
if flag == True:
    print("String Count", MainString.count(SubString))

