/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/* langkah 5
 *
 * @author Andhika
 */
public class ChickenBurger extends Burger{

    @Override
    public float price() {
        return 50000;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
    
}
