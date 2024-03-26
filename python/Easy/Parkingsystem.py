class ParkingSystem:
    a = [0, 0, 0, 0]
    def __init__(self, big: int, medium: int, small: int):
        self.a[1] = big
        self.a[2] = medium
        self.a[3] = small


    def addCar(self, carType: int) -> bool:
        if self.a[carType] > 0:
            self.a[carType] -= 1
            return True
        return False
    
s = ParkingSystem(2, 2, 2)
print(s.addCar(2))
print(s.addCar(2))
print(s.addCar(2))
    
