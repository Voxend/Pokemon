package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Dragonite extends Pokemon {

    private int attack1;
    private int attack2;
    private int attack3;
    private int attack4;
    private boolean currentTurn = true;

    public Dragonite(Picture sprite){

        super(sprite);

        this.attack1 = 120;
        this.attack2 = 110;
        this.attack3 = 75;
        this.attack4 = 30;

    }

    @Override
    public void attack1(Pokemon pokemon){

        pokemon.currentHP -= attack1;
         
        System.out.println("Dragonite used Outrage");

        System.out.println("Rattata HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void attack2(Pokemon pokemon){

      pokemon.currentHP -= attack2;

        System.out.println("Dragonite used Hurricane");
        System.out.println("Rattata HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void  attack3(Pokemon pokemon){

        pokemon.currentHP -= attack3;
        System.out.println("Dragonite used Wing Attack");
        System.out.println("Rattata HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void attack4(Pokemon pokemon){

        pokemon.currentHP -= attack4;
        System.out.println("Dragonite used Tackle");
        System.out.println("Rattata HP: " + pokemon.currentHP + "\n");

   }

    public boolean getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(boolean turn){
           this.currentTurn = turn;
    }

    public int getAttack1() {
        return attack1;
    }

    public int getAttack2() {
        return attack2;
    }

    public int getAttack3() {
        return attack3;
    }

    public int getAttack4() {
        return attack4;
    }



}
