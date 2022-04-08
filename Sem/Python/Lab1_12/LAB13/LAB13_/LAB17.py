'''------------------------------------------------------------------
LAB17.py
16.Write a python program to sort the elements in the array using bubble sort technique and display the elements in descending order.
RegNo: 2117010
19-02-2022
------------------------------------------------------------------'''
from array import array as arr

from BubleSort import BubbleSort ,Display


list1 = arr('i')

n = int(input('Enter the size of array'))
print("Enter the element into array")
for i in range(0, n):
    list1.append(int(input()))

print("Before Sorting")
Display(list1)

BubbleSort(list1)

print("After Sorting")
Display(list1)

