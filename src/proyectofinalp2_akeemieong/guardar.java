/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_akeemieong;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class guardar implements Runnable {
    private Object[][]datos;
    private JTable a;

    
    
    public guardar() {
    }
    
    public guardar(Object[][] datos) {
        this.datos = datos;
    }
    
    public guardar(Object[][] datos, JTable a) {
        this.datos = datos;
        this.a = a;
    }
    
    @Override
    public void run() {
        //a.getModel().addTableModelListener(this);
        while(true){
            //if(a.){
                
            
            for (int i = 0; i < a.getRowCount(); i++) {
                for (int j = 0; j < a.getColumnCount(); j++) {
                    datos[i][j]=a.getValueAt(i, j);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }

    
    
    
}
