package ua.adobrianskiy.controllers.room;

import ua.adobrianskiy.account.Key;
import ua.adobrianskiy.database.ReceptionDAO;
import ua.adobrianskiy.database.RoomDAO;
import ua.adobrianskiy.goods.Goods;
import ua.adobrianskiy.goods.Service;
import ua.adobrianskiy.user.User;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class PoolController extends RoomController {
    private RoomDAO roomDAO = new RoomDAO();

    public Boolean buyGood(Key key, Goods goods){
        key.addExpenses(goods.getPrice());
        return true;
    }

    public Boolean payForService(Key key, Service service){
        key.addExpenses(service.getPrice());
        return true;
    }

    @Override
    public boolean checkMedicineReference(User user){
        return roomDAO.getSwimmingReference(user) != null;
    }
}
