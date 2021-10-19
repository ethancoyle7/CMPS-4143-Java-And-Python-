def myAtoi(s):
    # declare a variable to check the number is positive or negative
    isPositive = True

    # we will store the new string in int_string that will be converted into an int
    int_string = ""
    
    # if the input string is empty, return 0
    if len(s)==0:
        return 0
    i=0
    
    # ignore all the whitespaces
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


# main function
# change it as you want
s = "42"
print('Input: "', end="")
print(s, end="")
print('"')
print(myAtoi(s))

s = "             -98"
print('Input: "', end="")
print(s, end="")
print('"')
print(myAtoi(s))