'''------------------------------------------------------------------
LAB23.py
23.Create an abstract class Relation with abstract method to implement the basic relational operators (==, <>, >=) on two integers. Define class numbers with two data fields (N!, N2) which extends class Relation and illustrate in the main class. (hint: use user module all the three program in different files like sample car example.)
RegNo: 2117010
19-03-2022
------------------------------------------------------------------'''
from Lab23Module import  NumberFile as n

Num1 = int(input("Enter the Number 1 : "))
Num2 = int(input("Enter the Number 2 : "))

opr = n.Number1(Num1,Num2)

print(Num1," Equals ",Num2," is ",opr.Equal())
print(Num1," Less  ",Num2," is ",opr.Less_Than())
print(Num1," Greater   ",Num2," is ",opr.Greater_Than())
print(Num1," Less Than Equals To  ",Num2," is ",opr.Less_than_Equal())
print(Num1," Equals  ",Num2," is ",opr.Greater_than_Equal())
print()