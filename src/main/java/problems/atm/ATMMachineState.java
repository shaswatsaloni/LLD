package problems.atm;

public interface ATMMachineState {
    public void insertDebitCard();
    public void ejectDebitCard();
    public void enterPinAndWithdrawMoney(int pin, int cash);
}
