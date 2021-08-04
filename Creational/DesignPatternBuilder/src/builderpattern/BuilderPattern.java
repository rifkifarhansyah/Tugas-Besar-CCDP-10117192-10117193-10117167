/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/* langkah 9
 *
 * @author Andhika
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MakananBuilder mealBuilder = new MakananBuilder();
        
        Makanan VegetableMeal = mealBuilder.prepareVegetableMeal();
        System.out.println("Vegetable Meal");
        VegetableMeal.showItems();
        System.out.println("Total cost : "+VegetableMeal.getCost());
        
        
        Makanan nonVegetableMeal = mealBuilder.prepareNonVegetableMeal();
        System.out.println("\n\nNon Vegetable Meal");
        nonVegetableMeal.showItems();
        System.out.println("Total Harga : "+nonVegetableMeal.getCost());
    }
}
