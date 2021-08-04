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
public class Kasir implements Karyawan{
  private int idkaryawan;
  private String nama;
  private String posisi;
  
  public Kasir(int idkaryawan, String nama, String posisi){
      this.idkaryawan = idkaryawan;
      this.nama = nama;
      this.posisi = posisi;
  }
  
  @Override
  public void TampilDataKaryawan() {
   System.out.println(idkaryawan + " "+ nama + " " + posisi);
  }
}
