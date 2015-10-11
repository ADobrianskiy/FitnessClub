package ua.adobrianskiy.account.card;

import ua.adobrianskiy.account.Agreement;
import ua.adobrianskiy.user.User;

import java.util.Date;

/**
 * Created by adobrianskiy on 11.10.15.
 */

// QUESTION QUESTION QUESTION
public abstract class Card {
    private Date expirationDate;
    private Integer paidTrainings;
    private Integer freeTrainings;
    // private Double balance;
    private Agreement agreement;
    private boolean isActive = false;
    private User owner;
    private Integer id;

    public Card(User user){
        this.owner = user;
    }

    public Card(User user, Agreement agreement){
        this.owner = user;
        this.agreement = agreement;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean activate(){
        if(isActive) {
            return false;
        }

        return isActive = true;
    }
}
