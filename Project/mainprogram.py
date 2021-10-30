#==========================================================================#
#                                                                          #
#  Authors    - Ethan Coyle and Jonathan Hogan                             #
#  Instructor - Dr. Saikat                                                 #
#  Class      - CMPS 4143 Contemporary Programming(Java/Python)            #
#  Assignment - Semester Project                                           #
#==========================================================================#
#  In this project, our proposal was to create a simulation using a lottery#
#    game in which the user is able to choose a randomly generated number  #
#    and compare it to the winning number utilizing a GUI. This simulation #
#    give the user a very efficient and visual representation as to how the#
#    lottery is played and how it works. Our Proposal to create this       #
#    program turned out to be very successful and create a working GUI in  #
#    which the user can streract with the GUI and the buttons and labels   #
#    and see how they can choose ( such as a quick pick ) when one goes    #
#    to a convenience store and choose a computer generated number and then#
#    they are able to compare thier number with the winning number to see  #
#    if they won. This also shows the user just how complex it can be abd  #
#    the odds of all six numbers matching up is astronomically low to get  #
#    all the same numbers. with each of the regular balls having random    #
#    numbers ranging from 1-70 and the multiplier ball being from 1-25     #
#    makes the chances of hitting the JackPot almost close to NULL         #
#==========================================================================#

# first create our imports tkstrer and random
import tkinter as tk
from tkinter import Button
import random # importing the random for rand number generator



# define how the lottery drawing ball will be utilized,
# create the defstrion and what each ball will be doing
def LotteryBallDrawing():
    
  # for the multiplier, and the other drawing number, we are going to utilize
  # the random number generator that will generate the numbers
    
    #simulating the mega millions, the five balls
    # will be utilizing a random number 1-70
    repeat = False
    
  # for the multiplier, and the other drawing number, we are going to utilize
  # the random number generator that will generate the numbers
    
    #simulating the mega millions, the five balls
    # will be utilizing a random number 1-70
    FirstNumber.configure(text=str(random.randint(1,70)))
   
   # check number two with the first make sure not repeat number
    SecondNumber.configure(text=str(random.randint(1,70)))
    if SecondNumber == FirstNumber:
        repeat = True
    # if it is, loop until is a non repeated number
    while repeat:
        SecondNumber.configure(text=str(random.randint(1,70)))
        if SecondNumber != FirstNumber:
            repeat = False

    
    # validatins and creating numb three error check to make sure not
    # matches againt other prvious values
    ThirdNumber.configure(text=str(random.randint(1,70)))
    if ThirdNumber == FirstNumber or ThirdNumber==SecondNumber:
        repeat = True
    
    while repeat:
        ThirdNumber.configure(text=str(random.randint(1,70)))
        if ThirdNumber != FirstNumber and ThirdNumber!=FirstNumber:
            repeat = False

    
    #creating the fourth number
    # for error checking check that doesnt match any of the others
    FourthNumber.configure(text=str(random.randint(1,70)))
    if (FourthNumber==ThirdNumber or FourthNumber==SecondNumber or FourthNumber==FirstNumber):
        repeat = True
    while repeat:
        FourthNumber.configure(text=str(random.randint(1,70)))
        if (FourthNumber != FirstNumber and ThirdNumber!=SecondNumber
             and FourthNumber!=FirstNumber):

            repeat = False

    #fifth number and error check to make sure no repeats
    FifthNumber.configure(text=str(random.randint(1,70)))
    if (FifthNumber==FourthNumber or FifthNumber==ThirdNumber
               or FifthNumber==SecondNumber or FifthNumber==FirstNumber):

        repeat = True
    while repeat:
        FifthNumber.configure(text=str(random.randint(1,70)))
        if (FifthNumber!=FourthNumber and FifthNumber!= ThirdNumber 
            and FifthNumber!=SecondNumber and FifthNumber!=FirstNumber):
            repeat = False
    
  
    # multiplier needs no checking against others because stand alone
    # simulating the megamilions, the mega ball will be random drawing from 1-25 
    MultiplierNumber.configure(text=str(random.randint(1,25)))

# create the definition of the the drawing reset to generate more numbers
# in the definition all the generated values will be reset and replaced to
#  a default value of 0 until the next set is generated
def ResetDrawing():
  FirstNumber.configure(text='0')
  SecondNumber.configure(text='0')
  ThirdNumber.configure(text='0')
  FourthNumber.configure(text='0')
  FifthNumber.configure(text='0')
  MultiplierNumber.configure(text='MultiPlier')
# hello there :) lol
# Hell   here :)



# create the basis for the winning number that will be utilized whenever comparing to winning number
def Winning_Number():
    #numbers = []
    repeat = False
    
  # for the multiplier, and the other drawing number, we are going to utilize
  # the random number generator that will generate the numbers
    
    #simulating the mega millions, the five balls
    # will be utilizing a random number 1-70

    # number one need no error checking because is the first number
    NumberOne.configure(text=str(random.randint(1,70)))
    
    # number two created and need to be checked againt one to get
    # non repeat
    NumberTwo.configure(text=str(random.randint(1,70)))
    if NumberTwo == NumberOne:
        repeat = True
    #loop until the number two is not the same number as num one
    while repeat:
        NumberTwo.configure(text=str(random.randint(1,70)))
        if NumberTwo != NumberOne:
            repeat = False

    # create the third num then error check to get non
    # repeated value
    NumberThree.configure(text=str(random.randint(1,70)))
    if NumberThree == NumberOne or NumberThree==NumberTwo:
        repeat = True
    
    # loop until there is not a repeat
    while repeat:
        NumberThree.configure(text=str(random.randint(1,70)))
        if NumberThree != NumberOne and NumberThree!=NumberOne:
            repeat = False
    # create number four and check if is repeat value
    NumberFour.configure(text=str(random.randint(1,70)))
    if NumberFour==NumberThree or NumberFour==NumberTwo or NumberFour==NumberOne:
        repeat = True
    # if it is, loop until non repeat found
    while repeat:
        NumberFour.configure(text=str(random.randint(1,70)))
        if (NumberFour != NumberOne and NumberThree!=NumberTwo and NumberFour!=NumberOne):
            repeat = False
    # create number five for display in the label
    # error check to make sure it doesnt display a number already picked
    NumberFive.configure(text=str(random.randint(1,70)))
    if (NumberFive==NumberFour or NumberFive==NumberThree or
     NumberFive==NumberTwo or NumberFive==NumberOne):

        repeat = True
    while repeat:
        NumberFive.configure(text=str(random.randint(1,70)))
        if (NumberFive!=NumberFour and NumberFive!= NumberThree and 
        NumberFive!=NumberTwo and NumberFive!=NumberOne):
        
            repeat = False
    #numbers.append(NumberFive)

    # simulating the megamilions, the mega ball will be random drawing from 1-25 
    #multiplier number doesnt need error checking is a stand alone value
    MultiplyNumber.configure(text=str(random.randint(1,25)))

# create the definition of the the drawing reset to generate more numbers
# in the definition all the generated values will be reset and replaced to a default value of 0 until the next set is generated


# Winning Number Generator For Max Prize
def ResetWinningNumbers():
    
    # resetting the values back to default Values 
    NumberOne.configure(text='0')
    NumberTwo.configure(text='0')
    NumberThree.configure(text='0')
    NumberFour.configure(text='0')
    NumberFive.configure(text='0')
    MultiplyNumber.configure(text='M')


# creating the window for the program to open up in a GUI
LotterySimulation = tk.Tk()

LotterySimulation.title(' Ethan Coyle and Jonathan Hogan Lottery Simulation')
LotterySimulation.geometry('750x275')
LotterySimulation.config(bg='Silver')


# create a link to the drawing random number lottery generator to draw five rand
# numbers and a multiplier number and display inside of the number boxes
numberGen = Button(LotterySimulation, width=20, height=1, text='Draw a Random Number', command=LotteryBallDrawing)
#configure the color schematics of the widget using .configure
numberGen.configure(fg = 'Black' ,bg = 'Cyan')
numberGen.pack(side=tk.TOP, anchor=tk.NW)

# create the reset button to reset all the generated numbers in the players drawing 
# back to their original default values
reset = Button(LotterySimulation, width=20, height=1,text=' Reset The Drawing', command =ResetDrawing)
reset.configure(fg = 'Black' ,bg = 'Cyan')
reset.pack(side=tk.TOP, anchor=tk.NW)

# create the bottom to display the winning lottery number and then go to the function definition to prstr out the winning number
WinningLotteryNum = Button(LotterySimulation, width=20, height=1, text='Show Winning Number', command=Winning_Number)

#configure the color schematics of the widget using .configure
WinningLotteryNum.configure(fg = 'Black' ,bg = 'Gold')
WinningLotteryNum.pack(side=tk.TOP, anchor=tk.NW)


# resetting the winning lottery number button go to action
ResetWinningNumber = Button(LotterySimulation, width=20, height=1,text=' Reset Winning Number', command =ResetWinningNumbers)
ResetWinningNumber.configure(fg = 'Black' ,bg = 'Gold')
ResetWinningNumber.pack(side=tk.TOP, anchor=tk.NW)

# we are setting up the basis for our own lottery number GeneratorExit
# in this we are utlizing the definition call function to Generate
# our numbers and then also resetting whenever we want to utilize a different number using
# we use the .place to place the labels situated with the generator either the 
# winning number or our number 


# second number positioned in the left
FirstNumber = tk.Label(LotterySimulation, text='1', bg='white', fg='black',relief='raised', width = 5, bd=5)
FirstNumber.place(x=270, y= 30)

# second number with position in the left
SecondNumber = tk.Label(LotterySimulation, text='2', bg='white', fg='black',relief='raised', width = 5, bd=5)
SecondNumber.place(x=340, y= 30)

# contents for the third number position in the middle
ThirdNumber = tk.Label(LotterySimulation, text='3', bg='white', fg='black',relief='raised', width = 5, bd=5)
ThirdNumber.place(x=410, y= 30)

# contents for the fourth number
FourthNumber = tk.Label(LotterySimulation, text='4', bg='white', fg='black',relief='raised', width = 5, bd=5)
FourthNumber.place(x=480, y= 30)

# contents for the fifth number
FifthNumber = tk.Label(LotterySimulation, text='5', bg='white', fg='black',relief='raised', width = 5, bd=5,)
FifthNumber.place(x=550, y= 30)

# set the mulitplier number to be gold and then the text to be black
# the multiplier number will hold the 6th number or the multi
# number similar to in lottery 
MultiplierNumber = tk.Label(LotterySimulation, text='MP', bg='gold', fg='black',relief='raised', width = 8, bd=8)
MultiplierNumber.place(x=620, y= 30)



# this below will be our display for the winning lottery number Generator
# this is styled almost the exact same way as the number lotto generator above but 
# this will have its own function definition as well as placement and control 
# through the winning number generator

NumberOne = tk.Label(LotterySimulation, text='1', bg='Gold', fg='black',relief='raised', width = 5, bd=5)
NumberOne.place(x=270, y=90)

# second number with position in the left
NumberTwo = tk.Label(LotterySimulation, text='2', bg='Gold', fg='black',relief='raised', width = 5, bd=5)
NumberTwo.place(x=340, y=90)

# contents for the third number position in the middle
NumberThree = tk.Label(LotterySimulation, text='3', bg='Gold', fg='black',relief='raised', width = 5, bd=5)
NumberThree.place(x=410, y=90)

# contents for the fourth number
NumberFour = tk.Label(LotterySimulation, text='4', bg='Gold', fg='black',relief='raised', width = 5, bd=5)
NumberFour.place(x=480, y=90)

# contents for the fifth number
NumberFive = tk.Label(LotterySimulation, text='5', bg='Gold', fg='black',relief='raised', width = 5, bd=5,)
NumberFive.place(x=550, y= 90)

# set the mulitplier number to be gold and then the text to be black
# the multiplier number will hold the 6th number or the multi
# number similar to in lottery 
MultiplyNumber = tk.Label(LotterySimulation, text='MP', bg='gold', fg='black',relief='raised', width = 8, bd=8)
MultiplyNumber.place(x=620, y= 90)# this good position

LotterySimulation.mainloop()# displaying the window for lottery aka main loop until exit