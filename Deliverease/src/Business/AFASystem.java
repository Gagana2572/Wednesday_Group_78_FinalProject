/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.EmployeeDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Request.OrderDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author likhithng
 */
public class AFASystem extends Organization{
    private static AFASystem business;
    private ArrayList<Network> networkList;
    private EmployeeDirectory employeeDirectory;
    private OrderDirectory orderDirectory;

    public static AFASystem getBusiness() {
        return business;
    }

    public static void setBusiness(AFASystem business) {
        AFASystem.business = business;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    public static AFASystem getInstance(){
        if(business==null){
            business=new AFASystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    public AFASystem(){
        super("AFASystem");
        networkList = new ArrayList<Network>();
        employeeDirectory = new EmployeeDirectory();
        orderDirectory = new OrderDirectory();
        
    }
    

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
     public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    

}
