'''------------------------------------------------------------------
LAB25.py
25.Write a python application to generate student report card enter all the details of the student required. Calculate the marks, average,and resuls, then update the information accordingly.Write a python application to generate student report card enter all the details of the student required. Calculate the marks, average,and resuls, then update the information accordingly.
RegNo: 2117010
26-03-2022
------------------------------------------------------------------'''
import sqlite3 as s

conn = s.connect('Student.db')

cursor = conn.cursor()
cursor.execute("DROP TABLE  IF EXISTS Student")
cursor.execute("create table  Student(id integer primary key,name text,mark1 integer,mark2 integer,"
               "mark3 integer,total integer ,average real,result text)")

print("Table Created")


class Student:

    def Insert(self):
        self.regNo = int(input("Enter the Register number"))
        self.name = input("Enter the name \t :")
        print("enter the marks for 3 subject")
        self.mark1 = int(input())
        self.mark2 = int(input())
        self.mark3 = int(input())
        self.total = self.mark1 + self.mark2 + self.mark3
        self.avg = self.total / 3

        if self.mark1 < 35 or self.mark2 < 35 or self.mark2 < 35:
            self.result = "failed"
        elif self.avg >= 90:
            result = "Distinction"
        elif self.avg >= 70:
            self.result = "First"
        elif self.avg >= 50:
            self.result = "Second"
        elif self.avg >= 35:
            self.result = "Passed"

        if cursor.execute("insert into Student values(?,?,?,?,?,?,?,?)",
                          (self.regNo, self.name, self.mark1, self.mark2, self.mark3, self.total, self.avg,
                           self.result)):
            print("DATA INSERTED")
        else:
            print("NOT INSERTED DATA")

    def Display(srlf):
        id = int(input("ENTER THE STUDENT ID TO DISPLAY RECORDS"))

        cursor.execute(f"select * from Student where id = {id}")
        data = cursor.fetchone()
        if (data is not None):
            print(f"{data[1]} Report Card")
            print("Register Number: \t", data[0])
            print("Name: \t ", data[1])
            print("Mark 1: \t ", data[2])
            print("Mark 2: \t", data[3])
            print("Mark 3: \t", data[4])
            print("Total: \t", data[5])
            print("Average: \t", data[6])
            print("Result: \t", data[7])
        else:
            print("STUDENT DATA IS NOT FOUND ")


S = Student()

y = "y"
while y == 'y':

    print("1)INSERT DATA\t 2) DISPLAY DATA 3)COMMIT DATA 4) EXIT")
    c = int(input("ENTER YOUR CHOICE:"))
    if c == 1:
        S.Insert()
    elif c == 2:
        S.Display()
    elif c == 3:
        conn.commit()
        print("data Committed")
    elif c == 4:
        exit()
    else:
        print("WRONG CHOICE")

    y = input("Want to perform again :\t (y/n)")
