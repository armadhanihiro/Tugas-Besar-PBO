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
public class Minuman extends Menu {
    private String jenis_minuman;
    
    Minuman(String nama, int harga, String jenis_minuman) {
        super(nama, harga);
        setJenisMakanan(jenis_minuman);
    }
    
    void setJenisMakanan(String jenis_makanan) {
        this.jenis_minuman = jenis_makanan;
    }
    
    String getJenisMakanan() {
        return this.jenis_minuman;
    }
    
    @Override
    public void info() {
        System.out.print("Minuman       : " + this.getNama());
        System.out.print("Jenis Minuman : " + this.jenis_minuman);
    }
}
