/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_akeemieong;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author SURFACEB2I7
 */
public class worksheet {
    private TableModel modelo;
    private String nombre;

    public worksheet() {
    }

    public worksheet(TableModel modelo, String nombre) {
        this.modelo = modelo;
        this.nombre = nombre;
    }

    public TableModel getModelo() {
        return modelo;
    }

    public void setModelo(TableModel modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "worksheet{" + "modelo=" + modelo + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
