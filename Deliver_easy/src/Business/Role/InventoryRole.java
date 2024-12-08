/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.AFASystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.InventoryRole.InventoryWorkAreaJPanel;

/**
 *
 * @author likhithng
 */
public class InventoryRole extends Role {
    
   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AFASystem business) {
        return new InventoryWorkAreaJPanel(userProcessContainer,account, (InventoryOrganization)organization, enterprise,business); //To change body of generated methods, choose Tools | Templates.
    }
}
