/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Enterprise.Enterprise;
import Business.Enterprise.StoreEnterprise;
import Business.Network.Network;
import Business.Request.Item;
import Business.Request.Order;
import Business.Request.OrderDirectory;
import Business.AFASystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import java.util.logging.*;


/**
 *
 * @author likhithng
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkArea
     */
    private AFASystem system;
    private JPanel userProcessContainer;
    private OrderDirectory orderDirectory;
    private List<Item> l;
    private float sum;
    private UserAccount account;
    
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,AFASystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.orderDirectory =system.getOrderDirectory();
        this.l = new ArrayList<>();
        
        sum = 0;
        populateNetCob();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        menuJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ResCob = new javax.swing.JComboBox<>();
        btnOrder = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NetCob = new javax.swing.JComboBox<>();
        Addbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CartTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 0));

        menuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuJTable);
        if (menuJTable.getColumnModel().getColumnCount() > 0) {
            menuJTable.getColumnModel().getColumn(0).setResizable(false);
            menuJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Choose A Store");

        ResCob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ResCob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResCobActionPerformed(evt);
            }
        });

        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnViewOrder.setText("Order History");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        jLabel2.setText("Choose A Network");

        NetCob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NetCob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetCobActionPerformed(evt);
            }
        });

        Addbtn.setText("Add to Cart");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CartTable);
        if (CartTable.getColumnModel().getColumnCount() > 0) {
            CartTable.getColumnModel().getColumn(0).setResizable(false);
            CartTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setText("Total Cost:");

        txtCost.setEnabled(false);
        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        jLabel4.setText("Address:");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Your Cart:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(Addbtn)
                            .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ResCob, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NetCob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCost, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txtAddress))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Addbtn, btnDelete, btnOrder, btnViewOrder});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NetCob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ResCob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Addbtn)
                        .addGap(76, 76, 76)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(59, 59, 59)
                        .addComponent(btnViewOrder)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateNetCob(){
        
        NetCob.removeAllItems();
        for (Network network : system.getNetworkList()) {
            NetCob.addItem(network);
        }
    }
    private void populateResCob(Network network){
        ResCob.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if(enterprise.getEnterpriseType().getValue().equals("Store"))
            ResCob.addItem(enterprise);
        }
    }
    private void populateMenutable(Enterprise enterprise){
        DefaultTableModel model = (DefaultTableModel) menuJTable.getModel();
        model.setRowCount(0);
        for(Item d: enterprise.getMenu().getStockList()){
            Object[] row = new Object[2];
            row[0] = d;
            row[1] = d.getPrice();
            model.addRow(row);
        }
        
    }
     private void populateCartTable(){
        DefaultTableModel model = (DefaultTableModel) CartTable.getModel();
        model.setRowCount(0);
        
        for(Item d: l){
            Object[] row = new Object[2];
            row[0] = d;
            row[1] = d.getPrice();
            model.addRow(row);
            
            
        }
        
        txtCost.setText(String.valueOf(sum));
        
        
    }
    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = menuJTable.getSelectedRow();
        if (selectedRow >= 0) {
            //int selectionButton = JOptionPane.YES_NO_OPTION;
            //int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to update??", "Warning", selectionButton);
            //if (selectionResult == JOptionPane.YES_OPTION) {
                Item d= (Item) menuJTable.getValueAt(selectedRow, 0);
                
                l.add(d);
                sum+=d.getPrice();
                populateCartTable();
                
                
        }       
         
        else {
            JOptionPane.showMessageDialog(null, "Please select an item!!");
        }
        
        logr.info("Add to cart Button clicked");
    }//GEN-LAST:event_AddbtnActionPerformed

    private void NetCobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetCobActionPerformed
        // TODO add your handling code here:
         Network network = (Network) NetCob.getSelectedItem();
        if (network != null){
            populateResCob(network);
        }
        
    }//GEN-LAST:event_NetCobActionPerformed

    private void ResCobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResCobActionPerformed
        // TODO add your handling code here:
        StoreEnterprise enterprise = (StoreEnterprise) ResCob.getSelectedItem();
        if (enterprise != null){
            populateMenutable(enterprise);
        }
        
    }//GEN-LAST:event_ResCobActionPerformed

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        Network network = (Network) NetCob.getSelectedItem();
        StoreEnterprise enterprise = (StoreEnterprise) ResCob.getSelectedItem();
        
        DefaultTableModel model = (DefaultTableModel) CartTable.getModel(); 
        String address =txtAddress.getText();
        boolean empty =true;
        if(sum==0){
            JOptionPane.showMessageDialog(null, "Your Cart is Empty!!");
            empty=false;
            return;
        }
        if(address==null||address.equals("")){
            JOptionPane.showMessageDialog(null, "Address can't be Empty!!");
            empty=false;
            return;
        }
        else{
        Order order = system.getOrderDirectory().AddOrder();
        order.setNetwork(network);
        order.setSname(enterprise.getName());
        order.setCname(account.getUsername());
        order.setTotalItem(l);
        order.setStatus("Ordered");
        order.setAddress(address);
        order.setTotalPrice(sum);
        JOptionPane.showMessageDialog(null, "Your Order is Created Successfully!!");
        
        model.setRowCount(0);
        l= new ArrayList<>();
        txtAddress.setText("");
        txtCost.setText("");
        sum=0;
        }
        
        logr.info("Place Order Button clicked");
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        ViewOrderJPanel j =new ViewOrderJPanel(userProcessContainer,system, account);
        userProcessContainer.add("ViewOrderJPanel",j);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        logr.info("Order History Button clicked");
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = CartTable.getSelectedRow();

        if(selectedrow >=0)
        {
            Item  vs = (Item)CartTable.getValueAt(selectedrow,0);

            l.remove(vs);
            sum-=vs.getPrice();

            JOptionPane.showMessageDialog(null, "Item has been deleted!!");
            
        }
        else
        JOptionPane.showMessageDialog(null,"Please select an item first!! ");
        populateCartTable();
        
        logr.info("Delete item from cart Button clicked");
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTable CartTable;
    private javax.swing.JComboBox<Object> NetCob;
    private javax.swing.JComboBox<Object> ResCob;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuJTable;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCost;
    // End of variables declaration//GEN-END:variables
}
