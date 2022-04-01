'''------------------------------------------------------------------
LAB8.py
8.Write a python program to satisfy the following requirements:
a) List number of student who enrolled for python course.
b) List number of student who enrolled for RDBMS Course Only
c) List number of student who enrolled for RDBMS Python Only
d) List number and name of the student for both RDBMS Python Only
e) List number and name of the student for either RDBMS or Python not for both
f) List number and name of the student for either RDBMS or Python.
RegNo: 2117010
29-01-2022
------------------------------------------------------------------'''


def Display(List):
    for i in List:
        print(*i)


Course = [[['Likith'], ['Python', 'RDBMS', 'Ml']],
          [['Ashil'], ['RDBMS', 'ML']],
          [['Listen'], ['RDBMS', 'Python']],
          [['Winson'], ['Big Data', 'ML']],
          [['Shravan'], ['RDBMS']],
          [['Kevin'], ['Python']],
          [['Jeevan'], ['Python', 'RDBMS']]
          ]
CountRDBMS = CountPy = Py_rdbms = 0
for i in range(0, len(Course)):
    for j in range(0, len(Course[i])):
        for k in range(0, len(Course[i][j])):  # to Length of subject
            if j > 0:
                # case 1:
                if Course[i][j][k] in 'Python':
                    CountPy += 1
                # case 2:
                if Course[i][j][k] in 'RDBMS' and len(Course[i][j]) == 1:
                    CountRDBMS += 1
                # case 3:
                if (Course[i][j][k] in 'Python' or Course[i][j][k] in 'RDBMS') and len(Course[i][j]) == 1:
                    Py_rdbms += 1
print("\nA)   The total Course python enrolled by students  ", CountPy)
print("\nB)   The Student who enrolled only  Course RDBMS ", CountRDBMS)
print("\nC)   The Student who enrolled only  Course python and RDBMS  ", Py_rdbms)
print()

name1 = []
name2 = []
name3 = []

flag = False
for i in range(0, len(Course)):
    for j in range(0, len(Course[i])):
        k = 0
        while k < len(Course[i][j]):
            if j > 0:
                if (Course[i][j] == ['Python', 'RDBMS'] or Course[i][j] == ['RDBMS', 'Python']) and len(
                        Course[i][j]) == 2:
                    # case 4
                    name1.append(Course[i][j - 1])
                    flag = True
                else:  # case 4
                    if (Course[i][j][k] in 'Python' or Course[i][j][k] in 'RDBMS'):
                        name2.append(Course[i][j - 1])
                        flag = True
                # case 6:
                if (Course[i][j][k] in 'Python' or Course[i][j][k] in 'RDBMS'):
                    name3.append(Course[i][j - 1])
                    flag = True
                if flag == True:
                    k += 1
            k += 1
print("\nD)   The number students who are enrolled for python and Rdbms only ->", len(name1))
Display(name1)
print("\nE)   The number and name of the student for either RDBMS or Python not for both", len(name2))
Display(name2)
print("\nF)   The Number of Student who either RDMBS or Python -> ", len(name3))
Display(name3)
