#========================================================================#
#                                                                        #
# Author - Ethan Coyle                                                   #
# Inst.  - Dr. Saikat                                                    #
# Class  - CMPS 4143(Java/Python)                                        #
# Assin  - Program 4 Problem Two                                         #
#                                                                        #
# About-                                                                 #
#. (35 points)Given an array of stringsstrs, groupthe anagramstogether.  #
# You can return the answer inany order.AnAnagramis a word or phrase     #
# formed by rearranging the letters of a different word or phrase,       #
# typically using all the original letters exactly once.Inputtype:       #
# A list with words;Outputtype:A list of lists with grouping the         #
# anagrams together                                                      #
#========================================================================#


# define the function definition and it processes
# will be calle whenever the function is being mention inside of the main
# portion of our program
def anagrams(Values):
    # dictionary creaton to compare all the keys adn values
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
    return [Values for key,Values in Dictionary.items()]
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