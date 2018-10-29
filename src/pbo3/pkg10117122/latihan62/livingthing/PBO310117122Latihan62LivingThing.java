/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan62.livingthing;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : If-3
 * Deskripsi Program : program berisi program untuk menampilkan aktifitas dari 
 *                     user dengan menggunakan pendekatan berbasis kontol.
 */
public class PBO310117122Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Rizki Adam Kurniawan");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
