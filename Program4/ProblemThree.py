#========================================================================#
#                                                                        #
# Author - Ethan Coyle                                                   #
# Inst.  - Dr. Saikat                                                    #
# Class  - CMPS 4143(Java/Python)                                        #
# Assin  - Program 4 Problem TThree                                      #
#                                                                        #
# About-                                                                 #
#. . (30 points) Write the OOP program in python using class. Assuming   #
# you have four classes: Bank account which is the parent class and it   #
# has two child classes Saving Account class and Checking account class. #
#  Customer is another class who has a bank account; either saving or    #
#  checking or both. Implement the scenario using python OOP and make    #
# sure you have covered those OOP concepts on your code: inheritance(any)#
# , polymorphism (runtime and compile time), abstraction and             #
# encapsulation.                                                         #
#========================================================================#

# First we create our parent class called bank account
class BankAccount:
    # first we define out constructor for the customer class
    # this will hold the person account number an balance
    def __init__(self, account_number, balance):
        # by using the self.underscore, we create the priveate 
        # variable and initialize them to the valures
        self.__account_number = account_number
        self.__balance = balance

    # our getter methods that will access the private data
    def get_account_number(self):
        return self.__account_number
    def get_balance(self):
        return self.__balance

    # create the setter variables to set the account_number and balance
    def set_account_number(self, account_number):
        self.__account_number = account_number
    def set_balance(self, balance):
        self.__balance = balance

    # deposit methos that will add to to the balance with the 
    # ammount specified
    def deposit(self, amount):
        self.__balance += amount
        # print out the depoist transcation
        print("Deposit of {} successful".format(amount))

    # withdraw methos that will check if there is enough to withdraw 
    # using the if statement we iterate through and print out one
    # of the two
    def withdraw(self, amount):
        # check if amount is greater than or equal to balance
        if self.__balance >= amount:
            self.__balance -= amount
            print("Withdrawal of {} successful".format(amount))
        # otherwise, print error message
        else:
            print("Insufficient funds")

    # our show_balance methos that will print the balance in the account
    def show_balance(self):
        print("Balance: {}".format(self.__balance))

    # we then create the function definition method that will we turn the
    # the formatted account information
    def __str__(self):
        return "Account Number: {}\nBalance: {}".format(self.__account_number, self.__balance)


# create first child class call savings account that will
# be derived and inherited from the parent class 
# bank account which is inside of the parameter field of the 
# class creation
class SavingsAccount(BankAccount):
    # we create our constructor that has it own private data field 
    # and we user the constuctor ffrom the super class that
    # hold the account number and the balance and this own 
    # will have its or parameter
    def __init__(self, account_number, balance, interest_rate):
        super().__init__(account_number, balance)
        self.__interest_rate = interest_rate

    # set up the get and set methods to initialize and access the 
    # interest rate which will be calle in the main function of 
    # our program and then return the update interest rate
    def get_interest_rate(self):
        return self.__interest_rate
    def set_interest_rate(self, interest_rate):
        self.__interest_rate = interest_rate

    # we create a method called calculate_interest(self)
    # inside of here, we will access the balance and make changes to it
    # by multiplying by the interest rate inside of the metho
    def calculate_interest(self):
        interest = self.get_balance() * self.__interest_rate
        print("Interest: {}".format(interest))

    # our return method will have all the contents includd in this 
    # class as well as deriving from the super(Bank Account class)
    # in essecnce, we will return the savings account data, the name and the account num
    # the name and the accout number are derived from inside of the bank account
    # class and access through here
    def __str__(self):
        return "Savings Account:\n" + super().__str__() + "\nInterest Rate: {}".format(self.__interest_rate)

# creation of the second child class which is calle Checking Account
# inside of this, we will be drawing from the constructor of the super class
# which is the bank account that holds the account number and balance
# then we define our of constructor will private memeber fee
class CheckingAccount(BankAccount):
    # create constructor
    def __init__(self, account_number, balance, fee):
        super().__init__(account_number, balance)
        self.__fee = fee
    # next, we must create our get and set methods to access and return tht value
    # create getter and setter methods for fee
    def get_fee(self):
        return self.__fee
    def set_fee(self, fee):
        self.__fee = fee

    #we then create a withdraw  method in which we derive the balance from the super
    # class where we access that and make changes to it
    def withdraw(self, amount):
        super().withdraw(amount)
        # subtract fee from the balance 
        self.set_balance(self.get_balance() - self.__fee)

    # return method that will return everything ffrom the super class
    # includeing the account number and the balance as well as the 
    # checking account information
    def __str__(self):
        return "Checking Account:\n" + super().__str__() + "\nFee: {}".format(self.__fee)


# We lastly, create our cutomer class which will be used in the creation of a 
# customer utilizing the bank account but the parameter is not place inside of here
class Customer:
    #  create the private sconstructor variable in which store the 
    # customeres information as well as their account information
    def __init__(self, name, address, phone_number, customer_id):
        self.__name = name
        self.__address = address
        self.__phone_number = phone_number
        self.__customer_id = customer_id
        self.__accounts = []

    # initialize the get and set methods to have access to setting 
    # and getting the necesary data that pertains to the customer
    def get_name(self):
        return self.__name
    def get_address(self):
        return self.__address
    def get_phone_number(self):
        return self.__phone_number
    def get_customer_id(self):
        return self.__customer_id

    # intilize the set methos to set the corresponding ata to the part
    # particular customer 
    def set_name(self, name):
        self.__name = name
    def set_address(self, address):
        self.__address = address
    def set_phone_number(self, phone_number):
        self.__phone_number = phone_number
    def set_customer_id(self, customer_id):
        self.__customer_id = customer_id


    # method to ad an account for the customer
    def add_account(self, account):
        self.__accounts.append(account)

    # get method for the customer that will access the 
    # account information for the customer and append it
    def get_account(self, account_number):
        for account in self.__accounts:
            if account.get_account_number() == account_number:
                return account
        # if nothing found return none
        return None

    # method to return the data for the accounts in the cutomer data classs
    def __str__(self):
        account_str = "\n"
        for account in self.__accounts:
            account_str += "\n----------------\n" + str(account) + "\n----------------\n"
        return "Name: {}\nAddress: {}\nPhone Number: {}\nCustomer ID: {}\n\nAccounts: {}".format(self.__name, self.__address, self.__phone_number, self.__customer_id, account_str)



def main():
    # create customer
    customer = Customer("Bilbo Baggins", "111 Hobbiton Lane",
                         "1-800-NoAdventures", "1")

    # create a SavingsAccount and  a CheckingAccount
    savings_account = SavingsAccount("10000", 1000000, 0.90)
    checking_account = CheckingAccount("20000", 50000, 12)

    # add accounts to customer
    customer.add_account(savings_account)
    customer.add_account(checking_account)

    # print customer
    print(customer)

    # now specify account to perform transaction with
# this particular one will be the savings account initialize upon
# cutomer creation of the accounts accessing the account number and making the
# necessary adjustments)
    print("\r first lets do some money stuff on the checking account\n")
    deposit= int(input("how much would you like to deposit     "))
    customer.get_account("10000").deposit(deposit)
    withdraw= int(input(" how much would you like to withdraw  "))
    customer.get_account("10000").withdraw(withdraw)

# now specify another account to perform transaction with
# this particular one will be the savings account initialize upon
# cutomer creation of the accounts accessing the account number and making the
# necessary adjustments
    print("\r Now lets do some moeny stuff on savings\n")
    Savingsdeposit= int(input("how much would you like to deposit     "))
    customer.get_account("20000").deposit(Savingsdeposit)
    SavingsWithdraw= int(input("how much would you like to withdraw     "))
    customer.get_account("20000").withdraw(SavingsWithdraw)
    print()
    # print customer again
    print(customer)
# call the main function to access main
if __name__ == "__main__":
    main()