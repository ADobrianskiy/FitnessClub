package ua.adobrianskiy.controllers;

import ua.adobrianskiy.account.card.Card;
import ua.adobrianskiy.database.CardDAO;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class CardBalanceController {
    public CardDAO cardDAO = new CardDAO();

    /**
     * @param card
     * @param expenses
     * @return true - if successful, false - otherwise.
     */
    public boolean payExpenses(Card card, Double expenses){
        return cardDAO.payExpenses(card, expenses);
    }


    /**
     * @param card
     * @param funds
     * @return true - if successful, false - otherwise.
     */
    public boolean addFunds(Card card, Double funds){
        return cardDAO.addFunds(card,funds);
    }

    public boolean buyTrainings (Card card, Integer trainings){
        return cardDAO.buyTrainings(card, trainings);
    }

    public Double getBallance(Card card){
        return cardDAO.getBallance(card);
    }
}

