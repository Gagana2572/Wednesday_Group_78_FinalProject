/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Request.Stock;
import Business.Request.ModifyItemsRequestDirectory;
import Business.Request.PurchaseRequestDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author likhithng
 */
public class StoreEnterprise extends Enterprise{
    private Stock menu;
    ModifyItemsRequestDirectory modifyItemsRequestDirectory;
    PurchaseRequestDirectory purchaseRequestDirectory;
    public StoreEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Store);
        menu = new Stock();
        modifyItemsRequestDirectory = new ModifyItemsRequestDirectory();
        purchaseRequestDirectory = new PurchaseRequestDirectory();
    }

    public Stock getMenu() {
        return menu;
    }

    public void setMenu(Stock menu) {
        this.menu = menu;
    }

    public ModifyItemsRequestDirectory getModifyDishesRequestDirectory() {
        return modifyItemsRequestDirectory;
    }

    public void setModifyDishesRequestDirectory(ModifyItemsRequestDirectory modifyItemsRequestDirectory) {
        this.modifyItemsRequestDirectory = modifyItemsRequestDirectory;
    }

    public PurchaseRequestDirectory getPurchaseRequestDirectory() {
        return purchaseRequestDirectory;
    }

    public void setPurchaseRequestDirectory(PurchaseRequestDirectory purchaseRequestDirectory) {
        this.purchaseRequestDirectory = purchaseRequestDirectory;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
