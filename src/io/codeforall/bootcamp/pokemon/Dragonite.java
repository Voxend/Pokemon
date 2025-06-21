package io.codeforall.bootcamp.pokemon;

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

        Rectangle dragoniteHP = new Rectangle(700 , 500 , currentHP/1.75 , 35);
        dragoniteHP.fill();
        
    }

    public void outrage(Pokemon pokemon){

         pokemon.currentHP -= outrage;
        System.out.println("Dragonite used Outrage");

        System.out.println("Rattata HP: " + pokemon.currentHP);


    }

    public void hurricane(Pokemon pokemon){

      pokemon.currentHP -= hurricane;

        System.out.println("Dragonite used Hurricane");
        System.out.println("Rattata HP: " + pokemon.currentHP);

    }

    public void  wingAttack (Pokemon pokemon){

        pokemon.currentHP -= wingAttack;
          System.out.println("Dragonite used Wing Attack");
           System.out.println("Rattata HP: " + pokemon.currentHP);

    }
   public void tackle(Pokemon pokemon){

        pokemon.currentHP -= tackle;
        System.out.println("Dragonite used Tackle");
         System.out.println("Rattata HP: " + pokemon.currentHP);
   }

    public boolean getCurrentTurn() {
        return currentTurn;
    }


    public void setCurrentTurn(boolean turn){
           this.currentTurn = turn;
    }
    //    @Override
//    public void useMove(Pokemon pokemon, Move move){
//        pokemon.currentHP -= move.damage;
//    }



//    private enum Mmove {
//        TACKLE(10,10),
//        WATERGUN(30,10),
//        WINGATTACK(20,10),
//        SLAM(50,5);
//
//        private int damage;
//        private int pp;
//
//        Mmove(int damage, int pp){
//            this.damage = damage;
//            this.pp = pp;
//        }
//
//
//    }

}
