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
        try:
            Age= int((input(" Enter the person Age(must be less than 150).  ")))
        except ValueError:
           raise ValueError('Age Entered Was Not Valid')
        if Age > 100 or Age<0:
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
            Address=str(input(" What is this persons Address?"))
        except:
            raise ValueError('address  is not valid')
        if Address.isnumeric(): #chek if address contains only numeric value or not
            ErrorWarning= ValueError("address was invalid")
            print(ErrorWarning)
        else: #else if the occupation is correct
            break

    # format the output for each individual person to be this  formatted
    print(FirstName, LastName, "aged", Age,"years, worked as a ",Occupation,
             " and currently lives at ",Address,".\n")
i+=1# increment the ocunter variable





