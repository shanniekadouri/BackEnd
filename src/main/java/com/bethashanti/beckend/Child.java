package com.bethashanti.beckend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Child {

    private final long systemId;
    private String idNumber;
    private Date arrivalDate;
    private String firstName;
    private String lastName;
    private EnumTypes.Sex gender;
    private Date dateOfBirth;
    private String city;
    private String address;
    //////////// TODO public Instructor staffInCharge;
    private String staffInCharge;
    private EnumTypes.Status status;
    private String phoneNum;
    private String eMail;

    private String mothersName;
    private String fathersName;
    private EnumTypes.House house;

    public Child(long systemId, String idNumber, String arrivalDate, String firstName, String lastName, String sex, String dateOfBirth,
                 String city, String address, String staffInCharge, String status, String phoneNum, String eMail,
                 String mothersName, String fathersName, String house){

        this.systemId = systemId;

        this.house = EnumTypes.House.valueOf(house);
        this.idNumber = idNumber;
        if(arrivalDate.equals("")) {
            this.arrivalDate = null;
        }
        else {
            try {
                this.arrivalDate = (new SimpleDateFormat("yyyy-MM-dd")).parse(arrivalDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = EnumTypes.Sex.valueOf(sex);
        if(dateOfBirth.equals((""))) {
           this.dateOfBirth = null;
        }
        else {
            try {
                this.dateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        this.city = city;
        this.address = address;
        this.staffInCharge = staffInCharge;
        this.status = EnumTypes.Status.valueOf(status);
        this.phoneNum = phoneNum;
        this.eMail = eMail;


        this.mothersName = mothersName;
        this.fathersName = fathersName;

    }

    public long getSystemId() {
        return this.systemId;
    }

    public String gethouse() {
        return this.house.toString();
    }
    public void setHouse(String newHouse) {
        this.house = EnumTypes.House.valueOf(newHouse);
    }

    public String getIdNumber() {
        return this.idNumber;
    }
    public void setIdNumber(String newId) {
        this.idNumber = newId;
    }

    public String getArrivelDate() {
        return this.arrivalDate.toString();
    }
    public void setArrivelDate(String newArrivelDate) {
        try {
            this.arrivalDate = new SimpleDateFormat("dd/MM/yyyy").parse(newArrivelDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getGender() {
        return this.gender.toString();
    }
    public void setGender(String newGender) {
        this.gender = EnumTypes.Sex.valueOf(newGender);
    }

    public String getDateOfBirth() { return this.dateOfBirth.toString(); }
    public void setDateOfBirth(String newDateOfBirth) {
        try {
            this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(newDateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getCity() {
        return this.city;
    }
    public void setCity(String newCity) {
        this.city = newCity;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String newAdress) {
        this.address = newAdress;
    }

    ///////TODO
    public String getStaffInCharge() {
        return this.staffInCharge;
    }
    public void setStaffInCharge(String newStaffInCharge) {
        this.staffInCharge = newStaffInCharge;
    }

    public String getStatus() {
        return this.status.toString();
    }
    public void setStatus(String newStatus) {
        this.status = EnumTypes.Status.valueOf(newStatus);
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }
    public void setPhoneNum(String newPhoneNum) {
        this.phoneNum = newPhoneNum;
    }

    public String geteMail() {
        return this.eMail;
    }
    public void seteMail(String neweMail) {
        this.eMail = neweMail;
    }







    public String getMothersName() {
        return this.mothersName;
    }
    public void setMotherName(String newMotherName) {
        this.mothersName = newMotherName;
    }

    public String getFatherName() {
        return this.fathersName;
    }
    public void getFathersName(String newFthersName) {
        this.fathersName = newFthersName;
    }

}




