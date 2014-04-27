package org.diego.Proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author DiiegOO
 */
public class RegistroMusica extends javax.swing.JFrame {
    
    public RegistroMusica(){
   initComponents();    
    }


private void initComponents(){

     ano_form = new javax.swing.JTextField ();
     insert = new javax.swing.JButton ();
     jLabel1 = new javax.swing.JLabel ();
     jLabel2 = new javax.swing.JLabel ();
     jLabel3 = new javax.swing.JLabel ();
     jLabel4= new javax.swing.JLabel ();
     jLabel5 = new javax.swing.JLabel();
     nomb_band = new javax.swing.JTextField ();
     num_int = new javax.swing.JTextField ();
     ps_band = new javax.swing.JTextField ();
    
}

private void jButtonActionPerformed(java.awt.event.ActionEvent evt){
    
    try{
        
        GuardarMusica.guardar(new Musica(nomb_band.getText(), 
            ps_band.getText(),
            Integer.parseInt(ano_form.getText()),
            Integer.parseInt(num_int.getText()) ));
        
        nomb_band.setText(null);
        ps_band.setText(null);
        ano_form.setText(null);
        num_int.setText(null);
        
    }catch(Exception ex){
     Logger.getLogger(RegistroMusica.class.getName()).log(Level.SEVERE, null, ex);   
    }
    
}
    

    private javax.swing.JTextField ano_form;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomb_band;
    private javax.swing.JTextField num_int;
    private javax.swing.JTextField ps_band;
}