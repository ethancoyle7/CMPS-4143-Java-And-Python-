#=====================================================================#
# Author - Ethan Coyle                                                #
# Instructor- Dr. Saikat                                              #
# Class     - Contemp. Prog Java/Python                               #
# Course    - CMPS 4143                                               #
# Assignment- Problem 3                                               #
#=====================================================================#
# #  Implement the myAtoi(string s) function, which converts          #
#  a string to a 32-bit signed integer (similar to C/C++'s            #
#  atoi function).  The algorithm for myAtoi(string s)                #
# is as follows:                                                      #
# a) Read in and ignore any leading whitespace.                       #
# b.) Check if the next character (if not already at the              # 
#      end of the string) is 	'-'	 or 	'+'	. Read                #
#      this character in if it is either. This determines             #
#     if the final result is negative or positive                     #
#     respectively. Assume the result is positive if                  #
#     neither is present.                                             #
# c)	Read in next the characters until the next                    #
#      non-digit character or the end of the input is                 #
#     reached. The rest of the string is ignored.                     #
# d)	Convert these digits into an integer (i.e. "123"              #
#       -> 123, "0032" -> 32). If no digits were read,                #
#       then the integer is 0 Change the sign as necessary            #
#      (from step 2).                                                 #
# ¬¬e) If the integer is out of the 32-bit signed integer             #
#      range [-231, 231 - 1], then clamp                              #
#      the integer so that it remains in the range. Specifically,     #
#      integers less than -231 should                                 #
# be clamped to                                                       #
#f.)  Return the integer as the Final Result                          #
                                                                      #
                                                                      #
#=====================================================================#



# creating the definition for myAtoi(passing in the string s inside)
def myAtoi(s):
    # declare a variable to check the number is positive or negative
    PositiveNumber = True

    # storing the string into in string
    InputValueString = ""
    # first condition, if there is nothing in the string return
    if len(s)==0:
        return 0
    i=0
    
    # any white space, we ignore
    while i<len(s):
        if s[i]!=" ":
            break
        i+=1

    # if the first character after whitespaces:
    # if first char after whitespace is a digit, add to string input
    # if is a + sign dont do anythin if there is a negative sign
    # positive value is changed to false. all other cases, return
    if i<len(s):
        if ord('0')<=ord(s[i])<=ord('9'):
            InputValueString += s[i]
        elif s[i]=="-": # else if as elif
            PositiveNumber = False # if negative then positive number set to false
        elif s[i]=="+":# else if as elif
            pass
        else:
            return 0
    
    # increment i by 1 that is move ahead one step of the first character after white spaces
    i+=1

    # now run a loop till the end of the string
    while i<len(s):
        # if char is a number add to string input
        if ord('0')<=ord(s[i])<=ord('9'):
            InputValueString += s[i]
        # else, break the loop
        else:
            break
        i+=1
    
    # if the resulting string is empty, return 0
    if len(InputValueString)==0:
        return 0
    # else check InputValueString
    else:
        # if it's true, return minimum of int(InputValueString) and 2**31-1
        if PositiveNumber:
            return min(int(InputValueString),2**31-1)
        # else, return max of -1*int(InputValueString) and -2**31-1
        return max(-1*int(InputValueString), -2**31)


# main portion of the program where the actual conversions and the
# outputs will be handled

# the imputs from the user assigned to the value s
# for each of the consecutive read ins assign the string to s 
# parse through and read to the end of the string and convert to
# string in and then display the corresponding output 
# with the print(myAtoi(s))

print("#========================================================#\n",
       "# Author - Ethan Coyle                                  #\n",
       "# Instructor- Dr. Saikat                                #\n",
       "# Class     - Contemp. Prog Java/Python                 #\n",
       "# Course    - CMPS 4143                                 #\n",
       "# Assignment- Problem 3                                 #\n",
       "#=======================================================#\n")

try:
    s="42"
    myAtoi(s) # try the function
except:
    # if invalid, then error message
    print('Cannot convert string to an integer!')

print('Input1:    "',s,'"',"\t\t\t\t",'OutPut1:    "',myAtoi(s),'"\n') # print out the result of the string read

# reading in the next string
try:
    s=  "+45"
    myAtoi(s) # try the function
except:
    # if invalid, then error message
    print('Cannot convert string to an integer!')

print('Input2:    "',s,'"',"\t\t\t\t",'OutPut2:    "',myAtoi(s),'"\n') # print out the result of the string read

# read in the next string
try:
    s= "        -42"
    myAtoi(s) # try the function
except:
    # if invalid, then error message
    print('Cannot convert string to an integer!')

print('Input3:    "',s,'"',"\t\t\t",'OutPut3:    "',myAtoi(s),'"\n') # print out the result of the string read

# read in the string
try:

    s= "4193    with words"   
    myAtoi(s) # try the function
except:
    # if invalid, then error message
    print('Cannot convert string to an integer!')
print('Input4:    "',s,'"',"\t\t",'OutPut4:    "',myAtoi(s),'"\n') # print out the result of the string read

# read in the string 
try:
    s= "Words with 4856"
    myAtoi(s) # try the function
except:
    # if invalid, then error message
    print('Cannot convert string to an integer!')
print('Input5:    "',s,'"',"\t\t\t",'OutPut5:    "',myAtoi(s),'"\n') # print out the result of the string read

#next string read in
try:
    s= "-91283472332"
    myAtoi(s)
except:
    print("cannot convert string invalid")
print('Input6:    "',s,'"',"\t\t\t",'OutPut6:    "',myAtoi(s),'"\n') # print out the result of the string read

# reading in the last string
try:
    s=  "4294967296"
    myAtoi(s) # try the function
except:
    # if invalid, then error message
    print("invalid data cannot convert")
print('Input7:    "',s,'"',"\t\t\t",'OutPut7:    "',myAtoi(s),'"\n') # print out the result of the string read


# just for sanity sake, ask the user to input a value read in as a string
# and see the corresponding output
# ask the user for input string 

# prompt the user for the ammount of strings they would like to check
entry= int(input(" how many times would you like to try to enter a string value ?  "))
i=0 # create the counter incrementer starting with 0

# while loop to loop while is less than then ammount of times
while i< entry:

    # try processing the string through myatoi function and if not proper, will output an error message
    try:
        s = str(input("Please enter a string of values\n"))
        myAtoi(s) # try the function
    except:
    # if invalid, then error message
        print("invalid data unable to process") # if invalid process a error message

    # if works, then print out the result
    print('Input8:    "',s,'"',"\t\t\t\t\t",'OutPut8:    "',myAtoi(s),'"\n') # print out the result of the string read
    
    i+=1# increment the counter to process the ammount the user wants to try
# end of the program
