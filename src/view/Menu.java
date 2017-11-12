/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteDAO;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author brunodepaulo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuCadProdutos = new javax.swing.JMenuItem();
        jMenuCadClientes = new javax.swing.JMenuItem();
        jMenuCadFornecedores = new javax.swing.JMenuItem();
        jMenuGerenciar = new javax.swing.JMenu();
        jMenuGerProdutos = new javax.swing.JMenuItem();
        jMenuGerClientes = new javax.swing.JMenuItem();
        jMenuGerFornecedores = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("Sistema de Farmácia");

        jLabel2.setText("Por:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Lucas Andrade de Oliveira Reis");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Bruno de Paulo Giroto");

        jMenuCadastrar.setText("Cadastrar");

        jMenuCadProdutos.setText("Produtos");
        jMenuCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadProdutosActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuCadProdutos);

        jMenuCadClientes.setText("Clientes");
        jMenuCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadClientesActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuCadClientes);

        jMenuCadFornecedores.setText("Fornecedores");
        jMenuCadFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadFornecedoresActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuCadFornecedores);

        jMenuBar1.add(jMenuCadastrar);

        jMenuGerenciar.setText("Gerenciar");

        jMenuGerProdutos.setText("Produtos");
        jMenuGerProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerProdutosActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuGerProdutos);

        jMenuGerClientes.setText("Clientes");
        jMenuGerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerClientesActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuGerClientes);

        jMenuGerFornecedores.setText("Fornecedores");
        jMenuGerFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerFornecedoresActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuGerFornecedores);

        jMenuBar1.add(jMenuGerenciar);

        jMenuAjuda.setText("Ajuda");
        jMenuBar1.add(jMenuAjuda);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadProdutosActionPerformed
        // TODO add your handling code here:
        try{
            CadastroProduto cadastroProduto = new CadastroProduto();
            cadastroProduto.setVisible(true);
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jMenuCadProdutosActionPerformed

    private void jMenuGerProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerProdutosActionPerformed
        // TODO add your handling code here:
        try{
            GerenciaProdutos atualizaProdutos = new GerenciaProdutos();
            atualizaProdutos.setVisible(true);
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jMenuGerProdutosActionPerformed

    private void jMenuGerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerClientesActionPerformed
        // TODO add your handling code here:
        try{
            GerenciaCliente atualizaCliente = new GerenciaCliente();
            atualizaCliente.setVisible(true);
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jMenuGerClientesActionPerformed

    private void jMenuGerFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerFornecedoresActionPerformed
        // TODO add your handling code here:
        try{
            GerenciaFornecedor atualizaFornecedor = new GerenciaFornecedor();
            atualizaFornecedor.setVisible(true);
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jMenuGerFornecedoresActionPerformed

    private void jMenuCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadClientesActionPerformed
        // TODO add your handling code here:
        try{
            CadastroCliente cadastroCliente = new CadastroCliente();
            cadastroCliente.setVisible(true);
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jMenuCadClientesActionPerformed

    private void jMenuCadFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadFornecedoresActionPerformed
        // TODO add your handling code here:
        try{
            CadastroFornecedor cadastroFornecedor = new CadastroFornecedor();
            cadastroFornecedor.setVisible(true);
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jMenuCadFornecedoresActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadClientes;
    private javax.swing.JMenuItem jMenuCadFornecedores;
    private javax.swing.JMenuItem jMenuCadProdutos;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuGerClientes;
    private javax.swing.JMenuItem jMenuGerFornecedores;
    private javax.swing.JMenuItem jMenuGerProdutos;
    private javax.swing.JMenu jMenuGerenciar;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
