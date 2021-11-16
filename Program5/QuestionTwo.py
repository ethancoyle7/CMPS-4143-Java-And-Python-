#========================================================================#
#                                                                        #
# Author - Ethan Coyle                                                   #
# Inst.  - Dr. Saikat                                                    #
# Class  - CMPS 4143(Java/Python)                                        #
# Assin  - Program 5 Problem Two                                         #
#                                                                        #
# About-                                                                 #
#    Given the expression as string [str] , find the duplicate           #
#    parenthesis from the expression. Your program will output whether   #
#    or not finding the duplicates, that is true or false                #
# Format style for program -                                             #
#       Input type: An expression in string; 	 	                     #
#       Output type: A boolean value True or False                       #
#========================================================================#

# set counter for the iteration
i=0

# prompt how many times would like to run test cases
TestingExpressions = int(input("How many times would you like to test? : "))

while i<TestingExpressions:# while i is less than the ammount the user wants to input
# set the DuplicateResult as False

    # enter the expression want to test
    UserInputExpression = str(input("Please Enter An expression : "))
    DuplicateResult = False

#Firsst we create a list for storing ExpressionSymbols inside of the 
# test string
    ExpressionSymbols = []

# traverse each symbol in expression
    for CharacterValue in UserInputExpression:
    
    # if symbol is not closing parenthesis
    # then add it to list
        if CharacterValue in '(+-*/^':
        # append the charavter value to expression symbols
            ExpressionSymbols.append(CharacterValue)
    
    # if CharacterValue is closing parenthesis,
    # check if it a duplicate

    # check the other case 
    # if the character value is a right hand parentesis value,
    # will test the cases of any outside ( ) matches and if there are 
    # is duplicates
        elif CharacterValue==')':
        
        # if the current last symbol is '(' 
        # then the bracket is not required as there is no symbol in between
            if ExpressionSymbols[-1]=='(':
            # if there is a duplicate parenthesis, then the
            # evaluation of the loop is true
                DuplicateResult = True
            # break out of the loop
                break
        
        # otherwise remove all ExpressionSymbols until the last '('
            while(ExpressionSymbols[-1]!='('):
            # remove the last item from the list of symbol
            # that looking at
                ExpressionSymbols.pop()
        
        #removing the parenthesis
            ExpressionSymbols.pop()

# display the DuplicateResult(True or False)
# If it is true, then there are duplicates, 
# if it is false, they are not duplicates
    print("\r\n=============================================================")
    print("Your Expression that you entered was : ", UserInputExpression)
    print("The DuplicateResult of checking for duplicates: ",DuplicateResult)
    print("=================================================================\n\n")

    i+=1# increment the counter