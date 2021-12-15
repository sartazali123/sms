/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

/**
 *
 * @author Asus
 */
public class User {
    
    private int s_id;
    private String company;
    private String name;
    private String quantity;
    private String price;
    private String mrp;

    public User(int s_id,String company,String name,String quantity,String price,String mrp){
    
    super();
    this.s_id=s_id;
    this.company=company;
    this.name=name;
    this.quantity=quantity;
    this.price=price;
    this.mrp=mrp;
    
    }
    
    

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    @Override
    public String toString() {
        return "{"+ s_id + ", " + company + ","+ name + ", "+ quantity + ","+ price + "," + mrp + "}";
    }
    
}
