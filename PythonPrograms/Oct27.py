# Ethan Coyle
# Dr. Saikat
# in class program for october 27,2021
#CMPS 4143 -Java/Python


d1=dict()
 #   key        value
 #=======================
d1['python']= 'snake'
d1['c++']= 'programming'
d1['anaconda']= 'big slithery snake'
d1['c']= 'basasics'


# if d1 was list 

for key, val in enumerate(d1):
    # printing out the key as index and value is the value on that index
    # in dictionary, assigns some index when enumerating
    print(key,val)
for key in d1:
    print(key,d1[key])

# if want to check if key is in dictionary
if 'python' in d1:
    print()
    print('python was found it yay ',val)
else:
    print(" is not there loser")

# to find snake, need to find key first

d1.get('anaconda',0)
print(" poop ",val)

Shoppinglist= dict()
Shoppinglist={'eggs':20000, 'butter':2, 'sourbutter':1, 'ugly cheese':90000}
val=Shoppinglist.get('butter',0)
print("we need ", val)

# tally on statisticcs:

# random numers etc from list how to tally
# StList=dict()
# # want to know how many unique names and the count
# StudentList = ['CheeseBall', 'CarrotTop', 'ButterBean', 'CaRRot']
# # how to get the unique names
# for student in StudentList:
#     # want to put each student to dictionary
#     # if student already in dict increase value
#     if student in StudentList:
#         StudentList[student]+= 1
#     else:
#         # if not in there create the student
#         StudentList[student] = 1
# #print(StList)

from statistics import mode
from collections import Counter
 
# initializing the list to read from
TestSentence = [" the bubble jumped upside down and farted on the candle stick eating a chees carrot butter carrot and",
                " the dog ate his relish with cheese ", " samual carrot ate a butter ball and ", " Harry ate and cherry and died"]
# printing out the original list for viewer easement
print("The original list is : " + str(TestSentence))
# grabbing all the words split up and counting the words
Occurances= [wrd for sub in TestSentence for wrd in sub.split()]
# getting frequency
MaxOccuredWord = mode(Occurances)
# printing result
print("The most frequent word was  : " + str(MaxOccuredWord), " Occurring",)

Counter = Counter(Occurances)
MostFrequent = Counter.most_common(1)
  
print(" moist frequent word : ", MostFrequent)



