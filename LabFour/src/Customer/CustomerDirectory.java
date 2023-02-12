/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;
import java.util.ArrayList;
/**
 *
 * @author Panzi
 */
public class CustomerDirectory {
    ArrayList<Customer> customerList;

    public CustomerDirectory() {
        this.customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public Customer findById(String id){
        for(Customer c : this.customerList){
            if(c.getPersonId().equals(id)){
                return c;
            }
        }
        return null;
    }
    
    public Customer createCustomer(String id, String name, String age){
        Customer c = new Customer();
        c.setPersonId(id);
        c.setName(name);
        c.setAge(age);
 
        this.customerList.add(c);
        return c;
    }
}
