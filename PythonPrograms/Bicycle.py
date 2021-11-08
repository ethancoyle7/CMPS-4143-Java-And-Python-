# Ethan Coyle
# CMPS 4143- Python and Java Dr.Saikat
# this is the inclass assignment that hold 
# bike class and mountain class showing 
# how we can overrride and change attributes based on
# the object creation
# November 8,2021


# creation of the parent class bike that has methods to
# define it inside of the class
class Bicycle:
    # create constructor andd the variable 
    gear=int()
    speed=int()
    def __init__(self, Gear=None, BikeSpeed=None):
        self.gear = Gear
        self.speed = BikeSpeed
    # function definitions to hold the break, speed and incremation
    def brake(self, decrement=None):
        self.speed-=decrement
    def speedUp(self, increment=None):
        self.speed+=increment
    # definition to show the staus of the bike
    def status(self):
        print(f'Bike\nSpeed is {self.speed}mph\nGear is {self.gear}')

# class Mountain Bike that inherits from the bicycle class
class mountainBike(Bicycle):
    gear=int()
    speed=int()
    seatHeight=int()
    # constructor that holds gear and speed and height of seat
    def __init__(self, Gear=None, BikeSpeed=None, SeatHt=None):
        self.gear = Gear
        self.speed = BikeSpeed
        self.seatHeight = SeatHt
    def status(self):
        print(f'Mountain Bike\nSpeed is {self.speed} mph\nGear is {self.gear} \nSeat Height {self.seatHeight}')

# objects created to show the mountina bike and the bike class objects
# both hold gear,speed, seatheight
MountainBike1 = mountainBike(9,87,1)
Bike = Bicycle(2,900)

# Get the status before
print('\r\n After changing the speed of both')
MountainBike1.status()
Bike.status()

# Speed Up my mountain bike by 4 mph
MountainBike1.speedUp(5000)

# Brake up my car by 6 mph
Bike.brake(0)

# print out status after changing values
print('\r\nAfter Changing the speed, our status is : \n')
MountainBike1.status()
Bike.status()