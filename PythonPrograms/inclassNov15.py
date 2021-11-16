# Ethan Coyle
# Dr. Saikat
# in class programmng assignment
# keeping track of the minimum value when pushing 
#and popping values in a stack and print out the min
# val whenever the user wants to print the minimum value
# November 15,2021

class Stack(): #Class for Stack
    def __init__(self):
        self.data = [] #defining the _init_ method for stack
        self.min = None

    def push(self, item): #defining method to push element into stack
        self.data.append(item)
        self.minimum()

    def pop(self): #defining method to pop element from the stack
        if self.isEmpty():
            print("Stack currently empty")
        else:
            print("popping element successful")
            return self.data.pop()

    def minimum(self): #defining method to keep track of minimum
        if self.min is None:
            self.min = self.viewtop()
        else:
            if self.viewtop() < self.min:
                self.min = self.viewtop()

    def Min(self): #defining method to return minimum element
        return self.min

    def viewtop(self): #defining method to get top element in stack viewtop()
        try:
            return self.data[-1]
        except IndexError as e:
            print(e)

    def size(self): #defining method to get the size of the stack
        return len(self.data)

    def isEmpty(self): #defining method to check if stack is empty or not
        return self.size() == 0


stack = Stack() #Create an object stack of class Stack()
stack.push(1)
stack.push(-50)
stack.push(500)
stack.push(12)
print(" THe min value in our stack is : ", stack.Min())
stack.push(-55)
print("The top of our stack is : ",stack.viewtop())
stack.pop()
print (" the top of our stack is now : ",stack.viewtop())
stack.push(-43)
stack.pop()
stack.pop()
stack.pop()
print(" THe min value in our stack is : ", stack.Min())