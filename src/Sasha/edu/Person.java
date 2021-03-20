package Sasha.edu;

import java.time.LocalDate;
import java.util.Objects;

/*
@USER: Java02
@DATE: 20.03.2021
@NAME: Person

*/public class Person {
    private String firstname;
    private String midName;
    private String lastName;
    private String adress;
    private String city;
    private String street;
    private String houseNumber;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String firstname, String midName, String lastName, String adress, String city, String street, String houseNumber, String phoneNumber, LocalDate dateOfBirth) {
        this.firstname = firstname;
        this.midName = midName;
        this.lastName = lastName;
        this.adress = adress;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) && Objects.equals(midName, person.midName) && Objects.equals(lastName, person.lastName) && Objects.equals(adress, person.adress) && Objects.equals(city, person.city) && Objects.equals(street, person.street) && Objects.equals(houseNumber, person.houseNumber) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(dateOfBirth, person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, midName, lastName, adress, city, street, houseNumber, phoneNumber, dateOfBirth);
    }
}