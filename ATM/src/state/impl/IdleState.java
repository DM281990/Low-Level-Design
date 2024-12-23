package state.impl;

import dto.atm.ATM;
import dto.atm.Card;
import state.ATMState;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
