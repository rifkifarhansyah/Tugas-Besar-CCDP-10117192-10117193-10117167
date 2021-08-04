/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

import java.util.*;

/* langkah 7
 *
 * @author Andhika
 */
public class Makanan {
    private List<Item> items = new ArrayList<Item>();
    
    public void add(Item item){
        items.add(item);
    }
    
    public float getCost(){
        float cost = 0.0f;
        
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }
    
    public void showItems(){
        for(Item item : items){
            System.out.print("item : "+item.name());
            System.out.print(", Packing "+item.packing().pack());
            System.out.println(", price "+item.price());
        }
    }
}
