package QAP2;

public class CreditCard {
    Person newCardHolder;
    Money limit;
    Money balance;

    public CreditCard(Person newCardHolder, Money limit){
        this.newCardHolder = newCardHolder;
        this.limit = limit;
        this.balance = new Money(0);

    }

    public Money getBalance(){
        return balance;
    }

    public Money getLimit(){
        return limit;
    }

    public String getPersonals(){
        return this.toString();
    }

    public void charge(Money amount){
        if (balance.getAmount() + amount.getAmount() <= limit.getAmount()) {
            balance.setAmount(balance.getAmount() + amount.getAmount());
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance.setAmount(balance.getAmount() - amount.getAmount());
        System.out.println("Payment: " + amount);
    }
}

