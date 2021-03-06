package com.epam.lab;


public class UserAuthorization {
    @MyAnnotation(
            name = "Iryna"
    )
    private String username;
    @MyAnnotation(
            name = "Surname"
    )
    private String surname;
    private Integer age;

    private String phoneNumber;

    private String workMobilePhoneNumber;

    public UserAuthorization(String username, String surname, Integer age,
                             String phoneNumber, String workMobilePhoneNumber) {
        this.age = age;
        this.username = username;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.workMobilePhoneNumber = workMobilePhoneNumber;
    }


    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkMobilePhoneNumber() {
        return workMobilePhoneNumber;
    }

    public void setWorkMobilePhoneNumber(String workMobilePhoneNumber) {
        this.workMobilePhoneNumber = workMobilePhoneNumber;
    }

}
