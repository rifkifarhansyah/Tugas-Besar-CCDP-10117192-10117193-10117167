/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

import java.util.*;

/**
 *
 * @author Andhika
 */
public class Request {
    public static List MakeRequest(){
        List<Command> queue = new ArrayList<>();
        queue.add(new Engineer());
        queue.add(new Driver());
        queue.add(new Boss());
        return queue;
    }
    
    public static void workOffRequests(List queue) {
        for (Object command : queue) {
            ((Command)command).execute();
        }
    }
}
