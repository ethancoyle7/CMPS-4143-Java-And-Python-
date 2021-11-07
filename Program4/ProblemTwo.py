#========================================================================#
#                                                                        #
# Author - Ethan Coyle                                                   #
# Inst.  - Dr. Saikat                                                    #
# Class  - CMPS 4143(Java/Python)                                        #
# Assin  - Program 4 Problem Two                                         #
#                                                                        #
# About-                                                                 #
#. (35 points) Write a Python program using file operation.              #
#  You will open an input file “students.dat” that will contain a list of#
#  student names, classification, and grade in the class. (All student   #
# info is completely made up) You should read through the entire input   #
# file.  After reading in all information, do operations (No built-in    #
# functions like Average, min, max, count, etc.), close the input file   #
#  and write that following information with labels to an output file    #
#  “student_statistics.txt”                                              #
# •	Highest grade in the class                                           #
# •	Lowest grade in the class                                            #
# •	Class average grade (rounded to one decimal place)                   #
# •	Number of freshmen students                                          #
# •	Number of sophomore students                                         #
# •	Number of junior students                                            #
# •	Number of senior students                                            #
#========================================================================#


# define the function definition and it processes
# will be calle whenever the function is being mention inside of the main
# portion of our program
def anagrams(Values):
    Dictionary = {}
    #Loop through all items in the list
    for i in Values:
        #Sort the word
        key = ''.join(sorted(i))
        #We must check to make sure the word doesnt exist already
        if key not in Dictionary:
            Dictionary[key] = []
        #add the word to the group
        Dictionary[key].append(i)
    #convert the dictionary values to a list and return them
    return [val for k,val in Dictionary.items()]
#------- main portion of our program-----------------

    # read in the first string
StringList = ['eat','tea','tan','ate','nat','bat']
print(anagrams(StringList))
# reading the second sample string
StringList = ['']
# go to function definition to determine the output
print(anagrams(StringList))

# reading the thir string 
StringList = ['a']
print(anagrams(StringList))

# now we create a prompt for user to try
userlist = [] 
userlist = [item for item in input("Lets test yours : ").split()]
# see if any matches found
print(anagrams(userlist))