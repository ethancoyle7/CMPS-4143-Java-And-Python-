# please enter your expression 
expr = str(input("Please Enter and expression you would like to test : "))

# set the result as False initially
result = False

#Firsst we create a list for storing symbols inside of the 
# test string
symbols = []

# traverse each symbol in expression
for c in expr:
    
    # if symbol is not closing parenthesis
    # then add it to list
    if c in '(+-*/^':
        symbols.append(c)
    
    # if c is closing parenthesis then check for duplicates

    elif c==')':
        
        # if the current last symbol is '(' 
        # then the bracket is not required as there is no symbol in between
        if symbols[-1]=='(':
            # if there is a duplicate parenthesis, then the
            # evaluation of the loop is true
            # break out of the loop
            result = True
            break
        
        # otherwise remove all symbols until the last '('
        while(symbols[-1]!='('):
            # remove the last item from the list
            symbols.pop()
        
        # remove the '('
        symbols.pop()

# display the result
# true means there are duplicates
print("\r\n Your Expression that you entered was : ", expr)
print("\r\n The result of checking for duplicates: ",result)