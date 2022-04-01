'''------------------------------------------------------------------
LAB10.py
10.Write a Python function that takes a list of integers as parameter. The function returns
the maximum and minimum numbers from the list
RegNo: 2117010
5-02-2022
------------------------------------------------------------------'''
def MaxMinList(List,n):
    Maxnum=List[0]
    Minnum=List[0]
    for i in range(0,n):
        if List[i] >= Maxnum:
            Maxnum=List[i]
        if List[i] <= Minnum:
            Minnum=List[i]

    print("Maximum number in the list is ",Maxnum)
    print("Minimum number in the list is ", Minnum)


List=[]
n=int(input("Enter the number of element "))
print("Enter the element into List")
for i in range(0,n):
    List.append(int(input()))

MaxMinList(List,n)