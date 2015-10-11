package ua.adobrianskiy.controllers;

import ua.adobrianskiy.account.card.Card;
import ua.adobrianskiy.user.User;

import java.util.Date;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class CardAccountController {

    /**
     * @param card
     * @param freezeTo
     * @return true - if successful, false - otherwise.
     */
    public boolean freeze(Card card, Date freezeTo){
        //checks and some logic
        card.setExpirationDate(freezeTo);
        return false;
    }

    /**
     * @param card
     * @param user
     * @return true - if successful, false - otherwise.
     */
    public boolean changeOwner(Card card, User user){
        //checks and some logic
        card.setOwner(user);
        return false;
    }

    /**
     * @param card
     * @return true - if successful, false - otherwise.
     */
    public boolean activateCard(Card card){
        return  card.activate();
    }

}

