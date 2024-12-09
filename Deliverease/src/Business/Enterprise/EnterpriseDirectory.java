/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author likhithng
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Store){
            enterprise=new StoreEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Platform){
            enterprise=new PlatformEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Delivery){
            enterprise=new DeliveryEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
