package ua.adobrianskiy.medicine;

import java.util.Date;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class SwimmingReference {
    private String text;
    private Date expirationDate;

    public SwimmingReference(String text, Date expirationDate){
        this.text = text;
        this.expirationDate = expirationDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return true - if  valid, false - otherwise.
     */
    public boolean validate() {
        return false;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
