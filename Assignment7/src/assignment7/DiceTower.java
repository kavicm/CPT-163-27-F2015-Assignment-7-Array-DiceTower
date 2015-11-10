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

int[] rolls = new int[PANNELS];//create array list

/**
 * Constructor
 */
public DiceTower() {
        this.dice = new ArrayList(); // 
        this.trayValue = 0;
    }
/**
 * Constructor
 * @param dice 
 */
public DiceTower(List dice) {
        this.dice = dice; // 
        this.trayValue = 0;
    }
 
/**
 * dropDice method
 */
    public void dropDice()
        {
       for (int index = 0; index < PANNELS; index ++ )
       {
        Die die = new Die(6);
	die.roll(); 
        rolls[index] = die.value();
       }
       
       
   }
    
   /**
     * trayValue method
     * @return sum of the dice rolls
     */
   public int trayValue( )
   {
       int sum = 0;
       for (int i =0; i<rolls.length; i++)
       {
           sum += i;
       }
       return sum;
    }
    }

