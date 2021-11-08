#Ethan Coyle
# CMPs 4143- Dr. Siakat In class Prgram
# creating bike class and attributes and methods for how they work

class Bicycle:
    # initialize the constructor for the bicycle class and 
    # variable to self.(attribute)
    def __init__(self,gears=3,speed=0,brakes=False):
        self.gears = 0
        self.maxGears = gears
        self.speed = speed
        self.brakes = brakes
    # define how each function will work
    def changeGearUp(self):
        if self.gears == self.maxGears:
            print("Max gears limit reached")
        else:
            self.gears += 1
            print("gear incremented")

    def changeGearDown(self):
        if self.gears == 0:
            print("gears cannot be reduced")
        else:
            self.gears -= 1
            print("gear decremented")

    def speedUp(self):
        self.speed += 1
        print("speed incremented")

    def speedDown(self):
        if self.speed == 0:
            print("speed cannot be reduced further")
        else:
            self.speed -= 1
            print("speed reduced")

    def applyBrakes(self):
        if self.brakes :
            print("brakes already on")
        else:
            self.brakes = True
            print("brakes applied")
    def removeBrakes(self):
        if not self.brakes:
            print("brakes alreay off")
        else:
            self.brakes = False
            print("brakes are made off")

    def printStates(self):
        print("Gears = " + str(self.gears))
        print("Speed  = " + str(self.speed) + " m/s")
        print("brakes (True means on/False means off) = ",self.brakes)

# incstance of bicycle
myCycle = Bicycle(20000,1,False)
myCycle.changeGearUp()
myCycle.speedUp()
myCycle.speedUp()
myCycle.speedUp()
myCycle.speedUp()
#print out the states of all the cicles
myCycle.printStates()
