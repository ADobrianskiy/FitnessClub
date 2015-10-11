package ua.adobrianskiy.user;

/**
 * Created by adobrianskiy on 11.10.15.
 */
public class UserInfo {
    private String name;
    private String surname;
    private String email;
    private Gender gender;

    /**
     * @return true - if valid data, false - otherwise.
     */
    public boolean validate() {
        //
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
