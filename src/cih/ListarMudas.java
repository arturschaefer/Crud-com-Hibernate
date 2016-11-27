package cih;

import cdp.Mudas;
import cdp.Pessoa;
import cgt.ControleMudas;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarMudas extends javax.swing.JDialog {

    ControleMudas ctrlMudas = new ControleMudas();
    private Mudas mudaSelecionada;
    List<Mudas> listaMudas;

    public ListarMudas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        mudaSelecionada = new Mudas();

        ((DefaultTableModel) jTableMudas.getModel()).setRowCount(0);
        try {
            listaMudas = ctrlMudas.listarMudas(0, "");
            inserirTabela();
        } catch (SQLException ex) {
            Logger.getLogger(ListarMudas.class.getName()).log(Level.SEVERE, null, ex);
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

        tabelaMudasjScrollPane5 = new javax.swing.JScrollPane();
        jTableMudas = new javax.swing.JTable();
        idMudasjLabel22 = new javax.swing.JLabel();
        idMudasJTextField = new javax.swing.JTextField();
        consultarMuda = new javax.swing.JButton();
        cancelajButton = new javax.swing.JButton();
        confirmajButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Clientes");

        jTableMudas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Muda", "Nome", "Descrição", "Preço_Unitário"
            }
        ));
        tabelaMudasjScrollPane5.setViewportView(jTableMudas);

        idMudasjLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idMudasjLabel22.setText("Id_Muda");

        consultarMuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        consultarMuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarMudaMouseClicked(evt);
            }
        });

        cancelajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8482_16x16.png"))); // NOI18N
        cancelajButton.setEnabled(false);

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
                    .addComponent(tabelaMudasjScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idMudasjLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idMudasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultarMuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmajButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelajButton, confirmajButton4, consultarMuda});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaMudasjScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idMudasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idMudasjLabel22))
                    .addComponent(cancelajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarMuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmajButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {consultarMuda, idMudasJTextField});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarMudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarMudaMouseClicked
        try {
            listaMudas = ctrlMudas.listarMudas(1, idMudasJTextField.getText());
            inserirTabela();
        } catch (SQLException ex) {
            Logger.getLogger(ListarMudas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultarMudaMouseClicked

    private void confirmajButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmajButton4ActionPerformed
        int linha = jTableMudas.getSelectedRow();
        if (linha >= 0) {
            mudaSelecionada.setIdMudas((int) jTableMudas.getValueAt(linha, 0));
            mudaSelecionada.setNome((String) jTableMudas.getValueAt(linha, 1));
            mudaSelecionada.setDescricao((String) jTableMudas.getValueAt(linha, 2));
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha");
        }
    }//GEN-LAST:event_confirmajButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            ListarMudas dialog = new ListarMudas(new javax.swing.JFrame(), true);
        });
    }

    public final void inserirTabela() {
        limparTabela(jTableMudas);
        if (listaMudas != null) {
            Mudas muda;
            Iterator<Mudas> it = listaMudas.iterator();
            while (it.hasNext()) {
                muda = it.next();
                ((DefaultTableModel) jTableMudas.getModel()).addRow(muda.toArray());
            }
        }
    }

    public final void limparTabela(JTable tabela) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        int rc = model.getRowCount();
        for (int i = 0; i < rc; i++) {
            model.removeRow(0);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelajButton;
    private javax.swing.JButton confirmajButton4;
    private javax.swing.JButton consultarMuda;
    private javax.swing.JTextField idMudasJTextField;
    private javax.swing.JLabel idMudasjLabel22;
    private javax.swing.JTable jTableMudas;
    private javax.swing.JScrollPane tabelaMudasjScrollPane5;
    // End of variables declaration//GEN-END:variables

    public Mudas getMudaSelecionada() {
        return mudaSelecionada;
    }
}
