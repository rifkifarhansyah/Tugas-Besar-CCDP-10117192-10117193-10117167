/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternbridge;

/* 
 *
 * @author Andhika
 */
public class BangunDatar implements DrawBangunDatar{

    @Override
    public void tampilBangunDatar(String nama, int panjang, int lebar) {
        System.out.println("Membuat Bangun Datar");
        System.out.println("======================");
        System.out.println("Nama = " + nama);
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("======================");
    }

   
}
