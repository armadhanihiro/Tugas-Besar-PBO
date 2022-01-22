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
public class Makanan extends Menu {
    private String jenis_makanan;
    
    Makanan(String nama, int harga, String jenis_makanan) {
        super(nama, harga);
        setJenisMakanan(jenis_makanan);
    }
    
    void setJenisMakanan(String jenis_makanan) {
        this.jenis_makanan = jenis_makanan;
    }
    
    String getJenisMakanan() {
        return this.jenis_makanan;
    }
    
    @Override
    public void info() {
        System.out.print("Makanan       : " + this.getNama());
        System.out.print("Jenis Makanan : " + this.jenis_makanan);
    }
}
