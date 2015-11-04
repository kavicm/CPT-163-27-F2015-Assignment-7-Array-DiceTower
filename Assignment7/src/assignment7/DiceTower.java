/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mkavic
 */
public class DiceTower {
//fields
private int PANELS;
List <Die> dice;
private int trayValue;
private int value;

/**
 * Constructor
 */
public DiceTower(){
    this.dice = new ArrayList();
    value = 0;
    trayValue = 0;
}
/**
 * Constructor
 * @param dice 
 */
public DiceTower (List dice){
        this.dice = dice;
        value = 0;
        trayValue = 0;
    }
 
/**
 * dropDice method
 */
    public void dropDice(){
        for (int i = 0; i < dice.size(); i++){
            for(int p =0; p <PANELS; p++){
            this.dice.get(i).roll();
        }
        trayValue += this.dice.get(i).value();
        }
    }
    
   /**
     * trayValue method
     * @return sum of the dice rolls
     */
    public int trayValue(){
        return trayValue;
    }
    }

