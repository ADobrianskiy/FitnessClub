package ua.adobrianskiy.account.card;

import javafx.util.Pair;
import ua.adobrianskiy.account.Agreement;
import ua.adobrianskiy.user.User;

import java.util.Date;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class TimeLimitedCard extends Card{
    private Date limitFrom;
    private Date limitTo;

    public TimeLimitedCard(User user, Agreement agreement,Pair<Date, Date> limits) {
        super(user, agreement);
        this.limitFrom = limits.getKey();
        this.limitTo = limits.getValue();
    }
}
