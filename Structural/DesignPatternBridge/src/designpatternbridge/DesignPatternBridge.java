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
public class DesignPatternBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape persegi_panjang = new CreateBangunDatar(new BangunDatar(), "Persegi Panjang", 30, 10);
        Shape segitiga = new CreateBangunDatar(new BangunDatar(), "Segitiga", 7, 7);
        
        persegi_panjang.draw();
        segitiga.draw();
    }
    
}
