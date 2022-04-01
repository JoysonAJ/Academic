'''------------------------------------------------------------------
LAB11.py
11.Write a Python function that takes a list of integers as parameter. The function
creates two smaller lists from the parameter. One list contains odd and another
even numbers from the bigger list.
RegNo: 2117010
12-02-2022
------------------------------------------------------------------'''

def OddEven(List, n):
    ListOdd = []
    ListEven = []

    for i in range(0, n):
        if List[i] % 2 == 0:
            ListEven.append(List[i])
        else:
            ListOdd.append(List[i])

    print("Main List", List)
    print("The Odd List", ListOdd)
    print("The Even Lisst", ListEven)


List = []
n = int(input("Enter the number of element "))
print("Enter the element into List")
for i in range(0, n):
    List.append(int(input()))
OddEven(List, n)
