'''------------------------------------------------------------------
LAB24.py
24.Write a python program to add few customer details into the database and retrieve the information and print in systematic manner.
RegNo: 2117010
26-03-2022
------------------------------------------------------------------'''
import sqlite3 as db

conn = db.connect('customer.db')
cursor = conn.cursor()
cursor.execute("DROP TABLE  IF EXISTS customer")
cursor.execute("create table  customer(id integer primary "
               "key,name text,salary integer,address text)")
print("Table Created")


class Customer:
    def __init__(self):
        pass

    def Insertion(self):
        self.id = int(input("Enter the id"))
        self.name = input("Enter the name ")
        self.salary = int(input("Enter the salary"))
        self.Addr = input("Enter the address")

        if cursor.execute("insert into customer values(?,?,?,?)", (self.id, self.name, self.salary, self.Addr)):
            print("data Inserted Sucessfull")
        else:
            print("data NOt Inserted ")

    def UpdateData(self):
        cust_id = int(input("Enter the customer ID \n want update "))
        if cursor.execute(f"select * from customer where id={cust_id}"):
            print("Update data value")
            if cursor.execute(f"select * from customer where id={cust_id}"):
                name = input("Enter the Name: ")
                salary = int(input("Enter the salary: "))
                address = input("Enter the Address: ")
                if cursor.execute(f"update customer set name='{name}',"
                                  f"salary = {salary}, address = '{address}'"
                                  f"where id = {cust_id}"):
                    print("Data successfully updated")
                else:
                    print("Data updation failed")
            else:
                print(f"no data found for custoner id {self.cust_id}")

    def data_delete(self):
        cust_id = int(input("Enter the custid you wish to delete: "))
        if cursor.execute(f"delete from customer where id={cust_id}"):
            print("Data successfully deleted")
        else:
            print("Data deletion failed")

    def Display(self, cust_id=None):
        if cust_id is not None:
            query = f"select * from customer where id={cust_id}"
        else:
            query = "select * from customer"
        data = cursor.execute(query)
        data = data.fetchall()
        print("id\tname\tsalary\taddress")
        for row in data:
            print(f"{row[0]}\t{row[1]}\t{row[2]}\t{row[3]}")


c = Customer()
val = "y"
while val == 'y':
    print("\n1. Insertion \t2. Display \t3.Display specific \t4.update \t5.Delete\t6. Exit\n")
    ch = int(input("Enter the Choice :"))
    if ch == 1:
        c.Insertion()
    elif ch == 2:
        c.Display()
    elif ch == 3:
        id = int(input("Enter the customer id "))
        c.Display(id)
    elif ch == 4:
        c.UpdateData()
    elif ch == 5:
        c.data_delete()
    else:
        print("Invallid choice ")
    val = input("Want to perform again :\t (y/n)")
