/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.InventoryOrganization;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Request.Stock;
import Business.Request.ModifyItemsRequestDirectory;
import Business.Request.MoneyOrderDirectory;
import Business.Request.OrderDirectory;
import Business.Request.PurchaseRequestDirectory;

/**
 *
 * @author likhithng
 */
public abstract class Enterprise extends Organization{
    private OrderDirectory orderDirectory;
    private float totalProfit;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Stock menu;
    ModifyItemsRequestDirectory modifyDishesRequestDirectory;
    PurchaseRequestDirectory purchaseRequestDirectory;
    MoneyOrderDirectory moneyOrderDirectory;
    private float balance;

    public MoneyOrderDirectory getMoneyOrderDirectory() {
        return moneyOrderDirectory;
    }

    public void setMoneyOrderDirectory(MoneyOrderDirectory moneyOrderDirectory) {
        this.moneyOrderDirectory = moneyOrderDirectory;
    }
    public float getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(float totalProfit) {
        this.totalProfit = totalProfit;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Store("Store"),Platform("Platform"),Delivery("Delivery");
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        menu = new Stock();
        modifyDishesRequestDirectory = new ModifyItemsRequestDirectory();
        purchaseRequestDirectory = new PurchaseRequestDirectory();
        orderDirectory = new OrderDirectory();
        balance = 10000;
        moneyOrderDirectory = new MoneyOrderDirectory();
        //cookOrganizationDirectory = new CookOrganizationDirectory();
    }

//    public CookOrganizationDirectory getCookOrganizationDirectory() {
//        return cookOrganizationDirectory;
//    }
//
//    public void setCookOrganizationDirectory(CookOrganizationDirectory cookOrganizationDirectory) {
//        this.cookOrganizationDirectory = cookOrganizationDirectory;
//    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    
    public ModifyItemsRequestDirectory getModifyDishesRequestDirectory() {
        return modifyDishesRequestDirectory;
    }

    public void setModifyDishesRequestDirectory(ModifyItemsRequestDirectory modifyDishesRequestDirectory) {
        this.modifyDishesRequestDirectory = modifyDishesRequestDirectory;
    }

    public PurchaseRequestDirectory getPurchaseRequestDirectory() {
        return purchaseRequestDirectory;
    }

    public void setPurchaseRequestDirectory(PurchaseRequestDirectory purchaseRequestDirectory) {
        this.purchaseRequestDirectory = purchaseRequestDirectory;
    }

    public Stock getMenu() {
        return menu;
    }

    public void setMenu(Stock menu) {
        this.menu = menu;
    }
    
    
}