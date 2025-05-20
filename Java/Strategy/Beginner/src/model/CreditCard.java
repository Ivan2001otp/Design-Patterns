package model;

public class CreditCard
{
    private int amount;
    private String number;
    private String date;
    private String cvv;

    public CreditCard(String cardNumber, String expiryDate, String cvv) {
        this.number = cardNumber;
        this.cvv = cvv;
        this.date = expiryDate;
        this.amount = 100_000;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
