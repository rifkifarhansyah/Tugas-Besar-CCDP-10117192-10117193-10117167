/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author Andhika
 */
public class Boss implements Command{

    @Override
    public void execute() {
        System.out.println("The boss say : Take out the trash");
    }
    
}
