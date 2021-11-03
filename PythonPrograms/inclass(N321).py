# ethan coyle
# in class programming assignment for november 2, 2021


string1 ='here i am I'
substring= 'I am'
position= string1.find(substring)
print(string1[position:position+len(substring)])


# with regualr expression
import re

string2 = 'eating carrots topped with mayonaise is fun'
substring2= 'eating carrots'
position2=re.findall(substring2,string2)
print(position2)

print(string2[:2-9])

print(string2.startswith('eating'))# finsing eating
stringList= 'bubba bubba chubba scooba doob doob'
for s in stringList:
    if re.search('^bubba',s):
        print(s, '\n')

# finding email stuff from sample txt from email log

hand= open('PythonPrograms\sample.txt')
for line in hand:
    if re.search('^From:',line):
        print(line)
list=[11,11,11,11,11,11]
a=set() # only contain unique items
print(list)
# how to convert

print(set[list])

# wild card characters


