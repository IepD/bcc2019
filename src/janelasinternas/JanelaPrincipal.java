/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelasinternas;

/**
 *
 * @author Laboratorio
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
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

        areaDeTrabalho1 = new janelasinternas.AreaDeTrabalho();
        mnuBar = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        mnuCadCliente = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(areaDeTrabalho1, java.awt.BorderLayout.CENTER);

        mnuCadastro.setText("Cadastro");

        mnuCadCliente.setText("Cliente");
        mnuCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadClienteActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadCliente);

        mnuBar.add(mnuCadastro);

        mnuConsulta.setText("Consulta");
        mnuBar.add(mnuConsulta);

        setJMenuBar(mnuBar);

        setSize(new java.awt.Dimension(559, 435));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadClienteActionPerformed

        areaDeTrabalho1.abrirCadastroCliente();

    }//GEN-LAST:event_mnuCadClienteActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private janelasinternas.AreaDeTrabalho areaDeTrabalho1;
    private javax.swing.JMenuBar mnuBar;
    private javax.swing.JMenuItem mnuCadCliente;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenu mnuConsulta;
    // End of variables declaration//GEN-END:variables
}
