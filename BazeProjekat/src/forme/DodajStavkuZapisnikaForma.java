/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forme;

import domen.Kompanija;
import domen.Radnik;
import domen.StavkaZapisnika;
import domen.Zapisnik;
import java.awt.Dialog;
import java.math.BigDecimal;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import logika.Kontroler;
import model.Pib;
import model.UkupnaCena;

/**
 *
 * @author Korisnik
 */
public class DodajStavkuZapisnikaForma extends javax.swing.JDialog {

    /**
     * Creates new form DodajStavkuZapisnikaForma
     */
    public DodajStavkuZapisnikaForma(Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        popuniKompanije();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdcDateFrom = new com.toedter.calendar.JDateChooser();
        panelHeader = new javax.swing.JPanel();
        lblLegalEntityText = new javax.swing.JLabel();
        lblLegalEntityText1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtzapisnikid = new javax.swing.JTextField();
        txtstavkaid = new javax.swing.JTextField();
        txtOpcija = new javax.swing.JTextField();
        jdcDateFrom1 = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCena = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnaziv = new javax.swing.JTextField();
        jdcDateFrom2 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtPDV = new javax.swing.JTextField();
        cmbKomp = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Zapsinik");

        panelHeader.setBackground(new java.awt.Color(45, 118, 232));

        lblLegalEntityText.setBackground(new java.awt.Color(45, 118, 232));
        lblLegalEntityText.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblLegalEntityText.setForeground(new java.awt.Color(255, 255, 255));
        lblLegalEntityText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLegalEntityText.setText("DODAJ");

        lblLegalEntityText1.setBackground(new java.awt.Color(45, 118, 232));
        lblLegalEntityText1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblLegalEntityText1.setForeground(new java.awt.Color(255, 255, 255));
        lblLegalEntityText1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLegalEntityText1.setText("STAVKU ZAPISNIKA");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(lblLegalEntityText1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(lblLegalEntityText, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 126, Short.MAX_VALUE))))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblLegalEntityText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLegalEntityText1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Zapisnik ID:");

        jLabel2.setText("Stavka ID:");

        jLabel3.setText("Cena bez PDv-a:");

        jLabel4.setText("Opicja ponude:");

        jLabel5.setText("Garantni rok:");

        jLabel6.setText("Kompanija:");

        txtzapisnikid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtzapisnikidActionPerformed(evt);
            }
        });

        txtstavkaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstavkaidActionPerformed(evt);
            }
        });

        jButton1.setText("Sačuvaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Otakži");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Rok za obavljanje:");

        txtCena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCenaActionPerformed(evt);
            }
        });

        jLabel8.setText("Naziv kompanije:");

        txtnaziv.setEditable(false);
        txtnaziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnazivActionPerformed(evt);
            }
        });

        jLabel9.setText("PDV:");

        txtPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPDVActionPerformed(evt);
            }
        });

        cmbKomp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(129, 129, 129)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtzapisnikid, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtstavkaid, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnaziv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOpcija)
                                    .addComponent(jdcDateFrom2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdcDateFrom1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(cmbKomp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(72, 72, 72)
                        .addComponent(jButton2)
                        .addGap(33, 33, 33)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtzapisnikid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtstavkaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtnaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcDateFrom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtOpcija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jdcDateFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbKomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtzapisnikidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtzapisnikidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtzapisnikidActionPerformed

    private void txtstavkaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstavkaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstavkaidActionPerformed

    private void txtCenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCenaActionPerformed

    private void txtnazivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnazivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnazivActionPerformed

    private void txtPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPDVActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtCena.getText().isEmpty() || txtOpcija.getText().isEmpty() || txtPDV.getText().isEmpty() || txtzapisnikid.getText().isEmpty() || txtstavkaid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Morate popuniti sva polja!");
            return;
        }
        if (jdcDateFrom2.getDate() == null || jdcDateFrom1.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Morate popuniti datume!");

            return;
        }
        StavkaZapisnika sz = new StavkaZapisnika();
        int zapisnikID = Integer.parseInt(txtzapisnikid.getText());
        Zapisnik z = new Zapisnik();
        z.setId(zapisnikID);
        sz.setZapisnikId(z);
        sz.setStavkaId(Integer.parseInt(txtstavkaid.getText()));
        sz.setOpcijaPonude(Integer.parseInt(txtOpcija.getText()));
        Date garantnirok = jdcDateFrom1.getDate();
        sz.setGarantniRok(garantnirok.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

        Date rokZaObavljanje = jdcDateFrom2.getDate();
        sz.setRokZaObavljanje(rokZaObavljanje.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

        UkupnaCena cena = new UkupnaCena();
        BigDecimal pdv = new BigDecimal(txtPDV.getText());
        BigDecimal vrednost = new BigDecimal(txtCena.getText());
        BigDecimal ukupno = (pdv.multiply(vrednost)).add(vrednost);
        cena.setUkupna_cena(ukupno);
        cena.setPdv(pdv);
        cena.setVrednost(vrednost);
        sz.setVrednost(cena);

        Kompanija k = new Kompanija();
        k = (Kompanija) cmbKomp.getSelectedItem();
        //k.setId(Integer.parseInt(txtKomp.getText()));
        //   k.setNaziv(txtnaziv.getText());
        sz.setKompanija(k);

        boolean uspesno = Kontroler.getInstanca().insertStavkaZapsinika(sz);
        if (uspesno) {
            JOptionPane.showMessageDialog(this, "Uspesno ste dodali Stavku zapisnika");
            ZapisniciForma zf = (ZapisniciForma) this.getParent();
            zf.srediformu();
            Zapisnik za = Kontroler.getInstanca().vratiZapisnikPoStavki(sz);
            zf.PrikazStavki(za);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Greska pri dodavanju Stavke zapisnika");
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbKomp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jdcDateFrom;
    private com.toedter.calendar.JDateChooser jdcDateFrom1;
    private com.toedter.calendar.JDateChooser jdcDateFrom2;
    private javax.swing.JLabel lblLegalEntityText;
    private javax.swing.JLabel lblLegalEntityText1;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField txtCena;
    private javax.swing.JTextField txtOpcija;
    private javax.swing.JTextField txtPDV;
    private javax.swing.JTextField txtnaziv;
    private javax.swing.JTextField txtstavkaid;
    private javax.swing.JTextField txtzapisnikid;
    // End of variables declaration//GEN-END:variables
    private void popuniKompanije() {

        ArrayList<Kompanija> kompanije = Kontroler.getInstanca().getAllKompanija();

        cmbKomp.removeAllItems();

        for (Kompanija k : kompanije) {
            cmbKomp.addItem(k);
        }
    }

}