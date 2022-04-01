'''------------------------------------------------------------------
LAB7.py
7.Write a function that returns the sum of multiples of 3 and 5 between 0 and limit
(parameter). For example, if limit is 20, it should return the sum of 3, 5,6, 9, 10, 12,
15, 18, 20.
RegNo: 2117010
22-01-2022
------------------------------------------------------------------'''

def SumOfLimit(Limit):
    result=0
    for i in range(0, Limit + 1):
        if i % 3 == 0 or i % 5 == 0:
            result += i
    return result


result = 0
Limit = int(input("Enter the Limit :"))
result = SumOfLimit(Limit)
print(f"The sum of 3 and 5 till the {Limit} is = {result}")
