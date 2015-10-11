package ua.adobrianskiy.database;

import ua.adobrianskiy.account.Key;
import ua.adobrianskiy.account.card.Card;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class ReceptionDAO {
    /**
     * @param card
     * @return true - if successful, false - otherwise.
     */
    public Key bindCardToKey(Card card, Key key){
        //some logic
        return key;
    }

    /**
     * @return Key if there is free key, null - otherwise.
     */
    public Key getFreeKey() {
        return new Key();
    }

    public Card getCardByKey(Key key) {
        return null;
    }
}
