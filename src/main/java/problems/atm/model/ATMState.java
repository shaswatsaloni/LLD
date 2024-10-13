package problems.atm.model;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin();
    void requestCash();
    void cancelTransaction();
    void getStateName();
    void enterState();
}
