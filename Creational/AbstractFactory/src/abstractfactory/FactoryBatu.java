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
public class FactoryBatu implements FactoryPerabotan{

    @Override
    public Kursi BuatKursi() {
      return new KursiBatu();
    }

    @Override
    public Meja BuatMeja() {
      return new MejaBatu();
    }
    
}
