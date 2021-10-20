# ethan coyle
# Dr. Saikat
# CMPS 4143 Java Python
# in class programming assignment





print("enter two values ")
x= int(input())
y= int(input())
print("Your X Value is: ", x, 
      "\nYour Y Value is: ",y)

def addition(para1,para2):
    return para1+para2# return the addiotn of both

try:
    # try the function that passes back in the result
    result= addition(x,y)
    print("\nThe Result Of The Addition Is:  ", result, "\n\n")
except:
    print(" Invalid not proper data type loser ")


# function definition for fibonnaci
def Fibonacci(n):
   
    
    if n < 0:
        print("That invalid input")
 
    # Check if n is 0
    # then it will return 0
    elif n == 0:
        return 0
 
    # Check if n is 1,2
    # it will return 1
    elif n == 1 or n == 2:
        return 1
 
    else:
        return Fibonacci(n-1) + Fibonacci(n-2)
 
# prompt the user to input the number that would like to fibonacci
print(" Enter a number to find the fibonacci number: ")
value = int(input())
print(" The Value of the Fibonacci Number is: " ,Fibonacci(value)) # return the recursive value number




def Pay(hours,rate):
    return hours *rate



print(" how many hour you work today?")
hours= int(input())# read the input from the user
print("enter the rate at which you work")
rate=int(input())

if hours>40:
    rate= rate+5


print(" Your pay is ", Pay(hours,rate)," before ugly taxes\n" )


