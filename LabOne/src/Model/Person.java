/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Panzi
 */
public class Person {
    private String NUID;
    private String firstName;
    private String LastName;
    private String CollegeName;
    private Contact officeContact;
    private Contact personalContact;
    private Address curAddress;
    private Address perAddress;

    public Person(){
        this.NUID = "";
        this.firstName = "";
        this.LastName = "";
        this.CollegeName = "";
        this.officeContact = new Contact();
        this.personalContact = new Contact();
        this.curAddress = new Address();
        this.perAddress = new Address();
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }  

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String CollegeName) {
        this.CollegeName = CollegeName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getCurAddress() {
        return curAddress;
    }

    public void setCurAddress(Address curAddress) {
        this.curAddress = curAddress;
    }

    public Address getPerAddress() {
        return perAddress;
    }

    public void setPerAddress(Address perAddress) {
        this.perAddress = perAddress;
    }
}
