package io.codeforall.bootcamp;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

import io.codeforall.bootcamp.pokemon.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        //Sound
        File victorySong = new File("/Users/codecadet/workspace/Java/Pokemon/resources/victoryTheme.wav");
        File file = new File(("/Users/codecadet/workspace/Java/Pokemon/resources/background music.wav"));

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();
        clip.loop(2);

        //Images
        Picture startScreen = new Picture(10,10,"resources/StartScreen.png");

        Picture sprite = new Picture(150, 100, "resources/dragonite sprites.png");
        Picture fotoDoRato = new Picture(450, -20, "resources/ratoAgain.png");

        //Keyboard Functionality
        MyKeyboardHandle keyboardHandle = new MyKeyboardHandle();
        keyboardHandle.init();

        //Pokémon Game Start
        Dragonite dragonite = new Dragonite(sprite);
        Rattata rattata = new Rattata(fotoDoRato);

        keyboardHandle.setStartScreen(startScreen);

        Game game1= new Game(dragonite,rattata);

        game1.init();
        startScreen.draw();
        keyboardHandle.setGame(game1);
        keyboardHandle.setP1(game1.getP1());
        keyboardHandle.setP2(game1.getP2());


//        if (dragonite.getDead() || rattata.getDead()) {
//
//            clip.stop();
//
//            AudioInputStream victoryStream = AudioSystem.getAudioInputStream(victorySong);
//            Clip victory = AudioSystem.getClip();
//            victory.open(victoryStream);
//
//            victory.start();
//
//        }
    }
}
