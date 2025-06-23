package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Rattata extends Pokemon{

    private int attack1;
    private int attack2;
    private int attack3;
    private int attack4;
    private boolean currentTurn = false;

    public Rattata(Picture fotoDoRato) {

        super(fotoDoRato);

        this.attack1 = 70;
        this.attack2 =30;
        this.attack3 =120;
        this.attack4 = 170;

    }

    @Override
    public void attack1(Pokemon pokemon){

        pokemon.currentHP -= fang;
        System.out.println("Rattata used fang");
        System.out.println("Dragonite HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void attack2(Pokemon pokemon){

        pokemon.currentHP -= tackle;
        System.out.println("Rattata used tackle");
        System.out.println("Dragonite HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void attack3(Pokemon pokemon){

        pokemon.currentHP -= hyperFang;
        System.out.println("Rattata used Hyper Fang");
        System.out.println("Dragonite HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void attack4(Pokemon pokemon){

        pokemon.currentHP -= surf;

        System.out.println("Rattata used Surf");
        System.out.println("Dragonite HP: " + pokemon.currentHP +"\n");

    }

    public boolean getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(boolean turn){
        this.currentTurn = turn;
    }

    public int getSurf() {
        return surf;
    }

    @Override
    public void setHpBar(Rectangle hpBar) {
        super.setHpBar(hpBar);
    }

    @Override
    public Rectangle getHpBar() {
        return super.getHpBar();
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
