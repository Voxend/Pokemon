package io.codeforall.bootcamp;

import io.codeforall.bootcamp.pokemon.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Picture sprite = new Picture(150, 100, "resources/dragonite sprites.png");
        Picture fotoDoRato = new Picture(450, -20, "resources/ratoAgain.png");
        MyKeyboardHandle keyboardHandle = new MyKeyboardHandle();
        keyboardHandle.init();
        Dragonite dragonite = new Dragonite(sprite);
        Rattata rattata = new Rattata(fotoDoRato);
        keyboardHandle.setDragonite(dragonite);
        keyboardHandle.setRattata(rattata);
        Game game1= new Game( dragonite,rattata);
//        Rectangle hp = new Rectangle(700 , 500 , dragonite.getCurrentHP()/1.75 , 35);
//        hp.fill();
//        hp.setColor(Color.GREEN);



    }
}
