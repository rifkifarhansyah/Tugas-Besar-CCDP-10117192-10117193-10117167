/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author USER
 */
public class KursiBatu implements Kursi{

    @Override
    public void JumlahKaki() {
      System.out.println("Memiliki 1 kaki");
    }

    @Override
    public void Tinggi() {
      System.out.println("45 cm");
    }

    @Override
    public void Nama() {
      System.out.println("Kursi Batu Marmer Putih");
    }

    @Override
    public void Berat() {
      System.out.println("-");
    }

    @Override
    public void Lebar() {
      System.out.println("30 cm");
    }

    @Override
    public void Harga() {
      System.out.println("Rp250.000");
    }
    
}
