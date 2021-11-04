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
# Bank Account is the parent class and the children are checking and savings
# these two children show multiple inheritance
import os
# creating instance of the child class

class BankAccount:
     
    def __init__(self, CustomerName="",CkBalance=0.00,SvBalance=0.00):
         self.Checkbalance = CkBalance
         self.SavingsBalance=SvBalance
         self.CustName = CustomerName

    def depositChecking(self, amount):
         self.Checkbalance = self.Checkbalance + amount 
    def depositSavings(self, amount):
         self.SavingsBalance = self.SavingsBalance + amount
    def WithDrawChecking(self, amount):
        self.Checkbalance=self.Checkbalance-amount
    def WithDrawSavings(self, amount):
        self.SavingsBalance=self.SavingsBalance-amount
         
# class holding the checking account balance
class CheckingAccount(BankAccount):
    def __init__(self, name, CheckingBalance):
      super().__init__(name, CheckingBalance)
    def depositChecking(self, amount):
         BankAccount.depositChecking(self, amount)
         print("we here now")
    def WithDrawChecking(self, amount):
        BankAccount.WithDrawChecking(self,amount)
    
# class holding the savings balance       
class SavingsAccount(BankAccount):
    def __init__(self, name,Checking, SavingBalance):
      super().__init__(name,Checking, SavingBalance)
    def depositSavings(self, amount):
         BankAccount.depositSavings(self, amount)
         print("we here now")
    def WithSavings(self, amount):
        BankAccount.WithDrawSavings(self,amount)
    


print("""
            [1] -- Create Account
            [2] -- Make Deposit
            [3] -- Make Withdrawl
            [4] -- Display Info
            [Q] -- Quit Bank Simulation
    
            """)
# create a loop to loop until the user presses q to quit

#create instance of checking account deposit and withdraw
# person that only has checking account can only depoist or withdraw from account

person = CheckingAccount("Frodo Baggins",200)
person.depositChecking(50)
person.WithDrawChecking(5)
print(person.CustName,  
      person.Checkbalance)

#create instance of checking account deposit and withdraw
# person that only has checking account can only depoist or withdraw from account

person2 = SavingsAccount("Bilbo Baggins ",2000,9000)
person2.depositSavings(1200)
person2.WithDrawSavings(5000)
print(person2.CustName,  
      person.SavingsBalance)

keep_going = True
while keep_going:

    # prompt the user what they would like to do
    userInput = str(input('Please Select One of the Following, or type the letter Q to exit '))
    
    
    if userInput == '1':
        name=str(input("please enter the customer name:  "))
        CheckingBalance= float(input("please enter the checking account starting balance: "))
        SavBalance= float(input("please enter the saving account starting balance: "))
        a = BankAccount(name,CheckingBalance,SavBalance)

    if userInput == '2':
        AcctType = input('What account to deposit to? Enter Savings of Checking ' )
        deposit_amount = float(input('How Much Would You Like to Deposit? ' ))
    
        if AcctType=='Savings':
            a.depositSavings(deposit_amount)
    
        if AcctType=='Checking':
            a.depositChecking(deposit_amount)

    if userInput=='3':

        account_type = str(input('What account To Withdraw From? Enter Savings of Checking ' ))
        
        if account_type=='Savings':
            withdrawl_ammount = float(input('How Much Would ifYou Like to Withdraw? ' ))
            a.WithDrawSavings(withdrawl_ammount)
        if account_type=='Checking':
            if CheckingBalance<withdrawl_ammount:
                print("Balance is too low cannot withdraw that much!!!")
            else:
                withdrawl_ammount = float(input('How Much Would ifYou Like to Withdraw? ' ))
                a.WithDrawChecking(withdrawl_ammount)

    if userInput=='4':
        print("\r\n\nCustomer Name            : ", a.CustName)
        print("\rChecking Account Balance : $",a.Checkbalance)
        print("\rSavings  Account Balance : $", a.SavingsBalance)
    
    if userInput == 'Q':
        keep_going = False # close out of the program


#print(CheckingAccount.depositChecking(5))
os._exit(0)