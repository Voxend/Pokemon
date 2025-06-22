package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Dragonite extends Pokemon {

    private int outrage;
    private int hurricane;
    private int wingAttack;
    private int tackle;
    private boolean currentTurn = true;
    private Rectangle hpBar;


    public Dragonite(Picture sprite){
        super(sprite);
        this.outrage = 120;
        this.hurricane = 110;
        this.wingAttack = 75;
        this.tackle = 30;




    }

    public void outrage(Pokemon pokemon){

         pokemon.currentHP -= outrage;
         
        System.out.println("Dragonite used Outrage");

        System.out.println("Rattata HP: " + pokemon.currentHP + "\n");


    }

    public void hurricane(Pokemon pokemon){

      pokemon.currentHP -= hurricane;

        System.out.println("Dragonite used Hurricane");
        System.out.println("Rattata HP: " + pokemon.currentHP + "\n");

    }

    public void  wingAttack (Pokemon pokemon){

        pokemon.currentHP -= wingAttack;
          System.out.println("Dragonite used Wing Attack");
           System.out.println("Rattata HP: " + pokemon.currentHP + "\n");

    }
   public void tackle(Pokemon pokemon){

        pokemon.currentHP -= tackle;
        System.out.println("Dragonite used Tackle");
         System.out.println("Rattata HP: " + pokemon.currentHP + "\n");
   }

    public boolean getCurrentTurn() {
        return currentTurn;
    }


    public void setCurrentTurn(boolean turn){
           this.currentTurn = turn;
    }

    public int getTackle() {
        return tackle;
    }

    public int getHurricane() {
        return hurricane;
    }

    public int getWingAttack() {
        return wingAttack;
    }

    public int getOutrage() {
        return outrage;
    }

    //    public void setHpBar(Rectangle hpBar) {
//        this.hpBar = hpBar;
//    }
}
