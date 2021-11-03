
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

def stringToList(string):
    listRes = list(string.split(" "))
    return listRes

#------- main portion of our program-----------------

    # read in the first string
StringList = ['eat','tea','tan','ate','nat','bat']
print(anagrams(StringList))
StringList = ['']
print(anagrams(StringList))
StringList = ['a']
print(anagrams(StringList))



strA = str(input("please enter some words and we check to see about angrams: "))
listRes = list(strA.split(" "))


print(anagrams,(listRes))
