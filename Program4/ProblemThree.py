#========================================================================#
#                                                                        #
# Author - Ethan Coyle                                                   #
# Inst.  - Dr. Saikat                                                    #
# Class  - CMPS 4143(Java/Python)                                        #
# Assin  - Program 4 Problem Three                                       #
#                                                                        #
# About-                                                                 #
#. (30 points) Write the OOP program in python using class. Assuming you #
# have four classes: Bank account which is the parent class and it hastwo#
#  child classes Saving Account class and Checking account class. Custome#
#  is another class who has a bank account; either saving or checking    #
#  both. Implement the scenario using python OOP and make sure you have  #
#  covered those OOP concepts on your code: inheritance(any),            #
# polymorphism (runtime and compile time), abstraction and encapsulation.#
#========================================================================#

class Account:
     
    def __init__(self, CustomerName,CkBalance=0.00,SvBalance=0.00):
         self.Checkbalance = CkBalance
         self.SavingsBalance=SvBalance
         self.CustName = CustomerName

    def depositChecking(self, amount):
         self.Checkbalance = self.Checkbalance + amount 
    def depositSavings(self, amount):
         self.SavingsBalance = self.SavingsBalance + amount

    def WithDrawChecking(self, amount):
        self.SavingsBalance=self.SavingsBalance-amount
    def WithDrawSavings(self, amount):
        self.Checkbalance=self.Checkbalance-amount
         
# class holding the checking account balance
class CheckingAccount(Account):
    def __init__(self, CustomerName):
         Account.__init__(self, CustomerName)
    def depositChecking(self, amount):
         Account.depositChecking(self, amount)
         print("we here now")
    def WithDrawChecking(self, amount):
        Account.WithDrawChecking(self,amount)
    
# class holding the savings balance       
class SavingsAccount(Account):
    def __init__(self, CustomerName):
         Account.__init__(self, CustomerName)
    def depositSavings(self, amount):
         Account.depositSavings(self, amount)
    def WithDrawSavings(self, amount):
         Account.WithDrawSavings(self, amount)
    


print("""
            [1] -- Create Account
            [2] -- Make Deposit
            [3] -- Make Withdrawl
            [4] -- Display Info
    
            """)

answer='yes'
while answer !='no':
    answer=str(input("woul you like to continue enter yes or no?"))
    print(" What would you like to do? Please Enter a number\n")
    userInput=str(input("Please select an option : 1-5"))

    if userInput == '1':
        name=str(input("please enter the customer name:  "))
        CheckingBalance= float(input("please enter the checking account starting balance: "))
        SavBalance= float(input("please enter the saving account starting balance: "))
        a = Account(name,CheckingBalance,SavBalance)

    if userInput == '2':
        account_type = input('What account? Enter Savings of Checking ' )
        deposit_amount = float(input('How Much Would You Like to Deposit? ' ))
    
        if account_type=='Savings':
            a.depositSavings(deposit_amount)
    
        if account_type=='Checking':
            a.depositChecking(deposit_amount)

    if userInput=='3':

        account_type = input('What account? Enter Savings of Checking ' )
        withdrawl_ammount = float(input('How Much Would ifYou Like to Withdraw? ' ))
        if account_type=='Savings':
            a.WithDrawSavings(withdrawl_ammount)
        if account_type=='Checking':
            if CheckingBalance<withdrawl_ammount:
                print("Balance is too low cannot withdraw that much!!!")
            else:
                a.WithDrawChecking(withdrawl_ammount)

    if userInput=='4':
        print(" Customer Name   Checking Balance   Savings Balance")
        print("===================================================\n")
        print("Name : ", a.CustName,"\nChecking Account Balance : $",a.Checkbalance,
                "\nSavings Balance  : $", a.SavingsBalance)
    

print(CheckingAccount.depositChecking(5))
