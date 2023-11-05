/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author asus
 */
public class CajaValida {
    
    private JLabel lblError;
    private JTextField txtcaja;

    public CajaValida(JLabel lblError, JTextField txtcaja) {
        this.lblError = lblError;
        this.txtcaja = txtcaja;
    }
    public float getNumero(){
    
        lblError.setText("");
        String num2 = txtcaja.getText();
        try{
        return Float.parseFloat(num2);
        }catch(NumberFormatException ex){
        lblError.setText("Numero Invalido");
        }
        return 0;
    }

    public JLabel getLblError() {
        return lblError;
    }

    public void setLblError(JLabel lblError) {
        this.lblError = lblError;
    }

    public JTextField getTxtcaja() {
        return txtcaja;
    }

    public void setTxtcaja(JTextField txtcaja) {
        this.txtcaja = txtcaja;
    }
    
}
