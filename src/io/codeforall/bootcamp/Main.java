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

        File victorySong = new File("/Users/codecadet/workspace/Java/Pokemon/resources/victory.wav");
        File file = new File(("/Users/codecadet/workspace/Java/Pokemon/resources/background music.wav"));
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();
        clip.loop(5);

        Picture sprite = new Picture(150, 100, "resources/dragonite sprites.png");
        Picture fotoDoRato = new Picture(450, -20, "resources/ratoAgain.png");
        MyKeyboardHandle keyboardHandle = new MyKeyboardHandle();
        keyboardHandle.init();
        Dragonite dragonite = new Dragonite(sprite);
        Rattata rattata = new Rattata(fotoDoRato);
        keyboardHandle.setDragonite(dragonite);
        keyboardHandle.setRattata(rattata);
        Game game1= new Game( dragonite,rattata);







//        if (dragonite.isDead() = true || rattata.isDead() = true) {
//
//            clip.stop();
//
//            AudioInputStream victoryStream = AudioSystem.getAudioInputStream(victorySong);
//            Clip victory = AudioSystem.getClip();
//            clip.open(victoryStream);
//
//            clip.start();
//
//
//        }
//



    }
}
