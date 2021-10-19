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




def myAtoi(s):
    # declare a variable to check the number is positive or negative
    isPositive = True

    # storing the string into in string
    StringInput = ""
    
    # if there nothing in the string return nothing
    if len(s)==0:
        return 0
    i=0
    
    # we need to ignor all the white spaces in the string read in
    while i<len(s):
        if s[i]!=" ":
            break
        i+=1

    # if the first character after whitespaces:
    # 1) is a number -> add it to the StringInput
    # 2) is "+" -> do nothing
    # 3) is "-" -> chnage isPositive to False
    # 4) else return 0
    if i<len(s):
        if ord('0')<=ord(s[i])<=ord('9'):
            StringInput += s[i]
        elif s[i]=="-":
            isPositive = False
        elif s[i]=="+":
            pass
        else:
            return 0
    
    # increment i by 1 that is move ahead one step of the first character after white spaces
    i+=1

    # now run a loop till the end of the string
    while i<len(s):
        # if the current character is a number, add it to StringInput
        if ord('0')<=ord(s[i])<=ord('9'):
            StringInput += s[i]
        # else, break the loop
        else:
            break
        i+=1
    
    # if the resulting string is empty, return 0
    if len(StringInput)==0:
        return 0
    # else check StringInput
    else:
        # if it's true, return minimum of int(StringInput) and 2**31-1
        if isPositive:
            return min(int(StringInput),2**31-1)
        # else, return max of -1*int(StringInput) and -2**31-1
        return max(-1*int(StringInput), -2**31)


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


s="42"
print('Input1:    "',s,'"',"\t\t\t\t\t\t",'OutPut1:    "',myAtoi(s),'"\n') # print out the result of the string read

# reading in the next string
s=  "+45"
print('Input2:    "',s,'"',"\t\t\t\t\t\t",'OutPut2:    "',myAtoi(s),'"\n') # print out the result of the string read

# read in the next string
s= "        -42"
print('Input3:    "',s,'"',"\t\t\t\t",'OutPut3:    "',myAtoi(s),'"\n') # print out the result of the string read

# read in the string
s= "4193    with words"
print('Input4:    "',s,'"',"\t\t",'OutPut4:    "',myAtoi(s),'"\n') # print out the result of the string read

# read in the string 
s= "Words with 4856"
print('Input5:    "',s,'"',"\t\t\t",'OutPut5:    "',myAtoi(s),'"\n') # print out the result of the string read

#next string read in
s= "-91283472332"
print('Input6:    "',s,'"',"\t\t\t",'OutPut6:    "',myAtoi(s),'"\n') # print out the result of the string read

# reading in the last string
s=  "4294967296"
print('Input7:    "',s,'"',"\t\t\t\t",'OutPut7:    "',myAtoi(s),'"\n') # print out the result of the string read

# just for sanity sake, ask the user to input a value read in as a string
# and see the corresponding output

# ask the user for input string 
s = str(input("Please enter a string of values\n"))
print('Input8:    "',s,'"',"\t\t\t\t\t",'OutPut8:    "',myAtoi(s),'"\n') # print out the result of the string read

# end of the program
