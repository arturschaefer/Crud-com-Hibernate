package cih;

import cdp.Pessoa;
import cgt.ControlePessoa;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarCliente extends javax.swing.JDialog {

    ControlePessoa ctrlCliente = new ControlePessoa();
    Pessoa pessoaSelecionada;
    List<Pessoa> listaPessoas;

    public ListarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        ((DefaultTableModel) jTableClientes.getModel()).setRowCount(0);
        try {
            listaPessoas = ctrlCliente.listarPessoas(0, clienteJTextField.getText());
            inserirTabela();
        } catch (SQLException ex) {
            Logger.getLogger(ListarCliente.class.getName()).log(Level.SEVERE, null, ex);
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

        tabelaClientejScrollPane5 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        clientejLabel22 = new javax.swing.JLabel();
        clienteJTextField = new javax.swing.JTextField();
        consultarCliente = new javax.swing.JButton();
        cancelajButton = new javax.swing.JButton();
        confirmajButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Telefone", "Cidade"
            }
        ));
        tabelaClientejScrollPane5.setViewportView(jTableClientes);

        clientejLabel22.setText("Cliente:");

        consultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        consultarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarClienteMouseClicked(evt);
            }
        });
        consultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarClienteActionPerformed(evt);
            }
        });

        cancelajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8482_16x16.png"))); // NOI18N
        cancelajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelajButtonActionPerformed(evt);
            }
        });

        confirmajButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6036_32x32.png"))); // NOI18N
        confirmajButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmajButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaClientejScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clientejLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clienteJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmajButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelajButton, confirmajButton4, consultarCliente});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaClientejScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clienteJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientejLabel22))
                    .addComponent(cancelajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmajButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clienteJTextField, consultarCliente});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarClienteActionPerformed

    }//GEN-LAST:event_consultarClienteActionPerformed

    private void cancelajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelajButtonActionPerformed

    }//GEN-LAST:event_cancelajButtonActionPerformed

    private void consultarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarClienteMouseClicked
        try {
            listaPessoas = ctrlCliente.listarPessoas(1, clienteJTextField.getText());
            inserirTabela();
        } catch (SQLException ex) {
            Logger.getLogger(ListarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultarClienteMouseClicked

    private void confirmajButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmajButton4ActionPerformed
        int linha = jTableClientes.getSelectedRow();
        if (linha >= 0) {
            pessoaSelecionada = (Pessoa) jTableClientes.getValueAt(linha, 0);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha");
        }
    }//GEN-LAST:event_confirmajButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            ListarCliente dialog = new ListarCliente(new javax.swing.JFrame(), true);
        });
    }

    public void inserirTabela() {
        limparTabela(jTableClientes);
        if (listaPessoas != null) {
            Pessoa pes;
            Iterator<Pessoa> it = listaPessoas.iterator();
            while (it.hasNext()) {
                pes = it.next();
                ((DefaultTableModel) jTableClientes.getModel()).addRow(pes.toArray());
            }
        }
    }
    
    public void limparTabela(JTable tabela){
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        int rc = model.getRowCount();
        for (int i = 0; i < rc; i++) {
            model.removeRow(0);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelajButton;
    private javax.swing.JTextField clienteJTextField;
    private javax.swing.JLabel clientejLabel22;
    private javax.swing.JButton confirmajButton4;
    private javax.swing.JButton consultarCliente;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JScrollPane tabelaClientejScrollPane5;
    // End of variables declaration//GEN-END:variables
}
