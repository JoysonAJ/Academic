'''------------------------------------------------------------------
LAB14.py
14.Write a Python program to input ‘n’ names and phone numbers to store it in a
dictionary and print the phone number of a particular name.
RegNo: 2117010
19-02-2022
------------------------------------------------------------------'''
def Input(n, j):
    while j < n:
        name1 = input("Name  \t:")
        num1 = input("Contact \t:")
        if len(num1) == 10 and num1.isdigit():
            info[name1] = {}
            info[name1]["name"]=name1
            info[name1]["Phone"]=num1
            print()
            j += 1
        else:
            if len(num1) != 10:
                print("Number Should contain 10 digits")

            if num1.isdigit() == False:
                print("Number should only contain Dogits ")
            print("Invalid re enter the Details")

def FindNum():
    FindName = input("Enter the name ")

    if info[FindName]:
        print("The information of", FindName, "is\n", info[FindName])

    else:
        print("No Contact above name")


info = dict()
n = int(input("Enter the value for n "))
i = 0
Input(n, i)
FindNum()

# Name  	: ashil
# Contact 	:9071872917
#
# Name  	:likith
# Contact 	:7483614609
#
# Name  	:lailesh
# Contact 	:9074080140
#
# Name  	:lynel
# Contact 	:8792502609

