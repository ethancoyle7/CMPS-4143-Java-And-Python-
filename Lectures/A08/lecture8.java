
package A08;

//Ethan Coyle
// in class assignment using banking account ecpetions
//September 22, 2021
// The purpose of this program is to create
public class YouBrokeException extends Exception
{
    double needs;

    public YouBrokeException(double myAmount)
    {
        needs = myAmount;
    }

    public double getAmount()
    {
        return needs;
    }

    public class CheckingAccount
{
    double balance;
    int acctNumber;

    public CheckingAccount(int myAcctNumber)
    {
        acctNumber = myAcctNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double myBalance)
    {
        balance = myBalance;
    }

    public void withdraw (double amount) throws YouBrokeException
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            double needs=amount-balance;
            throw new YouBrokeException(needs);
        }
    }
    public void deposit(double ammount)
    {
        balance+= ammount;
    }
}
public static void main(String[] args)
{
    CheckingAccount obj1 =new CheckingAccount(50000);
    System.out.println(" WE depoisting....");
    obj1.deposit(1);

    try
    {
        System.out.println(" Withdrawing..100");
        obj1.withdraw(100);
        System.out.println("withdrawing 100000000");
        obj1.withdraw(1000000);//error her because insufficent funds
                               // haha youre broke

    }
    catch(YouBrokeException e)
    {
        System.out.println("You are Broke Haha Loser"+e.getAmount());
    
    e.printStackTrace();
    }

    finally{
        System.out.println("come back later loser when you have money");
    }
}
}

