/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFormaPagamento;
import java.util.ArrayList;
import model.ModelFormaPagamento;
import util.FormatadorMascara;

/**
 *
 * @author Rodrigo Sarmento
 */
public class TelaPagamentoPDV extends javax.swing.JDialog {
    ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
    ArrayList<ModelFormaPagamento> listaModelFormaPagamento = new ArrayList<>();
    ControllerFormaPagamento controllerFormaPagamento = new ControllerFormaPagamento();
    FormatadorMascara formatadorMascara = new FormatadorMascara();
    private float valorTotal;
    private float desconto;
    private float valorRecebido;
    private float troco;
    private String formaPagamento;
    private boolean pago;
    
    /**
     * Creates new form TelaPagamentoPDV
     */
    public TelaPagamentoPDV(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.listaFormaPagamento();
        this.pago = false;
        this.calcularPagamento();
        this.limparCampos();
        //centraliza a tela
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JFormattedTextField();
        txtDesconto = new javax.swing.JFormattedTextField();
        txtValorRecebido = new javax.swing.JFormattedTextField();
        boxPagamento = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblValorPagar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Forma de Pagamento:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Subtotal:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Desconto:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Valor Reccebido:");

        txtSubtotal.setEditable(false);
        txtSubtotal.setEnabled(false);
        txtSubtotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtDesconto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescontoFocusLost(evt);
            }
        });
        txtDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescontoActionPerformed(evt);
            }
        });

        txtValorRecebido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtValorRecebido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorRecebidoFocusLost(evt);
            }
        });
        txtValorRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorRecebidoActionPerformed(evt);
            }
        });

        boxPagamento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        boxPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPagamentoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Total a Pagar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        lblValorPagar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblValorPagar.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(lblValorPagar)
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblValorPagar)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setText("Troco:");

        txtTroco.setEditable(false);
        txtTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrocoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSubtotal)
                            .addComponent(txtDesconto)
                            .addComponent(txtValorRecebido)
                            .addComponent(boxPagamento, 0, 331, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusLost
        txtDesconto.setText(formatadorMascara.converterVirgulaParaPonto(txtDesconto.getText()));
        this.calcularPagamento();
    }//GEN-LAST:event_txtDescontoFocusLost

    private void txtValorRecebidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorRecebidoFocusLost
       txtValorRecebido.setText(formatadorMascara.converterVirgulaParaPonto(txtValorRecebido.getText()));
        this.calcularPagamento();
    }//GEN-LAST:event_txtValorRecebidoFocusLost

    private void boxPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPagamentoActionPerformed
        txtDesconto.requestFocus();
    }//GEN-LAST:event_boxPagamentoActionPerformed

    private void txtDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescontoActionPerformed
        txtValorRecebido.requestFocus();
    }//GEN-LAST:event_txtDescontoActionPerformed

    private void txtValorRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorRecebidoActionPerformed
        txtTroco.requestFocus();
    }//GEN-LAST:event_txtValorRecebidoActionPerformed

    private void txtTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrocoActionPerformed
                //Finaliza o pagamento
        this.desconto = Float.parseFloat(this.txtDesconto.getText());
        this.valorRecebido = Float.parseFloat(this.txtValorRecebido.getText());
        this.troco = Float.parseFloat(this.txtTroco.getText());
        this.valorTotal = Float.parseFloat(this.lblValorPagar.getText());
        this.formaPagamento = this.boxPagamento.getSelectedItem().toString();
        this.pago = true;
        dispose();
    }//GEN-LAST:event_txtTrocoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPagamentoPDV dialog = new TelaPagamentoPDV(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
/**
 * preenche combobox com todas as formas de pagamentos
 */
    private void listaFormaPagamento(){
        listaModelFormaPagamento = controllerFormaPagamento.getListaFormaPagamentoController();
        boxPagamento.removeAllItems();
        for(int i = 0 ; i<listaModelFormaPagamento.size();i++){
            boxPagamento.addItem(listaModelFormaPagamento.get(i).getDescricaoForPag());
        }
    }
    //calcula o valor total a pagar e o troco
    private void calcularPagamento(){
        float subtotal, desconto, recebido, pagar, troco;
        try{
            subtotal = Float.parseFloat(txtSubtotal.getText());
        }catch(Exception e){
            subtotal = 0;
        }
        
        try{
            desconto = Float.parseFloat(txtDesconto.getText());
        }catch(Exception e){
            desconto = 0;
            txtDesconto.setText("0");
        }
        try{
            recebido = Float.parseFloat(txtValorRecebido.getText());
        }catch(Exception e){
            recebido = 0;
            txtValorRecebido.setText("0");
        }
        //calcular valor a pagar
        pagar = subtotal - desconto;
        lblValorPagar.setText(formatadorMascara.arredondamentoDoubleComPontoDuasCasasString(pagar));
        //calculando o troco
        troco = recebido - pagar;
        
        txtTroco.setText(formatadorMascara.arredondamentoDoubleComPontoDuasCasasString(troco));
    }
    
    private void limparCampos(){
        txtDesconto.setText("0");
        txtValorRecebido.setText("0");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblValorPagar;
    private javax.swing.JFormattedTextField txtDesconto;
    private javax.swing.JFormattedTextField txtSubtotal;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JFormattedTextField txtValorRecebido;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the desconto
     */
    public float getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the valorRecebido
     */
    public float getValorRecebido() {
        return valorRecebido;
    }

    /**
     * @param valorRecebido the valorRecebido to set
     */
    public void setValorRecebido(float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    /**
     * @return the troco
     */
    public float getTroco() {
        return troco;
    }

    /**
     * @param troco the troco to set
     */
    public void setTroco(float troco) {
        this.troco = troco;
    }

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public void setTxtValorTotal(){
        this.txtSubtotal.setText(this.valorTotal+"");
    }

    /**
     * @return the pago
     */
    public boolean isPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(boolean pago) {
        this.pago = pago;
    }
}