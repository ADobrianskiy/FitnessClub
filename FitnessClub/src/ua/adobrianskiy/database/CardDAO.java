package ua.adobrianskiy.database;

import ua.adobrianskiy.account.card.Card;
import ua.adobrianskiy.medicine.SwimmingReference;
import ua.adobrianskiy.user.User;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class CardDAO {

    /**
     * @param card
     * @return true - if successful, false - otherwise.
     */
    public boolean addCard(Card card){
        return true;
    }

    /**
     * @param user
     * @param reference
     * @return true - if successful, false - otherwise.
     */
    public boolean addSwimmingMedicalReference(User user, SwimmingReference reference) {

        return false;
    }

    /**
     * @return true - if successful, false - otherwise.
     */
    public boolean addFunds(Card card, Double amountToAdd) {
        return true;
    }


    /**
     * @param card
     * @param expenses
     * @return true - if successful, false - otherwise.
     */
    public boolean payExpenses(Card card, Double expenses) {
        return true;
    }

    public boolean buyTrainings(Card card, Integer trainings) {
        return false;
    }

    public Double getBallance(Card card) {
        return null;
    }
}
