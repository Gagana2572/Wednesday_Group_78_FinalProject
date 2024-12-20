/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SPurchaseRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PurchaseOrganization;
import Business.Request.PurchaseRequest;
import Business.AFASystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class SPurchaseWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SPurchaseWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private PurchaseOrganization purchaseOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private AFASystem business;

    public SPurchaseWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PurchaseOrganization purchaseOrganization, Enterprise enterprise, AFASystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.purchaseOrganization = purchaseOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        
        populatePurchaseTable();
    }

    void populatePurchaseTable(){
        DefaultTableModel model = (DefaultTableModel) purchaseJTable.getModel();
        model.setRowCount(0);
        for (PurchaseRequest p : enterprise.getPurchaseRequestDirectory().getPurchaseRequestList()){
            Object[] row = new Object[4];
            row[0] = p.getMaterialName();
            row[1] = p.getMoneyOrdered();
            row[2] = p;
            row[3] = p.getPurchaseRequestStatus();
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseJTable = new javax.swing.JTable();
        btnPurchase = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 0));

        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        purchaseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Money Required", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(purchaseJTable);
        if (purchaseJTable.getColumnModel().getColumnCount() > 0) {
            purchaseJTable.getColumnModel().getColumn(0).setResizable(false);
            purchaseJTable.getColumnModel().getColumn(1).setResizable(false);
            purchaseJTable.getColumnModel().getColumn(2).setResizable(false);
            purchaseJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        btnPurchase.setText("Request Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(enterpriseLabel)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPurchase)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel)
                    .addComponent(valueLabel))
                .addGap(72, 72, 72)
                .addComponent(btnPurchase)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestPurchaseJPanel", new RequestPurchaseJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPurchaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPurchase;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable purchaseJTable;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
