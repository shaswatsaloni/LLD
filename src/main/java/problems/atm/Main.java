package problems.atm;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to ATM");

        ATMMachine atmMachine = new ATMMachine();
        System.out.println("ATM Machine Current state : " + atmMachine.getAtmMachineState().getClass().getName());

        System.out.println();
        atmMachine.enterPinAndWithdrawMoney(1234, 20);
        atmMachine.ejectDebitCard();
        atmMachine.insertDebitCard();

        System.out.println("\n*******************************************************");

        System.out.println("\nATM Machine Current state : "
                + atmMachine.getAtmMachineState().getClass().getName());
        System.out.println();

        atmMachine.enterPinAndWithdrawMoney(1234, 20);
        atmMachine.insertDebitCard();
        atmMachine.ejectDebitCard();
        System.out.println("\n*******************************************************");


        System.out.println("\nATM Machine Current state : "
                + atmMachine.getAtmMachineState().getClass().getName());
    }
}
