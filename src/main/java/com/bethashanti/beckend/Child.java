package com.bethashanti.beckend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Child {

    private final long systemId;
    private EnumTypes.House house;
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
    private EnumTypes.ParentsStatus parentsStatus;
    private int numOfSiblings;
    private EnumTypes.EconomicStatus economicStatus;
    private EnumTypes.Origin origin;
    private EnumTypes.Nation nation;
    private String placeOfBirth;
    private String passportNum;
    private String citizenship;
    private String dream;
    private int dreamPriority;
    private String personalSidur;
    private List<EnumTypes.Restriction> restrictions;
    private List<Date> endDates;
    private Date leaveDate;
    private String moveTo;
    private String reasonForLeaving;

    public Child(long systemId, String house, String idNumber, String arrivalDate, String firstName, String lastName, String sex, String dateOfBirth,
                 String city, String address, String staffInCharge, String status, String phoneNum, String eMail,
                 String mothersName, String fathersName, String parentsStatus, String numOfSiblings, String economicStatus,
                 String origin, String nation, String placeOfBirth, String passportNum, String citizenship, String dream,
                 String dreamPriority, String personalSidur, String restriction1, String restriction2, String endDate1,
                 String endDate2, String leaveDate, String moveTo, String reasonForLeaving){

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
        this.parentsStatus = EnumTypes.ParentsStatus.valueOf(parentsStatus);
        this.numOfSiblings = Integer.parseInt(numOfSiblings);
        this.economicStatus = EnumTypes.EconomicStatus.valueOf(economicStatus);
        this.origin = EnumTypes.Origin.valueOf(origin);
        this.nation = EnumTypes.Nation.valueOf(nation);
        this.placeOfBirth = placeOfBirth;
        this.passportNum = passportNum;
        this.citizenship = citizenship;
        this.dream = dream;
        this.dreamPriority = Integer.parseInt(dreamPriority);
        this.personalSidur = personalSidur;
        this.restrictions = new ArrayList<EnumTypes.Restriction>();
        if(!restriction1.equals("")) {
            this.restrictions.add(EnumTypes.Restriction.valueOf(restriction1));
        }
        if(!restriction2.equals("")) {
            this.restrictions.add(EnumTypes.Restriction.valueOf(restriction2));
        }
        this.endDates = new ArrayList<Date>();
        if(!endDate1.equals("")) {
            try {
                this.endDates.add((new SimpleDateFormat("yyyy-MM-dd")).parse(endDate1));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(!endDate2.equals("")) {
            try {
                this.endDates.add((new SimpleDateFormat("yyyy-MM-dd")).parse(endDate2));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(leaveDate.equals((""))) {
            this.leaveDate = null;
        }
        else {
            try {
                this.leaveDate = new SimpleDateFormat("yyyy-MM-dd").parse(leaveDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        this.moveTo = moveTo;
        this.reasonForLeaving = reasonForLeaving;
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
    public void getFathersName(String newFathersName) {
        this.fathersName = newFathersName;
    }

    public String getParentsStatus() { return this.parentsStatus.toString(); }
    public void setParentsStatus(String newParentsStatus) { this.parentsStatus = EnumTypes.ParentsStatus.valueOf(newParentsStatus); }

    public String getNumOfSiblings() {
        return String.valueOf(this.numOfSiblings);
    }
    public void setNumOfSiblings(String newNumOfSiblings) {
        this.numOfSiblings = Integer.parseInt(newNumOfSiblings);
    }

    public String getEconomicStatus() { return this.economicStatus.toString(); }
    public void setEconomicStatus(String newEconomicStatus) { this.economicStatus = EnumTypes.EconomicStatus.valueOf(newEconomicStatus); }

    public String getOrigin() { return this.origin.toString(); }
    public void setOrigin(String newOrigin) { this.origin = EnumTypes.Origin.valueOf(newOrigin); }

    public String getNation() { return this.nation.toString(); }
    public void setNation(String newNation) { this.nation = EnumTypes.Nation.valueOf(newNation); }

    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }
    public void setPlaceOfBirth(String newPlaceOfBirth) {
        this.placeOfBirth = newPlaceOfBirth;
    }

    public String getPassportNum() {
        return this.passportNum;
    }
    public void setPassportNum(String newPassportNum) {
        this.passportNum = newPassportNum;
    }

    public String getCitizenship() { return this.citizenship; }
    public void setCitizenship(String newCitizenship) { this.citizenship = newCitizenship; }

    public String getDream() { return this.dream; }
    public void steDream(String newDream) { this.dream = newDream; }

    public String getDreamPriority() { return String.valueOf(this.dreamPriority); }
    public void setDreamPriority(String newDreamPriority) { this.dreamPriority = Integer.parseInt(newDreamPriority); }

    public String getPersonalSidur() { return this.personalSidur; }
    public void setPersonalSidur(String newPersonalSidur) { this.personalSidur = newPersonalSidur; }

    //////////TODO add get and set for restrictions and endDates

    public String getLeaveDate() { return this.leaveDate.toString(); }
    public void setLeaveDate(String newLeaveDate) {
        try {
            this.leaveDate = new SimpleDateFormat("dd/MM/yyyy").parse(newLeaveDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getMoveTo() { return this.moveTo; }

    public void setMoveTo(String moveTo) {
        this.moveTo = moveTo;
    }

    public String getReasonForLeaving() { return this.reasonForLeaving; }
    public void setReasonForLeaving(String newReasonForLeaving) { this.reasonForLeaving = newReasonForLeaving; }
}




