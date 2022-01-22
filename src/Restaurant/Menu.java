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
public abstract class Menu {
    private String nama;
    private int harga;
    
    Menu(String nama, int harga) {
        setNama(nama);
        this.harga = harga;
    }
    
    void setNama(String nama) {
        this.nama = nama;
    }
    String getNama() {
        return this.nama;
    }
    int cekHarga() {
        return harga;
    }
    public abstract void info();
    
}
