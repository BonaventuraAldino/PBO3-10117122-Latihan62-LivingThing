/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan62.livingthing;

/**
 *
 * @author Aldy Senda
 */
public class Human implements LivingThing{
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void walk(String nama) {
        System.out.println(getNama() + " Sedang Berjalan");
    }

    @Override
    public void breath(String nama) {
        System.out.println(getNama() + " Bernafas");
    }

    @Override
    public void eat(String nama) {
        System.out.println(getNama() + " Makan");
    }
}
