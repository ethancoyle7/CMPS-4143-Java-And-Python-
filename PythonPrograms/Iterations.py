# Ethan Coyle
# Dr.Saikat
# October 18 2021
# CMPS 4143- Java and Python Contemporary Topics

import random
# range
# (start, stop, "step")

print("Enter a number")
x = input()
print("You entered: " + x)

try:
    intVal = int(x)
    for i in range(0, intVal, 1):
        print(i)
    for i in reversed(range(0, intVal, 1)):
        print(i)

    print('Blastoff!')
except:
    print('You have not entered a numeric value')

# statring at 0 counting by two till 10 even numbs
for i in range(0, 10, 2):
    print(i)

try:
    intVal = int(i)
    for i in range(0, intVal, 1):
        print(i)

    for i in reversed(range(0, intVal, 1)):
        print(i)

except:
    print(" not valid number try againsies\n")

print(" now we reading from a list\n\n=====================\n")
L1 = [1, 2, 3, 4, 5]
try:
    for i in range(len(L1)):
        # print the index and then print out the values inside the index
        print(" length = :", i, " and the value is:  ", L1[i])
except:
    # for example if were to read from an invalid list, except will catch
    # and throw an error message but finallu will still process through
    print(" thats not a value list\n")
finally:
    print(" We out of the try catch\n")

# python program to find the smallest number
# list of numbers
a = [18, 52, 23, 41, 32]

# find smallest number using min() function
smallest = min(a)

# print the smallest number
print(f'Smallest number in the list is : {smallest}.')


