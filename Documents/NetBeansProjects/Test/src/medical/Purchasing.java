/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;
import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static medical.DBconnector.getConnection;
/**
 *
 * @author Asus
 */
public class Purchasing extends javax.swing.JFrame implements KeyListener {

    ResultSet rs=null;
    Connection con=null;
    Statement st=null;
    
public Purchasing() {
        initComponents();
        suppliername();
        productname();
    }
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        supplier_mobile = new javax.swing.JTextField();
        supplier_name = new javax.swing.JComboBox<>();
        supplier_address = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        supplier_gstno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        purchase_invoice_num = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        product_name = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        product_quantity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        product_landingcost = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        product_sellingcost = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        discount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        product_gst = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        total_product_price = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        product_batchno = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        product_hsnno = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        invoice_date = new org.jdesktop.swingx.JXDatePicker();
        product_expire_date = new org.jdesktop.swingx.JXDatePicker();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        discount_amount = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cgst_amount = new javax.swing.JTextField();
        sgst_amount = new javax.swing.JTextField();
        igst_amount = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        gross_amount = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        net_amount = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Supplier Name");

        jLabel2.setText("Mobile No");

        supplier_name.setEditable(true);
        supplier_name.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                supplier_namePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        supplier_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier_nameActionPerformed(evt);
            }
        });

        jLabel3.setText("Address");

        jLabel4.setText("GST No");

        jLabel5.setText("Invoice Date");

        jLabel6.setText("Invoice No");

        jLabel7.setText("Product Name");

        product_name.setEditable(true);
        product_name.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                product_namePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        product_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_nameActionPerformed(evt);
            }
        });

        jLabel8.setText("Quantity ");

        product_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });
        product_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_quantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                product_quantityKeyReleased(evt);
            }
        });

        jLabel9.setText("Price");

        jLabel10.setText("Mrp");

        jLabel11.setText("Discount %");

        discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                discountKeyPressed(evt);
            }
        });

        jLabel12.setText("GST");

        product_gst.setEditable(true);
        product_gst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "12", "18" }));
        product_gst.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                product_gstPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        product_gst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_gstActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Add Purchase");

        jLabel20.setText("Total Product Price");

        jLabel23.setText("Batch No");

        product_batchno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_batchnoActionPerformed(evt);
            }
        });

        jLabel21.setText("ExpDate");

        jLabel22.setText("HSN No");

        product_hsnno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_hsnnoActionPerformed(evt);
            }
        });

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel20))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(supplier_gstno)
                                .addComponent(supplier_name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(product_name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(total_product_price, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel8))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(product_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(product_batchno, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(product_landingcost, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(product_sellingcost, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(product_hsnno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(product_expire_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(supplier_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(invoice_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(supplier_address, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purchase_invoice_num, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(product_gst, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(save)
                                        .addGap(38, 38, 38)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplier_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(supplier_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(supplier_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(supplier_gstno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(invoice_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(purchase_invoice_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(product_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(product_landingcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(product_sellingcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(product_gst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product_hsnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(total_product_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(product_batchno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(jLabel21)
                        .addComponent(product_expire_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SI", "PRODUCTNAME", "QUANTITY", "HSN NO", "BATCH NO", "PRICE", "MRP"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );

        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel14.setText("Discount Amount");

        jLabel15.setText("CGST");

        jLabel16.setText("SGST");

        jLabel17.setText("IGST");

        jLabel18.setText("Grand Total");

        jLabel19.setText("Net Amount");

        jButton1.setText("submit");

        print.setText("print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jButton1)
                .addGap(83, 83, 83)
                .addComponent(print)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(print))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(319, 319, 319)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)))
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cgst_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(sgst_amount)
                            .addComponent(igst_amount))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel14))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(net_amount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(discount_amount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gross_amount, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(cgst_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gross_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sgst_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(discount_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(igst_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(net_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supplier_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier_nameActionPerformed
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_supplier_nameActionPerformed

    public void suppliername(){
   
    
    try{
        
        con=getConnection();
        st=con.createStatement();
        rs=st.executeQuery("select supplier_name from supplier");
    
    while(rs.next()){
       String name=rs.getString("supplier_name");
       supplier_name.addItem(name);
        }
     }
    catch(Exception e){
    }
   
    finally {
        try {
            st.close();
            rs.close();
            con.close();
            }
        catch (Exception e) {
            }
     }
    }
    
    public void productname(){
    
    try{
    con=getConnection();
    st=con.createStatement();
    rs=st.executeQuery("select product_name from productdetails");
    
    while(rs.next()){
       String name=rs.getString("product_name");
       product_name.addItem(name);
     }
    
    }catch(Exception e){
    }
   
         finally {
            try {
                st.close();
                rs.close();
                con.close();
            } catch (Exception e) {
        }
    
    }
    }
    
    
    private void product_gstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_gstActionPerformed
        // TODO add your handling code here:
          int gst=Integer.parseInt(product_gst.getSelectedItem().toString());
        
    }//GEN-LAST:event_product_gstActionPerformed

    private void product_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_nameActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_product_nameActionPerformed

    private void supplier_namePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_supplier_namePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        //String s11=cb1.getSelectedItem();
        Connection con=null;
        String sql="select * from supplier where supplier_name=?";
        PreparedStatement ps=null;
    
    try{
        
        con=getConnection();
        ps=con.prepareStatement(sql);
        ps.setString(1,(String)supplier_name.getSelectedItem());
        ResultSet rs=ps.executeQuery();
    
    while(rs.next()){
            supplier_mobile.setText(rs.getString("supplier_mobile"));
            supplier_address.setText(rs.getString("supplier_address"));
            supplier_gstno.setText(rs.getString("supplier_gstno"));
            
         
        }
        
       }
    catch(Exception e){}
        
    }//GEN-LAST:event_supplier_namePopupMenuWillBecomeInvisible

    private void product_namePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_product_namePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Connection con=null;
        String sql="select * from productdetails where product_name=?";
        PreparedStatement ps=null;
    
    try{
        
        con=getConnection();
        ps=con.prepareStatement(sql);
        ps.setString(1,(String)product_name.getSelectedItem());
        ResultSet rs=ps.executeQuery();
        

    while(rs.next()){
            
            product_quantity.setText(rs.getString("product_quantity"));
            product_landingcost.setText(rs.getString("product_landingcost"));
            product_sellingcost.setText(rs.getString("product_sellingcost"));
            product_batchno.setText(rs.getString("product_batchno"));
            product_hsnno.setText(rs.getString("product_hsnno"));
            discount.setText(rs.getString("discount"));
            
        }     
    }
    
    catch(Exception e){}
        
    }//GEN-LAST:event_product_namePopupMenuWillBecomeInvisible

    
    
     
    
    private void product_quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_quantityKeyPressed
        // TODO add your handling code here:
         
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                     
            String quantity=product_quantity.getText();
            int productquantity=Integer.parseInt(quantity);
            System.out.println(productquantity);
            
            String price=product_landingcost.getText();
            int productprice=Integer.parseInt(price);
            System.out.println(productprice);
            float total=productquantity*productprice;
            total_product_price.setText(""+total);

         }
      
    }//GEN-LAST:event_product_quantityKeyPressed

    
    
    
    
    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
     
     
// TODO add your handling code here:
    }//GEN-LAST:event_none

    private void product_batchnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_batchnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_batchnoActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        
        try{        
        Connection con=getConnection();
        String update="update stock set item_quantity=item_quantity+'"+product_quantity.getText()+"' where item_name='"+product_name.getSelectedItem()+"'";
        PreparedStatement ps2=con.prepareStatement(update);
        ps2.executeUpdate();
        
        String insert="insert into purchase(supplier_name,supplier_mobile,supplier_address,supplier_gstno,pur_invoice_date,pur_invoice_num) values(?,?,?,?,?,?)";
         
         
         //String insert_item="insert into purchase(supplier_name,supplier_mobile,supplier_address,supplier_gstno,pur_invoice_date,pur_invoice_num) values(?,?,?,?,?,?)";         
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setString(1,supplier_name.getSelectedItem().toString());
        ps.setString(2,supplier_mobile.getText());
        ps.setString(3,supplier_address.getText());
        ps.setString(4,supplier_gstno.getText());
        ps.setString(5,invoice_date.getDate().toString());
        ps.setString(6,purchase_invoice_num.getText());
        
        ps.executeUpdate();
        System.out.println("data inserted...");
        ps.close();

        String insert_item="insert into purchase_item1(purchase_invoice_num,item_name,item_quantity,item_price,item_mrp,hsnno,batchno,discount,tax)values(?,?,?,?,?,?,?,?,?)";         
        
        PreparedStatement ps1=con.prepareStatement(insert_item);
        String invoice=purchase_invoice_num.getText();
        ps1.setString(1,purchase_invoice_num.getText());
        ps1.setString(2,product_name.getSelectedItem().toString());
        ps1.setString(3,product_quantity.getText());
        ps1.setString(4,product_landingcost.getText());
        ps1.setString(5,product_sellingcost.getText());
        ps1.setString(6,product_hsnno.getText());
        ps1.setString(7,product_batchno.getText());
        ps1.setString(8,discount.getText());
        ps1.setString(9,product_gst.getSelectedItem().toString());
       
        
        int inserted=ps1.executeUpdate();
       
        System.out.println("data inserted...");
        
        if(inserted>0){
          Object row[]=new Object[20];
       
           getFieldCal(); 
       // int a=Integer.parseInt(item_quantity.getText());
        //int b=Integer.parseInt(item_price.getText());
          
          //double g_amount=(a*b);
          //double cgst=((a*b)/100)*6;
          //double sgst=((a*b)/100)*6;
          //double igst=((a*b)/100)*12;
          //double total=cgst+sgst+((a*b)-((a*b)/100)*4);
          row[0]="1";
          row[1]=product_name.getSelectedItem().toString();
          row[2]=product_quantity.getText();
          row[3]=product_hsnno.getText();
          row[4]=product_batchno.getText();
          row[5]=product_landingcost.getText();
          row[6]=product_sellingcost.getText();
          row[8]="cgst";
          row[9]="sgst";
          row[10]="igst";
          row[11]=total;
          model.addRow(row);
          
        }
         
        
       
        }
        catch(Exception e){
        }
        
    }//GEN-LAST:event_saveActionPerformed

    private void product_hsnnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_hsnnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_hsnnoActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        
        PrinterJob printJob = PrinterJob.getPrinterJob();
        try {
            printJob.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Purchasing.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (printJob.printDialog())
        try {
        printJob.print();
        } catch(PrinterException pe) {
        System.out.println("Error printing: " + pe);
        }

    }//GEN-LAST:event_printActionPerformed

    
    private void discountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyPressed
        // TODO add your handling code here:
    if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
    
        String discount1=discount.getText();
        int discount12=Integer.parseInt(discount1);
       
        String totalprice=total_product_price.getText();
        float totalprice1=Float.parseFloat(totalprice);
       
        float afterdiscountprice=(totalprice1*discount12)/100;
        float afterdiscountproductprice=totalprice1-afterdiscountprice;
        
        total_product_price.setText(""+afterdiscountproductprice);
    }
        
    }//GEN-LAST:event_discountKeyPressed

    private void product_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_quantityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_product_quantityKeyReleased

    private void product_gstPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_product_gstPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        String productgst=(String)product_gst.getSelectedItem();
        
        
        int productgst1=Integer.parseInt(productgst);
       
        System.out.println(productgst1);
        
        String totalprice=total_product_price.getText();
        float totalprice1=Float.parseFloat(totalprice);
       
        float gstpriceonproduct=(totalprice1*productgst1)/100;
        
        System.out.println(gstpriceonproduct);
        
        float aftergstproductprice=totalprice1+gstpriceonproduct;
        
        total_product_price.setText(""+aftergstproductprice);
        
        
        
        
        
    }//GEN-LAST:event_product_gstPopupMenuWillBecomeInvisible
 
    
        public String total;
        public void commonMethod(String query){
        
        try{
                
           Connection con=getConnection();
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery(query);
           
           if(rs.next()){
           total=rs.getString(1);
            }
          }catch(Exception e){}
        
        }

    
    
     public void getFieldCal(){
     
     try{ 
      commonMethod("select sum(item_price*item_quantity) from purchase_item1 where purchase_invoice_num='"+purchase_invoice_num.getText()+"'");
      gross_amount.setText(total);
      
     
     }catch(Exception e){}
     
     try{ 
      commonMethod("select sum(((item_price*item_quantity)/100)*discount) from purchase_item1 where purchase_invoice_num='"+purchase_invoice_num.getText()+"'");
      discount_amount.setText(total);
      
     
     }catch(Exception e){}
     
     try{ 
      commonMethod("select sum(((((item_price*item_quantity)-((item_price*item_quantity)/100)*4)*tax)/100)/2)  from purchase_item1 where purchase_invoice_num='"+purchase_invoice_num.getText()+"'");
      cgst_amount.setText(total);
      
     }catch(Exception e){}
     
     try{ 
      commonMethod("select sum(((((item_price*item_quantity)-((item_price*item_quantity)/100)*4)*tax)/100)/2)  from purchase_item1 where purchase_invoice_num='"+purchase_invoice_num.getText()+"'");
      sgst_amount.setText(total);
      
     }catch(Exception e){}
     
    try{ 
    commonMethod("select sum((((item_price*item_quantity)-((item_price*item_quantity)/100)*4)*tax)/100)  from purchase_item1 where purchase_invoice_num='"+purchase_invoice_num.getText()+"'");
    igst_amount.setText(total);
    }catch(Exception e){}
     
    try{ 
    commonMethod("select sum(((item_price*item_quantity)-((item_price*item_quantity)/100)*4)+(((((item_price*item_quantity)-((item_price*item_quantity)/100)*4)*tax)/100)))  from purchase_item1 where purchase_invoice_num='"+purchase_invoice_num.getText()+"'");
   // String total;
     //    total=gross_amount.getText()-discount_amount.getText()+cgst_amount.getText()+sgst_amount.getText();
    net_amount.setText(total);
    
    }catch(Exception e){}
      
     
     }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Purchasing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchasing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchasing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchasing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchasing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cgst_amount;
    private javax.swing.JTextField discount;
    private javax.swing.JTextField discount_amount;
    private javax.swing.JTextField gross_amount;
    private javax.swing.JTextField igst_amount;
    private org.jdesktop.swingx.JXDatePicker invoice_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField net_amount;
    private javax.swing.JButton print;
    private javax.swing.JTextField product_batchno;
    private org.jdesktop.swingx.JXDatePicker product_expire_date;
    private javax.swing.JComboBox<String> product_gst;
    private javax.swing.JTextField product_hsnno;
    private javax.swing.JTextField product_landingcost;
    private javax.swing.JComboBox<String> product_name;
    private javax.swing.JTextField product_quantity;
    private javax.swing.JTextField product_sellingcost;
    private javax.swing.JTextField purchase_invoice_num;
    private javax.swing.JButton save;
    private javax.swing.JTextField sgst_amount;
    private javax.swing.JTextField supplier_address;
    private javax.swing.JTextField supplier_gstno;
    private javax.swing.JTextField supplier_mobile;
    private javax.swing.JComboBox<String> supplier_name;
    private javax.swing.JTextField total_product_price;
    // End of variables declaration//GEN-END:variables

    
}
