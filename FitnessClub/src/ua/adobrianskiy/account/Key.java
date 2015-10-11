package ua.adobrianskiy.account;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class Key {
    private int id;
    private Double expenses;

    public void addExpenses(Double expenses) {
        if(expenses < 0){
            throw new RuntimeException("Bad expenses value.");
        }
        this.expenses += expenses;
    }

    public Double getExpenses() {
        return expenses;
    }
}
