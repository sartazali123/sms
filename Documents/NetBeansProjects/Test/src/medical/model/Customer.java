/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.model;

/**
 *
 * @author USER
 */
public class Customer {

    int id;
    private String customer_name;
    private String customer_mobile;
    private String customer_address;
    private String customer_city;
    private String customer_state;
    private String customer_country;
    private String customer_email;
    private String customer_gstno;
    
   
      
    public Customer(String customer_name, String customer_mobile, String customer_address, String customer_email) {
        super();
        this.customer_name = customer_name;
        this.customer_mobile = customer_mobile;
        this.customer_address = customer_address;
        this.customer_email = customer_email;
    }
  
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_mobile() {
        return customer_mobile;
    }

    public void setCustomer_mobile(String customer_mobile) {
        this.customer_mobile = customer_mobile;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_city() {
        return customer_city;
    }

    public void setCustomer_city(String customer_city) {
        this.customer_city = customer_city;
    }

    public String getCustomer_state() {
        return customer_state;
    }

    public void setCustomer_state(String customer_state) {
        this.customer_state = customer_state;
    }

    public String getCustomer_country() {
        return customer_country;
    }

    public void setCustomer_country(String customer_country) {
        this.customer_country = customer_country;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_gstno() {
        return customer_gstno;
    }

    public void setCustomer_gstno(String customer_gstno) {
        this.customer_gstno = customer_gstno;
    }
     @Override
    public String toString() {
        return "{"+ id + ", " + customer_name + ","+ customer_mobile + ", "+ customer_address + ","+ customer_email + "}";
    }
   
    
}
