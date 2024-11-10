package problems.atm;

public class HasCardState implements ATMMachineState{

    @Override
    public void insertDebitCard() {
        {
            System.out.println("Debit Card is already there,So you cannot insert the Debit Card ...");
        }
    }

    @Override
    public void ejectDebitCard() {
        System.out.println("Debit Card is ejected...");
    }

    @Override
    public void enterPinAndWithdrawMoney(int pin, int cash) {
        verifyPin(pin);
        verifyAmount(cash);
        System.out.println("Money has been withDrawn...");
    }

    public void verifyPin(int pin){
        System.out.println("Pin has been verified successfully");
    }

    public void verifyAmount(int cash){
        if(cash <= 0){
            System.out.println("Amount can not be less than or equal to zero!");
            System.exit(1);
        }
        if(cash % 100 == 0){
            System.out.println("Please enter amount in mulitples of 20");
            System.exit(1);
            System.out.println( "You have entered "+ cash);
        }
    }
}
