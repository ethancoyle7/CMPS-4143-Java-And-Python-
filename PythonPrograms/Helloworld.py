


# Ethan Coyle
# Dr.Saikat- CMPS 4143
# Python Programming Assignment  1
# October 11,2021

# The purpose of this program is to create a simple 
# Hello World Program as well as a summation of 
# two numbers

##Part 1 : Hello World
print("Hello World\n")


#part 2: summation of 2 numbers

#user input 2 numbers
print("Now we will sum 2 numbers\n")
Num1 = input("Please Enter the First Number: ")
Num2 = input("Please Enter the second number: ")

# Using arithmetic + Operator to add two numbers
#read in as a string and converted to int or else
#will concatinata as a string input
sum = int(Num1) + int(Num2)


#print the result
print("The summation of ",Num1," and ",Num2," is: ",sum )
print( " please enter two more numbers and we combine the string\n")
Num1 = input("Please Enter the First Number: ")
Num2 = input("Please Enter the second number: ")
sum1= str(Num1)+str(Num2)
print(sum1)
#  here we see that combination of string

print(type(Num1),type(Num2)) # see the type 
