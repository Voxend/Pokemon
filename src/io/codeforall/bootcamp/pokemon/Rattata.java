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
        this.fang = 1;
        this.tackle =1;
        this.hyperFang =1;
        this.surf = 250;



    }
    public void fang(Pokemon pokemon){

        pokemon.currentHP -= fang;
        System.out.println("Rattata used fang");
        System.out.println("Dragonite HP: " + pokemon.currentHP);

    }
    public void tackle (Pokemon pokemon){

        pokemon.currentHP -= tackle;
        System.out.println("Rattata used tackle");
        System.out.println("Dragonite HP: " + pokemon.currentHP);
    }

    public void hyperFang (Pokemon pokemon){

        pokemon.currentHP -= hyperFang;
        System.out.println("Rattata used Hyper Fang");
        System.out.println("Dragonite HP: " + pokemon.currentHP);
    }

    public void surf (Pokemon pokemon){

        pokemon.currentHP -= surf;

        System.out.println("Rattata used Surf");
        System.out.println("Dragonite HP: " + pokemon.currentHP);
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
}
