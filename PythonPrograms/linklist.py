## Ethan Coyle
# November 10,2021 
# This is in classs work for our in class work



class Node:

        #intilize the node data and then pointing to
        # none which is null
        def __init__(self, data):
                self.data = data # node data
                self.next = None # null value

# create the class link list
class LinkedList:

        # intitilize the head of the link list
        # pointing to null(None)
        def __init__(self):
                self.head = None# null value

        # inserting pushing to the node
        # head to the node
        def AddNode(self, new_data):
                new_node = Node(new_data)# insertin new data
                new_node.next = self.head # next then head 
                self.head = new_node

        # Add contents of two linked lists and return the head
        # node of list 
        def addTwoLists(self, first, second):
                # both pointing to null value until is updated
                prev = None
                temp = None
                carry = 0

                # if first or second is not pointing to null
                while(first is not None or second is not None):
                        FirstData = 0 if first is None else first.data
                        SecData = 0 if second is None else second.data
                        Sum = carry + FirstData + SecData

                        # update for calculating next
                        carry = 1 if Sum >= 10 else 0

                        # update the sum if is greater
                        Sum = Sum if Sum < 10 else Sum % 10

                        # Create a new node with sum as data
                        temp = Node(Sum)

                        # if this is the first node then set it as head
                        # of the output list
                        if self.head is None:
                                self.head = temp
                        else:
                                prev.next = temp

                        # set previus so can insert node
                        prev = temp

                        # Move first and second pointers to next nodes
                        if first is not None:
                                first = first.next
                        if second is not None:
                                second = second.next

                if carry > 0:
                        temp.next = Node(carry)

        # printing out the link list inplemented as a method
        def printList(self):
                temp = self.head
                while(temp):
                        print(temp.data)
                        temp = temp.next



# Driver code
# create the two lists and then AddNode add the values each 
first = LinkedList()
second = LinkedList()

# Create first list
first.AddNode(3)
first.AddNode(2)
first.AddNode(1)
# after adding, we print out the contents of our list
print("\r\nThe contents of our first list is :\n",first.printList())

# Now creating our second list AddNode
second.AddNode(6)
second.AddNode(5)
second.AddNode(4)
# output the contents of our list after adding all the nodes
print( "\r\n The contents of our second list is :\n, ",second.printList())

# AddedLink list contatins contents of the first two into addelink list which has the value of the 
# two list aded together and stores
AddedLinkList = LinkedList()
AddedLinkList.addTwoLists(first.head, second.head)
print("\r\n The REsult of Adding the two lists together is :\n",AddedLinkList.printList())
