public class WorkWithCC {
    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard("12345AA6789", 200.0);
        CreditCard secondCard = new CreditCard("98765BB4321", 50000.0);
        CreditCard thirdCard = new CreditCard("56712QQ2345", 1000.0);

        firstCard.addAmount(200.0);
        secondCard.addAmount(100.0);
        thirdCard.subtractAmount(30.0);

        System.out.println(firstCard.getInfo());
        System.out.println(secondCard.getInfo());
        System.out.println(thirdCard.getInfo());
    }
}
