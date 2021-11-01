# ethan coyle
# inclass programming assignment for November 1,2021
# Dr.Saikat- CMPS 4143 Java/Python
# this is 



list= ['glenn', 'martha','Bilbo']
list[1]= 'Frodo' # change the value of the second index in list
print(list)
tuple= ('Glenn', 'Martha', 'Bilbo')


# test to see if can change the tuple
try:
    tuple[1]= 'Henry' # cannot change this in the tuple because immutable
except:
    print("invalid: cannot change index values inside a tuple\n")

# print out the tuple value 
for i in tuple:
    print(i)

print(" we now counting words for whole paragraph")
print("===========================================\n")
text= "The lone lamp post of the one-street town flickered not quite dead but definitely on its way out. Suitcase by her side she paid no heed to the light, the street or the town. A car was coming down the street and with her arm outstretched and thumb in the air, she had a plan."

WordList= text.split()
print(WordList)

count=0

for WordList in WordList:
    if WordList=="the":
        count+=1
print("The word (the) occured ", count, " times")

count=0
print(WordList.count("the"))

dictionary= {'age :':5000, 'ClassRole : ': 5, 'Grade : ': 0, "gpa :": 1.2}
# the i is the key
for key,val in dictionary.items():
    print(key,val) # print out the key and value

# sort the dictionary
for i in sorted (dictionary) :
    print ((i, dictionary[i]), end =" ")


d = {'abc': 10, 'dfe': 30, 'qwe': 100, 'qra': 25,
'iop': 76, 'poq': 54}

# find the items
items = d.items()
print(items)
lst=[]
# create an empty list and iterate the key value in dict items
for key,val in d.items():
    lst.append((val,key)) # value then key
print(lst)
newlist= sorted(lst, reverse=True)
print(newlist)
# convert tuple to variable



text = 'Writing programs is a very creative and rewarding activity  You can write programs for many reasons ranging from making your living to solving a difficult data analysis problem to having fun to helping someone else solve a problem  This book assumes that everyone needs to know how to program and that once you know how to program you will figure out what you want to do with your newfound skills'




words = text.split()
print(words)
counts = {}

for word in words:
  counts[word] = counts.get(word, 0) + 1


lst = []
# iterate the key value key pari create new list to hold the values
for key, val in counts.items():
    lst.append((val, key))

lst.sort(reverse=True)

# list go through dictionary items getting key value  abd then sorting tuples value key
print(sorted([ (v, k) for k, v in counts.items ()]))
 # through iteration  both these will print out the  same
for val, key in lst[:10]:
    print("\n")
    print(key, val)


print(lst)
print(counts)
lst = sorted(i)

tuple= (" henryPotator", "ClassLoser", 15)
name,profession, age=tuple
print("Name is : ", name,"\nProfession is : ", profession,"\nAge is :",age)

word ='close'
anagrams= ['locse', 'lcose', 'eclos','closest']

from collections import Counter
def check(s1, s2):
   
    # implementing counter function
    if(Counter(s1) == Counter(s2)):
        print("The strings are anagrams.")
    else:
        print("The strings aren't anagrams.")


word ='close'
anagrams= ['locse', 'lcose', 'eclos','closest']

# check all the values in side of the list compare to the 
check( word,anagrams[0])
check( word,anagrams[1])
check( word,anagrams[2])
check( word,anagrams[3])


