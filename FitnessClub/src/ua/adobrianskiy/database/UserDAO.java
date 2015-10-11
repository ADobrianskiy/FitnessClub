package ua.adobrianskiy.database;

import ua.adobrianskiy.medicine.SwimmingReference;
import ua.adobrianskiy.user.User;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class UserDAO {

    /**
     * @param user
     * @return true - if successful, false - otherwise.
     */
    public boolean addUser(User user){
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
}
