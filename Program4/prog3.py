class Customer:
    def __init__(self,firstName, lastName):
        self.firstName = firstName 
        self.lastName = lastName 
        

    def setfirstName(self,firstName):
        self.firstName = firstName

    def setlastName(self,lastName):
        self.lastName = lastName

    def __str__(self):
        self.name = "{},{}".format(self.firstName, self.lastName)
        return self.name 


class BankAccount(Customer):
    def __init__(self,customer,balance = 0):
        super(BankAccount, self).__init__()
        self.customer = customer
        self.balance = balance

    def __init__(self,customer,balance = 0):
        self.customer = customer
        self.balance = balance 

    def setCustomer(self,customer):
        self.customer = customer
         
        

    def getCustomer(self,customer,accountNumber):
        return self.customer

    def deposit(self, amount):
        self.balance = self.balance + amount
        return self.balance

    def withdrawal(self, amount):
        self.balance = self.balance - amount
        return self.balance

    def __str__(self):
        customer = "{} , balance: ${}".format(self.customer,self.balance)
        return customer 

class CheckingAccount(BankAccount):
    def __init__(self, bankAccount):
        self.bankAccount = bankAccount



    def applyAnnualInterest(self):
        excess = self.balance - 10000
        if excess > 0:
            interest = (excess * .02)
            self.balance = self.balance + interest
            return self.balance
        else:
            return self.balance

def main():

    alin = Customer('Alin', 'Smith')
    print(alin)
    alinAccnt = CheckingAccount(alin)
    print(alinAccnt)

    # alinAccnt.deposit(20000)
    # print(alinAccnt)

main()
    