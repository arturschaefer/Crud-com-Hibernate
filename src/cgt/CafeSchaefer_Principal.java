package cgt;
import cih.*;
import java.sql.SQLException;

/*
 * Autor:           Artur Schaefer <artur.schaefer2@gmail.com>
 * Data:            28/07/2016
 * Hora:            14:34:33
 * Codificação:     UTF-8
 * Disciplina:      Programação Orientada a Objetos II
 * Professor:       Giovany Frossard Teixeira
 * Instituição:     Instituto Federal de Educação, Ciência e Tecnologia do Espírito Santo - IFES
 *
 * Nome Original:       CafeSchaefer_Principal
 * Pacote de Criação:   cafeschaefer 
 */

public class CafeSchaefer_Principal {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         Login tela = new Login();
         tela.setVisible(true);
    }
}

/*
 *  CIH (Componente de Interação Humana) 
 *  -> Nesta primeira camada terias tuas classes e interfaces referentes a GUI (Graphic User Interface)
 *
 *  CGT (Componente de Gerencia de Tarefa)
 *  -> Na segunda camada acho que são as classes referentes as regras de validação de tela (Validators). 
 *   Seriam as verificações de tipo, tamanho e dependêcia.
 *
 *  CDP (Componente de Dominio do Problema)
 *  -> Camada de negócio são as implementações das regras como validação de privilégios, logins...
 *
 *  CGD (Componente de Gerencia de Dados)
 *  -> Aqui tu teria as tuas classes de persistência 
 *  como as classes de mapeamento dos objetos (beans) e os Brokers.
 */


/*
 *  O programa é de uso exclusivo para a disciplina de Programação Orientada a Objetos II 
 *  Sua cópia é estritamente proibida!
 *  Na dúvida entre em contato: artur.schaefer2@gmail.com
 *  ©Artur_Schaefer
 */