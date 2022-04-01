'''------------------------------------------------------------------
LAB6.py
6.Write a function called showNumbers that takes a parameter called limit. It should
print all the numbers between 0 and limit with a label to identify the even
and odd numbers. For example, if the limit is 3, it should print:
o 0 EVEN
o 1 ODD
o 2 EVEN
o 3 ODD
RegNo: 2117010
22-01-2022
------------------------------------------------------------------'''

def showNumbers(Limit):
    for i in range(0, Limit + 1):
        if i % 2 == 0:
            print(i,"Even")
        else:
            print(i,"ODD")


Limit = int(input("Enter the Limit"))
showNumbers(Limit)
