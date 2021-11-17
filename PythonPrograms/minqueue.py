# Ethan Coyle
# Dr. Saikat CMPS 4143
# Contemporary Programming Languages Python Jave
# Implementing a find min function method inside of a
# queue

class Queue(): #Class for Queue
    def __init__(self):
        self.data = [] #defining the _init_ method for queue
        self.min = None

    def enqueue(self, item): #defining method to enqueue element into queue
        self.data.append(item)
        self.minimum()

    def dequeue(self): #defining method to dequeue element from the queue
        if self.isEmpty():
            print("Queue currently empty")
        else:
            print("popping element successful")
            return self.data.dequeue()

    def minimum(self): #defining method to keep track of minimum
        if self.min is None:
            self.min = self.viewtop()
        else:
            if self.viewtop() < self.min:
                self.min = self.viewtop()

    def Min(self): #defining method to return minimum element
        return self.min

    def viewtop(self): #defining method to get top element in queue viewtop()
        try:
            return self.data[-1]
        except IndexError as e:
            print(e)

    def size(self): #defining method to get the size of the queue
        return len(self.data)

    def isEmpty(self): #defining method to check if queue is empty or not
        return self.size() == 0


queue = Queue() #Create an object queue of class Queue()

# enqueuing items onto the queue
queue.enqueue(1)
queue.enqueue(-50)
queue.enqueue(500)
queue.enqueue(12)
# view the minimum value of the queue
print(" THe min value in our queue is : ", queue.Min())
queue.enqueue(-55)
# enque some more to see the top
print("The top of our queue is : ",queue.viewtop())

# removing one  and then view the top
queue.dequeue()
print (" the top of our queue is now : ",queue.viewtop())
queue.enqueue(-43)
queue.dequeue()
queue.dequeue()
queue.dequeue()

# what is the new min value
print(" THe min value in our queue is : ", queue.Min())