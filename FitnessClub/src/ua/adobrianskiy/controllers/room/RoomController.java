package ua.adobrianskiy.controllers.room;

import ua.adobrianskiy.account.Key;
import ua.adobrianskiy.user.User;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public abstract class RoomController {
    public RoomController() {
    }

    public boolean checkPermissionsToEnter(Key key){
        return true;
    }

    public void enter(Key key){
        // add time when entered to storage
    }

    public void exit(Key key){
        // check for overtime
        try {
            key.addExpenses(30.);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract boolean checkMedicineReference(User user);
}
