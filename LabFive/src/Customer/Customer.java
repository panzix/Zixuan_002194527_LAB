/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Profile.Profile;
import RentalRequest.*;
import java.util.ArrayList;

/**
 *
 * @author Panzi
 */
public class Customer extends Profile{
    private int requestTotal;
    
    private ArrayList<RentalRequest> rentalRequestList;
    
    public Customer() {
        super();
        this.rentalRequestList = new ArrayList<RentalRequest>();
    }

    public int getRequestTotal() {
        return requestTotal;
    }

    public void setRequestTotal(int requestTotal) {
        this.requestTotal = requestTotal;
    }

   

    public ArrayList<RentalRequest> getRentalRequestList() {
        return rentalRequestList;
    }

    public void setRentalRequestList(ArrayList<RentalRequest> rentalRequestList) {
        this.rentalRequestList = rentalRequestList;
    }
   

    
    public void addReuest(RentalRequest rentalRequest) {
        this.rentalRequestList.add(rentalRequest);
    }
}
