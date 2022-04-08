from .Relations import Relation

class Number1(Relation):
    def __init__(self, Num1, Num2):
        super().__init__()
        self.N1 = Num1
        self.N2 = Num2

    def Equal(self):
        return self.N1 == self.N2

    def Greater_Than(self):
        return self.N1 > self.N2

    def Less_Than(self):
        return self.N1 < self.N2

    def Greater_than_Equal(self):
        return self.N1 >= self.N2

    def Less_than_Equal(self):
        return self.N1 <= self.N2
