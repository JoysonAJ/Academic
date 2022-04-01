'''------------------------------------------------------------------
LAB1.py
1.Write a Python Program to display the student marks card in a proper format
RegNo: 2117010
20-12-2021
------------------------------------------------------------------'''
name = str(input("Enter the name"))
Class = str(input("Enter the class"))
RegNo = int(input("ENter the Register number"))

total = 0
marks1 = int(input("Enter the Subject 1 Marks "))
marks2 = int(input("Enter the Subject 2 Marks "))
marks3 = int(input("Enter the Subject 3 Marks "))
marks4 = int(input("Enter the Subject 4 Marks "))
marks5 = int(input("Enter the Subject 5 Marks "))
marks6 = int(input("Enter the Subject 5 Marks "))

total = marks1 + marks2 + marks3 + marks4 + marks5 + marks6

print("-------------------------------------------------------")
print(f"NAME OF THE STUDENT {name}")
print(f"CLASS OF THE STUDENT {Class}")
print(f"REGISTER NUMBER OF THE STUDENT {RegNo}")
print()
print("THE MARKS OF THE STUDENT")
print(f"MARKS IN SUBJECT 1 {marks1}")
print(f"MARKS IN SUBJECT 2 {marks2}")
print(f"MARKS IN SUBJECT 3 {marks3}")
print(f"MARKS IN SUBJECT 4 {marks4}")
print(f"MARKS IN SUBJECT 5 {marks5}")
print(f"MARKS IN SUBJECT 6 {marks6}")
print("----------------------------------")
print("TOTAL \t", total)
print("PERCENTAGE", round(total / 6, 0))
