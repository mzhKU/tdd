abstract class Money
{
    /*
    Visibility has to change from private to protected so the
    subclass can still see it.
    */
    abstract Money times(int multiplier);
    protected int amount; 
    
    // Factory method that returns a Dollar.
    static Money dollar(int amount)
    {
        return new Dollar(amount);
    }
    
    static Money franc(int amount)
    {
        return new Franc(amount);
    }

    public boolean equals(Object object)
    {
        /*
        1) "true"         is really
           "5 == 5",      which is really
           "amount == 5", which is really
           "amount == dollar.amount"
           Create a new variable of class Dollar,
           with name dollar, then assign a value
           to that variable by casting to Dollar.
        2) Dollars are not Francs. 
        */ 
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}

class Dollar extends Money
{
    Dollar(int amount)
    {
        this.amount = amount;
    }

    Money times(int multiplier)
    {
        return new Dollar(amount*multiplier);
    }
}

class Franc extends Money
{
    Franc(int amount)
    {
        this.amount = amount;
    }

    Money times(int multiplier)
    {
        return new Franc(amount*multiplier);
    };
}
