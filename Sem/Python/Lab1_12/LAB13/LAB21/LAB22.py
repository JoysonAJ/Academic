'''------------------------------------------------------------------
LAB22.py
22.Write a class Distance with instance variables feet and inches. Include necessary methods. Test the class
RegNo: 2117010
12-03-2022
------------------------------------------------------------------'''

class Distance:
    def __init__(self,feeet=None,inches=None):
        self.feet=feeet
        self.inches=inches

    def Input_data(self):
        self.feet = float(input("Enter the feet "))
        self.inches = float(input("Enter the inches "))

    def Display(self):
        print("The Feet is \t:",self.feet)
        print("The inches  \t",self.inches)

    def Add_method(self,other):
        Nfeet = (self.feet+other.feet) +int( (self.inches+other.inches)/12 )
        Ninches = (self.inches + other.inches) % 12
        return Distance(Nfeet,Ninches)

print("\n")
obj1 = Distance(32,12)
obj1.Display()

obj2 = Distance()
obj2.Input_data()
obj2.Display()

print("\nAddition Of 2 Objects\n")
obj3 = Distance()
obj3= obj1.Add_method(obj2)
obj3.Display()