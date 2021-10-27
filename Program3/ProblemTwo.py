#==========================================================================#
# Author - Ethan Coyle                                                     #
# Class  - CMPS 4143 Contemp. Prog(Java/Python)                            #
# Tacher - Dr. Saikat                                                      #
# Assign-  Program 3 Problem 2                                             #
############################################################################
# Program Guidelines-                                                      #
# Write a program where it asks to enter the number of people, then based  #
#  on this number iterate that amount of time where each time get single   #
# person’s information like First Name, Last Name, Age, Occupation and     #
# Address. Make sure you validate all users’ input. Included but not       #
# limited to like age cannot be a non-numeric value should be between 0-150#
# , name can only be non-numeric. Think about how you can validate the     #
# occupation and address field. Finally show (print) user details one byone#
#  For your input validation, make sure you can’t proceed next step/value  #
# without inserting valid input on current phase.                          #
#                                                                          #
#==========================================================================#
 
# initialize the counter variable to 0
i=0
# prompt the user to input the ammount of people they would like to add
entry=int(input("How many people would you like to add?"))
while i<entry:# while i is less than the ammount the user wants to input
    

    # now for the basis of the individuals
    
    while(True):
        try:
            FirstName=str(input("What is the persons first name?"))# user prompt
        except:
            raise ValueError('FirstName  is not valid')
        if FirstName.isnumeric(): #check if the name is entered as a number
            ErrorWarning= ValueError("Invalid input, insert correct First Name using non numeric values")
            print(ErrorWarning)
            
        else: #else if the occupation is correct
            break
        
    while(True):
        try:
            LastName=str(input("What is the persons last  name?"))# user prompt
        except:
            raise ValueError('Last Name  is not valid')
        if LastName.isnumeric(): #chek if occupation contains only numeric value or not
            ErrorWarning= ValueError("Invalid input, insert correct Last Name using non numeric values")
            print(ErrorWarning)
        else: #else if the occupation is correct
            break
    

    # start try catch block that will catch invalid data  whcih consists of nums between 0 and 150
    
    while True:
        # first check to see if the entry is numeric or not
        try:
            print(" enter the age of the person\n")
            Age=input()
        except ValueError:
            raise ValueError('Age Entered Was Not Valid')
        if not Age.isnumeric():
            Message=ValueError("age must be numeric")
            print(Message)
            # loop back again till a numeric value is acchieved
            continue
        # if the age that is reenter is numeric, then check to see if the number is between the
        # two specified values then go to next try except block
        try:
            Age= int(Age)
        except ValueError:
           raise ValueError('Thats not a valid age. Get real Bonehead!!!')
        
        if Age > 150 or Age<0:# age must be between 0 and 150 anything else is error
            ErrorMessage = ValueError('Age Must Be less that 150 and larger than 0.')
            print(ErrorMessage)
        else:
            break # once the input is valid, break through the while loop

    # try catch to read in valid non numeric occupation
    while(True):
        try:
            Occupation= str(input("What is their occupation?"))# prompt the user
        except:
            raise ValueError('Occupation is not valid')# if invalid say invalid
        if Occupation.isnumeric(): #chek if occupation contains only numeric value or not
            ErrorWarning= ValueError("Invalid input, insert correct occupation using non numeric values")
            print(ErrorWarning)# printing the error warning
        else: #else if the occupation is correct
            break
    
    # try catch me to get valid address
    while(True):
        try:
            Address=str(input(" the address of the person?"))
        except:
            raise ValueError('address  is not valid')
        if Address.isnumeric(): #chek if address contains only numeric value or not
            ErrorWarning= ValueError("address was invalid")
            print(ErrorWarning)
        else: #else if the occupation is correct
            break

    while(True):
        try:
            City=str(input("What is the persons City name?( enter like Wichita Falls"))# user prompt
        except:
            raise ValueError('City  is not valid')
        if City.isnumeric(): #check if the name is entered as a number
            ErrorWarning= ValueError("Invalid input, insert correct City using non numeric values")
            print(ErrorWarning)
            
        else: #else if the occupation is correct
            break
    while(True):# prompting for the state 
        try:
            State=str(input("What is the persons City name?( enter like Wichita Falls "))# user prompt
        except:
            raise ValueError('State  is not valid ( enter like " TX or Texas ') # error not correct format
        if State.isnumeric(): #check if the name is entered as a number
            ErrorWarning= ValueError("Invalid input, insert correct State using non numeric values")
            print(ErrorWarning)

        # loop back until value is correct
        else: #else if the occupation is correct
            break
    
    while True:# prompt for the zip code 
        # first check to see if the entry is numeric or not
            try:
                print(" What is the Zip Code of the person?  ") # prompt for zip
                ZipCode=input() # check the input
            except ValueError:
                raise ValueError('Zip Code  not valid must be five digits ')
            if not ZipCode.isnumeric(): # if the zip not numbers
                Message=ValueError("The Zip Code must be numeric")
                print(Message)
            # throw the error and 
            # loop back again till a numeric value is acchieved
                continue
        # if the age that is reenter is numeric, then check to see if the number is between the
        # two specified values then go to next try except bl
        
            if len(ZipCode)<5:# age must be between 0 and 150 anything else is error
                ErrorMessage = ValueError('Zip Must Be five digits i.e. 76308.')
                print(ErrorMessage)
            elif len(ZipCode)>5:# age must be between 0 and 150 anything else is error
                ErrorMessage = ValueError('Zip Must Be five digits i.e. 76308.')
                print(ErrorMessage)
            else:
                break # once the input is valid, break through the while loop

    # format the output for each individual person to be this  formatted
    print(FirstName, LastName, " aged", Age," years, worked as a\n ",Occupation,
             " and currently lives at ",Address, "", City, "," ,State, " ", ZipCode,".\n")
    i+=1# increment the ocunter variable go back to loop begining until satisfied
# end of the program exitting out