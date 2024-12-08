/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.AFASystem;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.DManagerWorkAreaJPanel;
import UserInterface.InventoryRole.InventoryWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author likhithng
 */
public class DManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AFASystem business) {
        return new DManagerWorkAreaJPanel(userProcessContainer, enterprise);  //To change body of generated methods, choose Tools | Templates.
    }
    
}
