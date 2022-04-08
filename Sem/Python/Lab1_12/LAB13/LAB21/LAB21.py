'''------------------------------------------------------------------
LAB21.py
21.Program to illustrate multilevel inheritance Box (length,breadth,,height) as the super class. Boxweight (weight) and Boxshipment (cost) as the subclasses. Illustate the use of super keywords, constructor assign the value not zero.
RegNo: 2117010
12-03-2022
------------------------------------------------------------------'''

class Box:
    def __init__(self, length, breadth, height):
        self.length = length
        self.breadth = breadth
        self.height = height

    def Display(self):
        print("The length is", self.length)
        print('The Breadth is', self.breadth)
        print("The height is", self.height)


class BoxWeight(Box):
    def __init__(self,length, breadth, height,weight):
        super(BoxWeight, self).__init__(length, breadth, height)
        self.weight=weight

    def Display(self):
        super(BoxWeight, self).Display()
        print("Weight ofthe Box",self.weight)

class BoxShipment(BoxWeight):
    def __init__(self,length, breadth, height,weight,shipment):
        super(BoxShipment, self).__init__(length, breadth, height,weight)
        self.shipment=shipment

    def Display(self):
        super(BoxShipment, self).Display()
        print("The Shipment",self.shipment)

bx= BoxShipment(4,5,6,34,650)
print("\n-----------------------------------\n")
bx.Display()
print("\n-----------------------------------\n")