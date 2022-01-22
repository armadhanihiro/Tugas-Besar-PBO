/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

/**
 *
 * @author LENOVO
 */
public class Kasir {
    private String nama;
    private int id;
    
    Kasir(String nama, int id) {
        setNama(nama);
        setID(id);
    }
    
    void setNama(String nama) {
        this.nama = nama;
    }
    String getNama() {
        return this.nama;
    }
    void setID(int id) {
        this.id = id;
    }
    int getID() {
        return this.id;
    }
}
