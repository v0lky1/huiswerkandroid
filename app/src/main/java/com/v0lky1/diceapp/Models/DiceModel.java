package com.v0lky1.diceapp.Models;

public class DiceModel {
    private int numberDiceOne;
    private int numberDiceTwo;

    public DiceModel() {
    }

    public int getNumberDiceOne() {
        return numberDiceOne;
    }

    public int getNumberDiceTwo() {
        return numberDiceTwo;
    }

    public void setNumberDiceOne(int number) {
        numberDiceOne = number;
    }
    public void setNumberDiceTwo(int number){
        numberDiceTwo = number;
    }
}
