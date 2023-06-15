/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_akeemieong;

import javax.swing.RowFilter;

/**
 *
 * @author SURFACEB2I7
 */
public class filter extends RowFilter{

    private String searchText;
    private int index;
    
    public filter(String searchText) {
        this.searchText = searchText;
    }

    public filter(String searchText, int index) {
        this.searchText = searchText;
        this.index = index;
    }
    
    
    
    @Override
    public boolean include(Entry entry) {
        return entry.getStringValue(index).indexOf(searchText)>=0;
    }
    
}
