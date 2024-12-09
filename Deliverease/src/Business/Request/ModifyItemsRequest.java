/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hp
 */
public class ModifyItemsRequest {
    private Item item;
    private String modifyStatus;
    private String timeStamp;
    private float finalPrice;
    private float originalPrice;

    public float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

   

    public ModifyItemsRequest(Item item){
        this.item = item;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        timeStamp =  df.format(new Date());
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    @Override 
    public String toString(){
        return timeStamp;
    }
}
