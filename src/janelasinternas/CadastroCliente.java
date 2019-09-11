/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelasinternas;

import java.util.ArrayList;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.JTableBinding.ColumnBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author Laboratorio
 */
public class CadastroCliente extends javax.swing.JInternalFrame {

    private List<Cliente> lstClientes;
    
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        lstClientes = new ArrayList<>();
        lstClientes = ObservableCollections.observableList(lstClientes);
        
        initComponents();
        
        BindingGroup bg = new BindingGroup();
        
        JTableBinding tb = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                lstClientes, tbClientes);
        ColumnBinding cb = tb.addColumnBinding(BeanProperty.create("nome"));
        cb.setColumnName("Nome do Cliente");
        cb = tb.addColumnBinding(BeanProperty.create("endereco"));
        cb.setColumnName("Endereço");
        cb = tb.addColumnBinding(BeanProperty.create("datanascimento"));
        cb.setColumnName("Data Nascimento");
        cb.setColumnClass(java.util.Date.class);
        bg.addBinding(tb);
        
        Binding b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, 
                tbClientes, 
                BeanProperty.create("selectedElement.nome"), 
                txtNome, 
                BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, 
                tbClientes, 
                BeanProperty.create("selectedElement.endereco"), 
                txtEndereco, 
                BeanProperty.create("text"));
        bg.addBinding(b);
        
        Conversor conv = new Conversor();
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, 
                tbClientes, BeanProperty.create("selectedElement.datanascimento"), 
                txtData, BeanProperty.create("text"));
        b.setConverter(conv);
        bg.addBinding(b);
        
        bg.bind();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        ShowLista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Cliente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblNome.setText("Nome: ");

        lblEndereco.setText("Endereço:");

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbClientes);

        ShowLista.setText("Mostrar Lista");
        ShowLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowListaActionPerformed(evt);
            }
        });

        jLabel1.setText("Data Nascimento");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShowLista))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(txtEndereco)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionar)
                    .addComponent(ShowLista)
                    .addComponent(btnExcluir))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing

        if(getDesktopPane() instanceof AreaDeTrabalho){
            ((AreaDeTrabalho)getDesktopPane()).fecharCadastroCliente();
        }

    }//GEN-LAST:event_formInternalFrameClosing

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        
        if(tbClientes.getSelectedRows().length == 0 ){
        Cliente c = new Cliente();
        c.setNome(txtNome.getText());
        c.setEndereco(txtEndereco.getText());
        lstClientes.add(c);
        
        txtNome.setText("");
        txtEndereco.setText("");
        txtData.setText(null);
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void ShowListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowListaActionPerformed
        
        for(Cliente c:lstClientes){
            System.out.printf("Nome: %s\n", c.getNome());
            System.out.printf("Endereco: %s\n", c.getEndereco());
        }
        
    }//GEN-LAST:event_ShowListaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tbClientes.getSelectedRows().length > 0 ){
            int[] teste = tbClientes.getSelectedRows();
            for(int t : teste)
            {
                lstClientes.remove(t);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ShowLista;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
