package TMS.homework6;

public class CreateCreditCard {
    private String accountNumber;
    private double balance;

    public CreateCreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        balance -= amount;
    }

    public void printInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Баланс: " + balance);
        System.out.println("-------------------");
    }

        public static void main(String[] args) {
            CreateCreditCard card1 = new CreateCreditCard("111", 1000);
            CreateCreditCard card2 = new CreateCreditCard("222", 2000);
            CreateCreditCard card3 = new CreateCreditCard("333", 3000);
            card1.addMoney (500);
            card2.addMoney (1000);
            card3.withdrawMoney(100);
            card1.printInfo();
            card2.printInfo();
            card3.printInfo();
        }
    }

