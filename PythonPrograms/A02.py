# this is the inclass assignment for our python lecture
# Ethan Coyle
# Dr. Saikat
# CMPS 4143- Java/Python

x = 50
print("c value is :", x)
if True:
    print(" i am a true value")
if (int(x) > 10):
    print(" that is a non valid value is greater than 10")
    
print(" end of our program")

print(" enter a value inside ")
input=input()
print(" you have entered", input)

if(int(input)>10):
    print( "your value geater than 10")
elif(int(input)==10):
    print("they are the same")
else:
    print(" Smaller than 10")


# instantiate a while  with try catch block
print(" please enter a vlaue")
x=input()
print(" you entered")
try:
   intVal=int(x)
   while intVal>0:
    print(intVal)
    intVal-=1
except:
    print("you entered a  a non numeric value")


# for loopsiedoopsie

