package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Rattata extends Pokemon{

    private int fang;
    private int tackle;
    private int hyperFang;
    private int surf;
    private boolean currentTurn = false;

    public Rattata(Picture fotoDoRato) {

        super(fotoDoRato);

        this.fang = 70;
        this.tackle =30;
        this.hyperFang =120;
        this.surf = 170;

    }

    public void fang(Pokemon pokemon){

        pokemon.currentHP -= fang;
        System.out.println("Rattata used fang");
        System.out.println("Dragonite HP: " + pokemon.currentHP + "\n");

    }
    public void tackle (Pokemon pokemon){

        pokemon.currentHP -= tackle;
        System.out.println("Rattata used tackle");
        System.out.println("Dragonite HP: " + pokemon.currentHP + "\n");

    }

    public void hyperFang (Pokemon pokemon){

        pokemon.currentHP -= hyperFang;
        System.out.println("Rattata used Hyper Fang");
        System.out.println("Dragonite HP: " + pokemon.currentHP + "\n");

    }

    public void surf (Pokemon pokemon){

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

    public int getFang() {
        return fang;
    }

    public int getHyperFang() {
        return hyperFang;
    }

    public int getTackle() {
        return tackle;
    }
}
