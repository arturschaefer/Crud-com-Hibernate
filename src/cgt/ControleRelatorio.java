/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cdp.Compra;
import cgd.CompraDAO;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Artur Schaefer <artur.schaefer2 at gmail.com>
 */
public class ControleRelatorio {
    CompraDAO compraDAO;
  
    public ControleRelatorio() throws ClassNotFoundException, SQLException {
        compraDAO = new CompraDAO();
    }

    public void relClientes( List lista) throws JRException {
        
       try {
            
            // PASSO 1 - Caminho do relatório
            InputStream rel = getClass().getResourceAsStream("../relatorios/relVendas.jasper");

            // PASSO 2 - Pegar o List
            JRBeanCollectionDataSource dados = new JRBeanCollectionDataSource(lista);            
                     
            // PASSO 3 - Criar parâmetros de Pesquisa. MESMO QUE VAZIO
            Map parametros = new HashMap();         

            // PASSO 4 - Carregar o relatório com os dados
            JasperPrint print;
            print = JasperFillManager.fillReport(rel, parametros, dados);
                    
            // PASSO 4 - Mostrat em uma JANELA
            JasperViewer janela = new JasperViewer(print, false);
            if ( print.getPages().size() > 0 ) {
                janela.setVisible(true);
            }
       }
        catch (JRException ex) {
            System.out.println(ex.getMessage());
        }               
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    public void relPedidos() throws JRException {
        
       try {
            
            // PASSO 1 - Caminho do relatório
            InputStream rel = getClass().getResourceAsStream("../relatorios/relPedidos.jasper");

            // PASSO 2 - Pegar o List
            List lista = compraDAO.listar(Compra.class);
            JRBeanCollectionDataSource dados = new JRBeanCollectionDataSource(lista);            
                     
            // PASSO 3 - Criar parâmetros de Pesquisa. MESMO QUE VAZIO
            Map parametros = new HashMap();         

            // PASSO 4 - Carregar o relatório com os dados
            JasperPrint print;
            print = JasperFillManager.fillReport(rel, parametros, dados);
                    
            // PASSO 4 - Mostrat em uma JANELA
            JasperViewer janela = new JasperViewer(print, false);
            if ( print.getPages().size() > 0 ) {
                janela.setVisible(true);
            }
       }
        catch (JRException ex) {
            System.out.println(ex.getMessage());
        }               
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
}
