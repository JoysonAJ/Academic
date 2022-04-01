'''------------------------------------------------------------------
LAB2.py
2.Write a python program to print the prime and perfect number from 1 to 100.
RegNo: 2117010
20-12-2021
------------------------------------------------------------------'''

print("1", end=', ')
for i in range(2, 100):
    flag = 1
    for j in range(2, i):
        ans = i % j
        if ans == 0:
            flag = 0;

    if flag == 1:
        print(i, end=', ')
print()

print("The Perfect NUmber is")

# Perfect Number
for i in range(1, 100):
    SumOfNum = 0
    for j in range(1, i):
        if (i % j) == 0:
            SumOfNum += j
    if SumOfNum == i:
        print(i, end='  ')
