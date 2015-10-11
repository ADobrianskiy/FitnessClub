package ua.adobrianskiy.controllers;

import ua.adobrianskiy.account.Key;
import ua.adobrianskiy.account.card.Card;
import ua.adobrianskiy.database.ReceptionDAO;


/**
 * Created by adobrianskiy on 11.10.15.
 */
public class ReceptionController {
    public ReceptionDAO receptionDAO = new ReceptionDAO();
    public CardBalanceController balanceController = new CardBalanceController();

    public Key logIn(Card card){
        Key key = receptionDAO.getFreeKey();
        //some logic
        receptionDAO.bindCardToKey(card, key);
        //some logic
        return key;
    }

    public Card logOut(Key key){
        Card card = receptionDAO.getCardByKey(key);
        balanceController.addFunds(card, key.getExpenses());
        balanceController.payExpenses(card, key.getExpenses());
        return card;
    }
}
