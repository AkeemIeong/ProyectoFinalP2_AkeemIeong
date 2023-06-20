/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_akeemieong;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author SURFACEB2I7
 */
public class adminHashmap {
    private HashMap sheets=new HashMap<>();
    private File archivo=null;

    public adminHashmap() {
    }
    
    public adminHashmap(String path){
        archivo = new File(path);
    }
    
    public HashMap getSheets() {
        return sheets;
    }

    public void setSheets(HashMap sheets) {
        this.sheets = sheets;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminHashmap{" + "sheets=" + sheets + ", archivo=" + archivo + '}';
    }
    
    public void cargararchivo(){
        try {            
            sheets = new HashMap();
            HashMap temp;
            if (archivo.exists()) {
                FileInputStream entrada= new FileInputStream(archivo);
                ObjectInputStream objeto= new ObjectInputStream(entrada);
                try {
                    temp = (HashMap)objeto.readObject();
                    while (sheets.isEmpty()) {
                        sheets.putAll(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (int i = 0; i < sheets.size(); i++) {
                bw.writeObject(sheets);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
