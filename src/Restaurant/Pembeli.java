/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class Pembeli {
    private String nama;
    private int no_pesanan;
    private final LocalDate date = LocalDate.now();
    
    Pembeli(String nama, int no_pesanan) {
        setNama(nama);
        setNoPesanan(no_pesanan);
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
    
    LocalDate getDate() {
        return date;
    }
 }
