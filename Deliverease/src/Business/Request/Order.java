/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import Business.Network.Network;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hp
 */
public class Order {
    private String Sname;
    private String Dname;
    private String Cname;
    private float totalPrice;
    private String timeStamp;
    private String status;
    private List<Item> totalItem; 
    private String address;
    private Network network;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Order() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        timeStamp =  df.format(new Date());
        totalItem = new ArrayList<>();
    }

    public List<Item> getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(List<Item> totalItem) {
        this.totalItem = totalItem;
    }
    

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    @Override 
    public String toString(){
        return timeStamp;
    }
    
    
}
