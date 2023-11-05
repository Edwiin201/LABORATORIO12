/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author asus
 */
public class Operaciones {
    
    private float valor1;
    private float valor2;

    private CajaValida caja1;
    private CajaValida caja2;
    private CajaValida resultado;
    public Operaciones(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public Operaciones(){}

    public Operaciones(CajaValida caja1, CajaValida caja2, CajaValida resultado) {
        this.caja1 = caja1;
        this.caja2 = caja2;
        this.resultado = resultado;
    }
    
    
    public void mostrarResultadodiv(){
       
        JTextField caja = resultado.getTxtcaja();
        JLabel labelError = resultado.getLblError();
        valor1 = caja1.getNumero();
        valor2 =caja2.getNumero();
        if(valor1==0 && valor2==0){
            String text = " NO SE PUEDE DIVIDIR CERO ENTRE CERO ";
            caja.setText(text);
            JOptionPane.showMessageDialog(null,text,"",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(valor2==0){
           String text = " NO SE PUEDE DIVIDIR ENTRE 0";      
           caja.setText(text);
           JOptionPane.showMessageDialog(null,text,"",
                    JOptionPane.ERROR_MESSAGE);
        }else{    
        float sum =divi();
        caja.setText(sum + "");
        }
    }

    public void mostrarResultadosum(){
       
        JTextField caja = resultado.getTxtcaja();
        JLabel labelError = resultado.getLblError();
        valor1 = caja1.getNumero();
        valor2 =caja2.getNumero();
            
        float sum =suma();
        caja.setText(sum + "");
        
    }
    public void mostrarResultadoresta(){
       
        JTextField caja = resultado.getTxtcaja();
        JLabel labelError = resultado.getLblError();
        valor1 = caja1.getNumero();
        valor2 =caja2.getNumero();
            
        float sum =resta();
        caja.setText(sum + "");
        
    }
    public void mostrarResultadomulti(){
       
        JTextField caja = resultado.getTxtcaja();
        JLabel labelError = resultado.getLblError();
        valor1 = caja1.getNumero();
        valor2 =caja2.getNumero();
            
        float sum =mul();
        caja.setText(sum + "");
        
    }
    
     public float suma (){  
        return this.valor1+valor2;
    }
    public float resta (){  
        return this.valor1-valor2;
    }
    public float mul (){  
        return this.valor1*valor2;
    }
    public float divi (){  
        return this.valor1/valor2;
    }
}
