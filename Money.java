package QAP2;

public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public Money(Money otherAmount) {
        this.amount = otherAmount.amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return Double.compare(money.amount, amount) == 0;
    }

    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }

    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }
}
