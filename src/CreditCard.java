public class CreditCard {
    String number;
    double summa;

    CreditCard(String number, double summa) {
        this.number = number;
        this.summa = summa;
    }

    void addAmount(double incomingAmount) {
        summa = summa + incomingAmount;
    }

    void subtractAmount(double incomingAmount) {
        summa = summa - incomingAmount;
    }

    String getInfo() {
        return "Number: " + this.number + " Summa: " + this.summa;
    }
}

