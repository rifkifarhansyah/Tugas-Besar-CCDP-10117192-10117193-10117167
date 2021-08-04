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
public class CreateBangunDatar extends Shape{

    private int panjang, lebar;
    private String nama;
    
    public CreateBangunDatar(DrawBangunDatar drawBangunDatar, String nama, int panjang, int lebar) {
        super(drawBangunDatar);
        this.panjang = panjang;
        this.lebar = lebar;
        this.nama = nama;
    }

    @Override
    public void draw() {
        draw_bangundatar.tampilBangunDatar(nama, panjang, lebar);
    }
    
}
