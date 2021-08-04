/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/* langkah 8
 *
 * @author Andhika
 */
public class MakananBuilder {
    public Makanan prepareVegetableMeal(){
        Makanan meal = new Makanan();
        meal.add(new VegetableBurger());
        meal.add(new Sprite());
        return meal;
    }
    
    public Makanan prepareNonVegetableMeal(){
        Makanan meal = new Makanan();
        meal.add(new ChickenBurger());
        meal.add(new Mizone());
        return meal;
    }
}
