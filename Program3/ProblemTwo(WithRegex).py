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
 

# to use regex, we need to import re
import re
# initialize the counter variable to 0

# prompt the user to input the ammount of people they would like to add
entry=int(input("How many people would you like to add?"))
for i in range(entry):
    

    # now for the basis of the individuals
    
    while(True):
        try:
            FirstName=str(input("What is the persons first name?  "))# user prompt
        except:
            raise ValueError(ErrorWarning)

        if not re.match("^[A-Za-z]*$", FirstName):
            ErrorWarning= ValueError("Invalid input, insert correct Last Name using non numeric values")
            print(ErrorWarning)
            
            
        else: #else if the occupation is correct
            break
        
    while(True):
        try:
            LastName=str(input("What is the persons last  name?   "))# user prompt
        except:
            raise ValueError('Last Name  is not valid')
        if not re.match("^[A-Za-z]*$", LastName):
            ErrorWarning= ValueError("Invalid input, insert correct Last Name using non numeric values")
            print(ErrorWarning)
        else: #else if the occupation is correct
            break
    

    # start try catch block that will catch invalid data  whcih consists of nums between 0 and 150
    
    while True:
        # first check to see if the entry is numeric or not
        try:
            print(" enter the age of the person  ")
            Age=input()
        except ValueError:
            raise ValueError('Age Entered Was Not Valid')
        # use regex to test if the input is valid numbers
        if not re.match('^[0-9]*$', Age):
            Message=ValueError("Not numeric age try again bonehead")
            print(Message)
            # loop back again till a numeric value is acchieved
            continue
        # if the age that is reenter is numeric, then check to see if the number is between the
        # two specified values then go to next try except block
        try:
            Age= int(Age)# convert to string and try except for valid input
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
            Occupation= str(input("What is their occupation?   "))# prompt the user
        except:
            raise ValueError('Occupation is not valid')# if invalid say invalid
        # using regex to check if it is not alpha character and only numbers or other characters
        if not re.match("^[A-Za-z]*$", Occupation):
            ErrorWarning= ValueError("Occupation must be non numeric values, Try again")
            print(ErrorWarning)
        else: #else if the occupation is correct
            break
    
    # prompt the user for street number and check using regex 
    while(True):
        try:
            StreetNumber=str(input("Whats  the street number of the address? (enter like(1233) : "))
        except:
            raise ValueError('Street Number is not valid')
        if not re.match('^[0-9]*$', StreetNumber): #chek if address contains only numeric value or not
            ErrorWarning= ValueError("Not Valid input ( put in like 1233) ")
            print(ErrorWarning)
        else: #else if the occupation is correct
            break
    # try catch me to get valid address
    while(True):
        try:
            Address=str(input("Whats the address of the person?   "))
        except:
            raise ValueError('address  is not valid')
        if not re.match("^[A-Za-z]*$", Address): #chek if address contains only numeric value or not
            ErrorWarning= ValueError("thats invalid")
            print(ErrorWarning)
        else: #else if the occupation is correct
            break

    while(True):
        try:
            City=str(input("What is the persons City name?( enter like Wichita Falls)   "))# user prompt
        except:
            raise ValueError('City  is not valid')
        # using regex, check to see the city is only letters and nothing else
        if not re.match("^[A-Za-z]*$", City):
            ErrorWarning= ValueError("City Must Be non-numeric. Please Try again")
            print(ErrorWarning)
            
        else: #else if the occupation is correct
            break
    while(True):# prompting for the state 
        try:
            State=str(input("What is the persons State name?( enter like Texas or TX)   "))# user prompt
        except:
            raise ValueError('State  is not valid ( enter like " TX or Texas ') # error not correct format
        # using regular expression to check for valid input
        if not re.match("^[A-Za-z]*$", State):
            ErrorWarning= ValueError("State must be non numeric and be like (TX or Texas) try again")
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
            # using regex, make sure zip code is only numbers and nothing else
            if not re.match('^[0-9]*$', ZipCode):
                Message=ValueError("The ZipCode entered was not valid. Try again with like(76305) ")
                print(Message)
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
    while(True):
        try:
            EmailAddress=str(input("Whats the  email address of the person?   "))
        except:
            raise ValueError(' email address  is not valid')
        if not re.match("(^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$)", EmailAddress): #chek if address contains only numeric value or not
            ErrorWarning= ValueError("thats invalid")
            print(ErrorWarning)
        else: #else if the occupation is correct
            break

        
   
    print(FirstName, LastName, " aged", Age," years, worked as a ",Occupation,
         " and currently lives at ",StreetNumber, "",Address, "", City, "," ,State, " ", ZipCode,"." ,"Email Address is : ",EmailAddress)
    i+=1
   
# end of the program exitting out