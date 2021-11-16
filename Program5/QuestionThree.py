#CREATE a classs called Queue to nstantiat the running for
# the average from the user input
class Queue:
    # create the constructor for the queue
    def __init__(self, n):
        self.q=[0 for i in range(n)]
        
    #enqueue function
    def enqueue(self):
        self.q = self.q[1:]

    #dequeue function
    def dequeue(self, val):
        self.q.append(val)
    #function to return the sum
    def queue_sum(self):
        return sum(self.q)
    
#class to take input and return the AVERAGE
class StreamAverage:
    # create basic constructor for the window and stream
    def __init__(self):
        self.WindowSize = 0
        self.stream = []
    # method inside of the stream to read in the 
    # user data  and override the window and stream  
    #function to take input
    def UserData(self):
        # read in the size of the window
        self.WindowSize = int(input("What is the Size of your Window? : "))
        # read in the the streams separated by collon
        # we will put them in a list and split them by commas
        self.stream = list(map(int, input().split(",")))
    #function to Average the moving average
    def Average(self):
        output=[]
        temp = 0
        #queue object
        queue = Queue(self.WindowSize)
        for i in range(len(self.stream)):
            #calculating the moving average by adding 
            #stream element 
            queue.enqueue()
            queue.dequeue(self.stream[i])
            #moving average 
            temp = round(queue.queue_sum()/min(i+1, self.WindowSize), 2)
            #adding the moving average value to outout
            output.append(temp)
        return output
#object of class moving average
TestingCase = StreamAverage()
#call the method inside of the class to take the user input
TestingCase.UserData()
#returnt the moving average
print(" The result of Calculation is :", TestingCase.Average())