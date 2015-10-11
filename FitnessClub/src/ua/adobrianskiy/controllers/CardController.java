package ua.adobrianskiy.controllers;

import ua.adobrianskiy.account.Agreement;
import ua.adobrianskiy.account.card.Card;
import ua.adobrianskiy.database.CardDAO;
import ua.adobrianskiy.user.User;

/**
 * Created by adobrianskiy on 11.10.15.
 */
// QUESTION QUESTION QUESTION QUESTION QUESTION QUESTION QUESTION
public class CardController {
    public CardDAO cardDAO = new CardDAO();

    /**
     * @param user
     * @param card
     * @return Card - if successful, null - otherwise.
     */
    public Card createCard(User user, Card card){
        Agreement agreement = signAgreement(user);
        if(agreement != null) {
            card.setAgreement(agreement);
        } else {
            card = null;
        }

        if(!cardDAO.addCard(card)){
            card = null;
        }
        return card;
    }

    private Agreement signAgreement(User user) {
        return new Agreement("User " + user + " signed agreement.");
    }
}
