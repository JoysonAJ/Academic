'''------------------------------------------------------------------
LAB13.py
13.Write a python program using tuple to satisfy following business requirements:
  a) List the number of courses opted by student “John”
  b) List all the courses opted by student “John”
  c) Student “John” is also interested in elective course mentioned above. Print the updated tuple including electives.
  d) Check whether student “john” is allowed to change his course from SE to Computer network.
Consider the list of courses opted by a student “john” and available electives as a part of student Management System.
Courses: (“Python Programming”, ”RDBMS”, ”Web Technology”,“Software Engineering”)
Electives:(”Business Intelligence”, Big Data Analytics”)
RegNo: 2117010
19-02-2022
------------------------------------------------------------------'''

Courses = ("Python Programming", "RDBMS", "Web Technology", "Software Engineering")
Electives = ("Business Intelligence", "Big Data Analytics")

print(" a)The number of course opted by john ", len(Courses))
print()

print(" b) The Course Opted by John is :")
print(Courses)

sub1 = Courses + Electives
print("\n c)All course opted by John \n", sub1)

print("\nJohn changing course SE to CN :")

ListCourse = list(sub1)
ListCourse[ListCourse.index('Software Engineering')] = 'Computer network'
sub1 = tuple(ListCourse)
print(sub1)
