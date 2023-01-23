/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Panzi
 */
public class Contact {
   long Phone;
   String Email_ID;

   public Contact(){
      this.Email_ID = "";
}

    public long getPhone() {
        return Phone;
    }

    public void setPhone(long Phone) {
        this.Phone = Phone;
    }

    public String getEmail_ID() {
        return Email_ID;
    }

    public void setEmail_ID(String Email_ID) {
        this.Email_ID = Email_ID;
    }
}
