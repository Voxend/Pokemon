package io.codeforall.bootcamp;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

import io.codeforall.bootcamp.pokemon.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {

    public static void main(String[] args){


        Picture startScreen = new Picture(10,10,"resources/StartScreen.png");


        MyKeyboardHandle keyboardHandle = new MyKeyboardHandle();
        keyboardHandle.init();



        keyboardHandle.setStartScreen(startScreen);

        Game game1= new Game();


        startScreen.draw();
        keyboardHandle.setGame(game1);
        keyboardHandle.setP1(game1.getP1());
        keyboardHandle.setP2(game1.getP2());

    }
}
