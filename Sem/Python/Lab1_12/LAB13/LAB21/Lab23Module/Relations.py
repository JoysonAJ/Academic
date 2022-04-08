from abc import abstractmethod,ABC

class Relation(ABC):
    def __init__(self):
        pass

    @abstractmethod
    def Equal(self):
        pass

    @abstractmethod
    def Greater_Than(self):
        pass

    @abstractmethod
    def Less_Than(self):
        pass

    @abstractmethod
    def Greater_than_Equal(self):
        pass

    @abstractmethod
    def Less_than_Equal(self):
        pass