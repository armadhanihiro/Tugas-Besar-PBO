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
public class Pesanan {
    private int totalHarga, no_pesanan;
    private String menu, nama;
    
    Pesanan(String nama, int no_pesanan, String menu, int totalHarga) {
        setNama(nama);
        setNoPesanan(no_pesanan);
        setMenu(menu);
        this.totalHarga = totalHarga;
    }
    
    void setNama(String nama) {
        this.nama = nama;
    }
    String getNama() {
        return this.nama;
    }
    void setNoPesanan(int no_pesanan) {
        this.no_pesanan = no_pesanan;
    }
    int getNoPesanan() {
        return this.no_pesanan;
    }
    void setMenu(String menu) {
        this.menu = menu;
    }
    String getMenu() {
        return this.menu;
    }
    
    int totalHarga() {
        return this.totalHarga;
    }
    
}
