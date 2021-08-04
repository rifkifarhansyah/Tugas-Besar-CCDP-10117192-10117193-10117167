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
public abstract class Shape {
    protected DrawBangunDatar draw_bangundatar;
    
    public Shape(DrawBangunDatar drawBangunDatar){
        this.draw_bangundatar = drawBangunDatar;
    }
    
    public abstract void draw();
}
