/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Random;

/**
 *
 * @author mkavic
 */
public class Die {
    //fields
    private int sides;
    private int value;
   
    /**
     * Constructor
     * @param sides 
     */
    public Die (int sides){
        this.sides = sides;
    }
    /**
     * Roll method
     */
    public void roll(){
        Random die = new Random();
        value = die.nextInt(this.sides) + 1;
}
    /**
     * Value method
     * @return value field
     */
    public int value(){
        return this.value;
}



}


    

