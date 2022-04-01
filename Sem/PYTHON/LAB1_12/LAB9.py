'''------------------------------------------------------------------
LAB9.py
9.Write a Python program to perform linear search on a list of integers. Input the
content of the list.
RegNo: 2117010
29-01-2022
------------------------------------------------------------------'''

def LinearSearch(li,n):
    LiSearch=int(input("Enter The element to be searched"))
    for i in range(0,n):
        if li[i] == LiSearch:
            return i+1

    return "Not Foud"


li=[]
n=int(input("Enter the number of element "))
print("enter the element into List")
for i in range(0,n):
    li.append(int(input()))

i= LinearSearch(li,n)
print("The Linear search result is ",i)