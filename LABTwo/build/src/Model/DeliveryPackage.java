/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;

/**
 *
 * @author Panzi
 */
public class DeliveryPackage {
    private int packageId;
    private double packageWeight;
//    private Product product;
    ArrayList<Product> productList;
    private Customer customer;

    public DeliveryPackage(){
//        this.product = new Product();
        this.productList = new ArrayList<Product>();
        this.customer = new Customer();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //add a product to the arraylist
    public Product createProduct(int productId, String productName, double price){
           Product product = new Product(); //create new prod object
           product.setProductId(productId);
           product.setProductName(productName);
           product.setPrice(price);
           this.productList.add(product); //add it to list
           return product;
    }

    public Product findProduct(int pid){
        for(Product prod : this.productList){
            if(prod.getProductId() == pid){
                return prod;
            }
        }
      return null;
    }
}
