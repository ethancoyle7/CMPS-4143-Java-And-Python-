def myAtoi(s):
    # declare a variable to check the number is positive or negative
    isPositive = True

    # storing the string into in string
    int_string = ""
    
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
    # 1) is a number -> add it to the int_string
    # 2) is "+" -> do nothing
    # 3) is "-" -> chnage isPositive to False
    # 4) else return 0
    if i<len(s):
        if ord('0')<=ord(s[i])<=ord('9'):
            int_string += s[i]
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
        # if the current character is a number, add it to int_string
        if ord('0')<=ord(s[i])<=ord('9'):
            int_string += s[i]
        # else, break the loop
        else:
            break
        i+=1
    
    # if the resulting string is empty, return 0
    if len(int_string)==0:
        return 0
    # else check int_string
    else:
        # if it's true, return minimum of int(int_string) and 2**31-1
        if isPositive:
            return min(int(int_string),2**31-1)
        # else, return max of -1*int(int_string) and -2**31-1
        return max(-1*int(int_string), -2**31)


# main portion of the program where the actual conversions and the
# outputs will be handled

# the imputs from the user assigned to the value s
# for each of the consecutive read ins assign the string to s 
# parse through and read to the end of the string and convert to
# string in and then display the corresponding output 
# with the print(myAtoi(s))
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
