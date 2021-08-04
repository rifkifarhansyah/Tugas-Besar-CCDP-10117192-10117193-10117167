/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/* langkah 4
 *
 * @author Andhika
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Botol();
    }

    @Override
    public abstract float price();
    
}
