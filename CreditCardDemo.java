package QAP2;

public class CreditCardDemo {
    public static void main(String[] args) {
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);
        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));
        CreditCard card1 = new CreditCard(owner, LIMIT);
        System.out.println(owner.getPerson());
        System.out.println("Balance: " + card1.getBalance());
        System.out.println("Credit Limit: " + card1.getLimit());
        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        card1.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + card1.getBalance());
        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        card1.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + card1.getBalance());
        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        card1.payment(THIRD_AMOUNT);
        System.out.println("Balance: " + card1.getBalance());
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        card1.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + card1.getBalance());
    }
}
