package problems.atm;

public class HasNoCardState implements ATMMachineState{
    @Override
    public void insertDebitCard() {
        System.out.println("Debit card inserted");
    }

    @Override
    public void ejectDebitCard() {
        System.out.println("There is no card to eject");
    }

    @Override
    public void enterPinAndWithdrawMoney(int pin, int cash) {
        System.out.println("ATM is in a no card state, hence you can not withdraw cash");
    }
}
