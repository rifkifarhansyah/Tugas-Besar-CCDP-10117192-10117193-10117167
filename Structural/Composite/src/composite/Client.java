/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author USER
 */
public class Client {
  public static void main (String[] args) {
    Pramuniaga pramuniaga1 = new Pramuniaga(102, "Andre Gunawan", "Senior Pramuniaga");
    Pramuniaga pramuniaga2 = new Pramuniaga(109, "Chandra Bhakti", "Junior Pramuniaga");
    
    Composite compositepramuniaga = new Composite();
    
    compositepramuniaga.TambahKaryawan(pramuniaga1);
    compositepramuniaga.TambahKaryawan(pramuniaga2);
    
    Kasir kasir1 = new Kasir(728, "Nia Fatmawati", "Junior Kasir");
    
    Composite compositekasir = new Composite();
    
    compositekasir.TambahKaryawan(kasir1);
    
    KepalaToko kepalaToko = new KepalaToko(198, "John Doe", "Senior Kepala Toko");
    
    Composite compositekepalatoko = new Composite();
    
    compositekepalatoko.TambahKaryawan(kepalaToko);
    
    Composite composite = new Composite();
    
    composite.TambahKaryawan(compositepramuniaga);
    composite.TambahKaryawan(compositekasir);
    composite.TambahKaryawan(compositekepalatoko);
    
    composite.TampilDataKaryawan();
  }
}
