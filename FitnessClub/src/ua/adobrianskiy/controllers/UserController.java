package ua.adobrianskiy.controllers;

import ua.adobrianskiy.database.UserDAO;
import ua.adobrianskiy.medicine.SwimmingReference;
import ua.adobrianskiy.user.User;
import ua.adobrianskiy.user.UserInfo;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class UserController {
    private UserDAO userDAO = new UserDAO();

    /**
     * @param info
     * @return new user - if successful, null - otherwise.
     * @throws Exception
     */
    public User registrateUser(UserInfo info) throws Exception {
        if(!info.validate()) {
            throw new Exception("Not valid User Info. Can not create User.");
        }
        User user = new User(info);
        if(!userDAO.addUser(user)){
            return null;
        }
        return user;
    }

    public boolean  addSwimmingMedicalReference(User user, SwimmingReference reference){
        if(!reference.validate()) {
            return false;
        }
        return userDAO.addSwimmingMedicalReference(user, reference);
    }
}
