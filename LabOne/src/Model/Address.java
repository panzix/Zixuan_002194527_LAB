/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Panzi
 */
public class Address {
    String streetName;
    int Apt_No;
    String City_State;
    String ZipCode;

    public Address(){
        this.streetName = "";
        this.City_State = "";
        this.ZipCode = "";
    }

    public int getApt_No() {
        return Apt_No;
    }

    public void setApt_No(int Apt_No) {
        this.Apt_No = Apt_No;
    }

    public String getCity_State() {
        return City_State;
    }

    public void setCity_State(String City_State) {
        this.City_State = City_State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
