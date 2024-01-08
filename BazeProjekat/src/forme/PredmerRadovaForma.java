/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forme;

import domen.PodtipRadova;
import domen.Predmer;
import domen.StavkaPodtipaRadova;
import domen.TipRadova;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logika.Kontroler;
import modelTabele.PodtipRadovaModelTabele;
import modelTabele.PredmerModelTabele;
import modelTabele.StavkaPodtipaRadovaModelTabele;
import modelTabele.TipRadovaModelTabele;

/**
 *
 * @author Korisnik
 */
public class PredmerRadovaForma extends javax.swing.JDialog {

    private TipRadova trGlobal = null;
    private PodtipRadova ptrGlobal = null;

    /**
     * Creates new form PredmerRadovaForma
     */
    public PredmerRadovaForma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        spremiFormu();
        designTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        panelHeader = new javax.swing.JPanel();
        lblLegalEntityText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPredmer = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStavka = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPodtip = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTipRadova = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnPrikaziPodtip = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Predmeri radova");

        panelHeader.setBackground(new java.awt.Color(45, 118, 232));

        lblLegalEntityText.setBackground(new java.awt.Color(45, 118, 232));
        lblLegalEntityText.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblLegalEntityText.setForeground(new java.awt.Color(255, 255, 255));
        lblLegalEntityText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLegalEntityText.setText("PREDMERI RADOVA");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblLegalEntityText, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(850, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblLegalEntityText)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblPredmer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPredmer);

        tblStavka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblStavka);

        tblPodtip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblPodtip);

        tblTipRadova.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblTipRadova);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Predmer radova:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tip radova:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Stavka podtipa radova:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Podtip radova:");

        jButton1.setText("Prikazi tip rada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Prikazi stavke podtipa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ažuriraj Tipradova");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnPrikaziPodtip.setText("Prikazi podtipove rada");
        btnPrikaziPodtip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziPodtipActionPerformed(evt);
            }
        });

        jButton5.setText("Ažuriraj Podtip radova");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Dodaj Podtip radova");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Obriši Podtip radova");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("Ažuriraj Stavku");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Dodaj Stavku");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Obriši Stavku");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton8.setText("Dodaj jedinicu mere");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton4.setText("Ažuriraj Podtip CENA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton12.setText("Ažuriraj Stavku NAZIV");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPrikaziPodtip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnPrikaziPodtip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton12)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton11)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int red = tblPodtip.getSelectedRow();
        if (red == -1) {
            JOptionPane.showMessageDialog(this, "Morate izabrati Podtip radova!");
            return;
        }
        PodtipRadovaModelTabele pmt = (PodtipRadovaModelTabele) tblPodtip.getModel();
        PodtipRadova p = pmt.returnObject(red);
        ptrGlobal = p;
        prikaziStavkaPodtipRadova(p);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        final int selectedRow = tblTipRadova.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Morate izabrati Tip radova koji želite da izmenite!");
            return;
        }
        TipRadovaModelTabele trmt = (TipRadovaModelTabele) tblTipRadova.getModel();
        TipRadova tr = trmt.returnObject(selectedRow);

        AzuriranjeTipaRadovaForma at = new AzuriranjeTipaRadovaForma(this, tr, true);
        at.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnPrikaziPodtipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziPodtipActionPerformed
        int red = tblTipRadova.getSelectedRow();
        if (red == -1) {
            JOptionPane.showMessageDialog(this, "Morate izabrati Tip radova!");
            return;
        }
        TipRadovaModelTabele pmt = (TipRadovaModelTabele) tblTipRadova.getModel();
        TipRadova p = pmt.returnObject(red);
        trGlobal = p;
        prikaziPodtipRadova(p);
    }//GEN-LAST:event_btnPrikaziPodtipActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        final int selectedRow = tblPodtip.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Morate izabrati Podtip radova koji želite da izmenite!");
            return;
        }
        PodtipRadovaModelTabele prmt = (PodtipRadovaModelTabele) tblPodtip.getModel();
        PodtipRadova pr = prmt.returnObject(selectedRow);

        AzurirajPodtipRadovaForma df = new AzurirajPodtipRadovaForma(this, pr, true);
        df.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DodajPodtipRadovaForma dp = new DodajPodtipRadovaForma(this, true);
        dp.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        final int selectedRow = tblPodtip.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Morate izabrati Podtip radova koji želite da obrišete!", "Greška", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int odgovor = JOptionPane.showConfirmDialog(this, "Da li ste sigurni?", "Potvrda", JOptionPane.YES_NO_OPTION);
        PodtipRadovaModelTabele prmt = (PodtipRadovaModelTabele) tblPodtip.getModel();
        PodtipRadova pr = prmt.returnObject(selectedRow);
        if (odgovor == JOptionPane.YES_OPTION) {
            Kontroler.getInstanca().deletePodtipRadova(pr.getPodtipRadovaId());
            prmt.remove(selectedRow);
            prikaziPodtipRadova(trGlobal);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        final int selectedRow = tblStavka.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Morate izabrati Stavku podtipa radova koji želite da izmenite!");
            return;
        }
        StavkaPodtipaRadovaModelTabele sptr = (StavkaPodtipaRadovaModelTabele) tblStavka.getModel();
        StavkaPodtipaRadova spr = sptr.returnObject(selectedRow);

        AzurirajStavkuPodtipaRadovaForma ds = new AzurirajStavkuPodtipaRadovaForma(this, spr, true);
        ds.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        DodajStavkuPodtipaRadovaForma ds = new DodajStavkuPodtipaRadovaForma(this, true);
        ds.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        final int selectedRow = tblStavka.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Morate izabrati Stavku podtipa radova koju želite da obrišete", "Greška", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int odgovor = JOptionPane.showConfirmDialog(this, "Da li ste sigurni?", "Potvrda", JOptionPane.YES_NO_OPTION);
        StavkaPodtipaRadovaModelTabele sprmt = (StavkaPodtipaRadovaModelTabele) tblStavka.getModel();
        StavkaPodtipaRadova spr = sprmt.returnObject(selectedRow);
        if (odgovor == JOptionPane.YES_OPTION) {
            Kontroler.getInstanca().deleteStavkaPodtipaRadova(spr.getStavkaId());
            sprmt.remove(selectedRow);
            prikaziPodtipRadova(trGlobal);
            prikaziStavkaPodtipRadova(ptrGlobal);

        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DodajJedinicuMereForma df = new DodajJedinicuMereForma(this, true);
        df.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int red = tblPredmer.getSelectedRow();
        if (red == -1) {
            JOptionPane.showMessageDialog(this, "Morate izabrati predmer!");
            return;
        }
        PredmerModelTabele pmt = (PredmerModelTabele) tblPredmer.getModel();
        Predmer p = pmt.returnObject(red);
        prikaziTipRadova(p);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        final int selectedRow = tblPodtip.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Morate izabrati Podtip radova koji želite da izmenite!");
            return;
        }
        PodtipRadovaModelTabele prmt = (PodtipRadovaModelTabele) tblPodtip.getModel();
        PodtipRadova pr = prmt.returnObject(selectedRow);

        AzurirajPodtipRadovaCENAForma df = new AzurirajPodtipRadovaCENAForma(this, pr, true);
        df.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        final int selectedRow = tblStavka.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Morate izabrati Stavku podtipa radova koji želite da izmenite!");
            return;
        }
        StavkaPodtipaRadovaModelTabele sptr = (StavkaPodtipaRadovaModelTabele) tblStavka.getModel();
        StavkaPodtipaRadova spr = sptr.returnObject(selectedRow);

        AzurirajStavkuPodtipaRadovaNAZIVForma ds = new AzurirajStavkuPodtipaRadovaNAZIVForma(this, spr, true);
        ds.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrikaziPodtip;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblLegalEntityText;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tblPodtip;
    private javax.swing.JTable tblPredmer;
    private javax.swing.JTable tblStavka;
    private javax.swing.JTable tblTipRadova;
    // End of variables declaration//GEN-END:variables
    public void spremiFormu() {
        tblPredmer.setModel(new PredmerModelTabele(Kontroler.getInstanca().getAllPredmer()));
    }

    public void prikaziTipRadova(Predmer p) {
        ArrayList<TipRadova> lista = Kontroler.getInstanca().vratiTipoveRadovaPoPredmeru(p);
        tblTipRadova.setModel(new TipRadovaModelTabele(lista));
    }

    public void prikaziPodtipRadova(TipRadova p) {
        ArrayList<PodtipRadova> lista = Kontroler.getInstanca().vratiPodtipoveRadovaPoTipu(p);
        tblPodtip.setModel(new PodtipRadovaModelTabele(lista));
    }

    public void prikaziStavkaPodtipRadova(PodtipRadova p) {
        ArrayList<StavkaPodtipaRadova> lista = Kontroler.getInstanca().vratiStavkePodtipoveRadovaPoPodtipu(p);
        tblStavka.setModel(new StavkaPodtipaRadovaModelTabele(lista));
    }

    private void designTable() {
        tblPredmer.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 15));
        tblPredmer.getTableHeader().setOpaque(false);
        tblPredmer.getTableHeader().setBackground(new Color(32, 136, 203));
        tblPredmer.getTableHeader().setForeground(new Color(255, 255, 255));
        tblPredmer.setRowHeight(25);

        tblPodtip.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 15));
        tblPodtip.getTableHeader().setOpaque(false);
        tblPodtip.getTableHeader().setBackground(new Color(32, 136, 203));
        tblPodtip.getTableHeader().setForeground(new Color(255, 255, 255));
        tblPodtip.setRowHeight(25);

        tblStavka.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 15));
        tblStavka.getTableHeader().setOpaque(false);
        tblStavka.getTableHeader().setBackground(new Color(32, 136, 203));
        tblStavka.getTableHeader().setForeground(new Color(255, 255, 255));
        tblStavka.setRowHeight(25);

        tblTipRadova.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 15));
        tblTipRadova.getTableHeader().setOpaque(false);
        tblTipRadova.getTableHeader().setBackground(new Color(32, 136, 203));
        tblTipRadova.getTableHeader().setForeground(new Color(255, 255, 255));
        tblTipRadova.setRowHeight(25);

    }
}
