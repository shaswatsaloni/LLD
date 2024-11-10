package problems.atm;

public class ATMMachine implements ATMMachineState{

    private ATMMachineState atmMachineState;

    public ATMMachine(){
        atmMachineState = new HasNoCardState(); //set the card as no card state.
    }

    //to get the current state.
    public ATMMachineState getAtmMachineState(){
        return atmMachineState;
    }

    //to set the current state with the state passed.
    public void setAtmMachineState(ATMMachineState atmMachineState){
        this.atmMachineState = atmMachineState;
    }

    @Override
    public void insertDebitCard() {
        //to call the insertDebitCard of the current state.
        atmMachineState.insertDebitCard();

        if(atmMachineState instanceof HasNoCardState){
            ATMMachineState hasCardState = new HasCardState();
            setAtmMachineState(hasCardState);
            System.out.println("ATM Machine internal state has been moved to : " + atmMachineState.getClass().getName());
        }
    }

    @Override
    public void ejectDebitCard() {
        //to call the ejectDebitCard of the current state.
        atmMachineState.ejectDebitCard();

        if(atmMachineState instanceof HasCardState){
            ATMMachineState noCardState = new HasNoCardState();
            setAtmMachineState(noCardState);
            System.out.println("ATM Machine internal state has been moved to : " + atmMachineState.getClass().getName());
        }
    }

    @Override
    public void enterPinAndWithdrawMoney(int pin, int cash) {
        atmMachineState.enterPinAndWithdrawMoney(pin, cash);
    }
}
