package aplication.model;

import aplication.model.data.Address;
import aplication.model.data.Group;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String shortName;
    private String nickname;
    private String comment;
    private Group group;
    private String homePhone;
    private String mobilePhone;
    private String spareMobilePhone;
    private String email;
    private String skype;
    private Address address;
    private String fullAddress;
    private Date registrationDate;
    private Date lastChangeDate;



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setShortName(String lastName) {
        this.shortName = new StringBuilder().append(lastName).append(" ").append(this.firstName.charAt(0)).
                append(".").toString();
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setGroups(Group group) {
        this.group = group;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setSpareMobilePhone(String spareMobilePhone) {
        this.spareMobilePhone = spareMobilePhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setLastChangeDate(Date lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getShortName() {
        return shortName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getComment() {
        return comment;
    }

    public Group getGroups() {
        return group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getSpareMobilePhone() {
        return spareMobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public Address getAddress() {
        return address;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public Date getLastChangeDate() {
        return lastChangeDate;
    }
}
