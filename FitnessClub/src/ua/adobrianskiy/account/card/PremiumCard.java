package ua.adobrianskiy.account.card;

import ua.adobrianskiy.account.Agreement;
import ua.adobrianskiy.user.User;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class PremiumCard extends Card{
    public PremiumCard(User user, Agreement agreement) {
        super(user, agreement);
    }
}
