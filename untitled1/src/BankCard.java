import java.util.UUID;

public class BankCard {
    String cardNum;

    public void saveMoney() {
        System.out.println("卡号为" + cardNum + "银行卡可以存钱");
    }

    public static void main(String[] args) {
        System.out.println("------------银行卡的特性---------");
        BankCard bankCard = new BankCard();
        bankCard.cardNum = "6224 4569 2421 5677";
        bankCard.saveMoney();
        System.out.println("------------储蓄卡的特性---------");
        SavingCard savingCard =new SavingCard();
        savingCard.cardNum = "6212 2636 0010 2739";
        savingCard.saveMoney();
        savingCard.drawMoney();
        System.out.println("------------信用卡的特性---------");
        CreditCard creditCard = new CreditCard();
        creditCard.cardNum = "4013 7456 3380 0642";
        creditCard.borrowMoney();
        creditCard.drawMoney();
        creditCard.saveMoney();
    }


}

class SavingCard extends BankCard {
    public void drawMoney() {
        System.out.println(" 卡号为" + cardNum + "银行卡可以取钱");
    }

}

class CreditCard extends BankCard {
    public void borrowMoney() {
        System.out.println("卡号为" + cardNum + "银行卡可以借钱");
    }

    public void drawMoney() {
        System.out.println(" 卡号为" + cardNum + "银行卡可以取钱");
    }
}