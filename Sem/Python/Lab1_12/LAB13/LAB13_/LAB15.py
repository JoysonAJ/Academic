'''------------------------------------------------------------------
LAB15.py
15.Write a python script
 1) To generate and print a dictionary that contains a number(between 1 and n) in the
    form (x,x*x) .
 2) To Map two list into dictionary.
RegNo: 2117010
19-02-2022
------------------------------------------------------------------'''


def SquareDictionary(n):
    for i in range(1, n + 1):
        Num1[i] = i * i
    print(Num1)


Num1 = {}
n = int(input("Enter the Value for n"))
SquareDictionary(n)


def ListInput(Ls):
    List1 = []
    print("Enter the ", m, " Element")
    for i in range(0, m):
        List1.append(int(input()))

    return List1


m = int(input("\nEnter the size of list"))
li1 = []
li2 = []

print("Input for the List 1 & ",end =" ")
li1 = ListInput(m)
print("Enter Input for the List 2 & ",end =" ")
li2 = ListInput(m)

info = dict(zip(li1, li2))
print(info)
