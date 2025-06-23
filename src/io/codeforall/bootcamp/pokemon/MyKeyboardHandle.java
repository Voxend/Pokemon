package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MyKeyboardHandle implements KeyboardHandler {

 private Keyboard keyboard;
 private Dragonite dragonite;
 private Rattata rattata;
 private Picture startScreen;
 private Game game;


 public void init(){

     keyboard = new Keyboard(this);

     //P1

         KeyboardEvent m = new KeyboardEvent();
         m.setKey(KeyboardEvent.KEY_M);
         m.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
         keyboard.addEventListener((m));


         KeyboardEvent n = new KeyboardEvent();
         n.setKey(KeyboardEvent.KEY_N);
         n.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
         keyboard.addEventListener(n);

         KeyboardEvent b = new KeyboardEvent();
         b.setKey(KeyboardEvent.KEY_B);
         b.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
         keyboard.addEventListener(b);

         KeyboardEvent v = new KeyboardEvent();
         v.setKey(KeyboardEvent.KEY_V);
         v.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
         keyboard.addEventListener(v);

     //P2

     KeyboardEvent q = new KeyboardEvent();
     q.setKey(KeyboardEvent.KEY_Q);
     q.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
     keyboard.addEventListener((q));

     KeyboardEvent w = new KeyboardEvent();
     w.setKey(KeyboardEvent.KEY_W);
     w.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
     keyboard.addEventListener(w);

     KeyboardEvent e = new KeyboardEvent();
     e.setKey(KeyboardEvent.KEY_E);
     e.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
     keyboard.addEventListener(e);

     KeyboardEvent r = new KeyboardEvent();
     r.setKey(KeyboardEvent.KEY_R);
     r.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
     keyboard.addEventListener(r);

     KeyboardEvent space = new KeyboardEvent();
     space.setKey(KeyboardEvent.KEY_SPACE);
     space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
     keyboard.addEventListener(space);

 }

    @Override



    public void keyPressed(KeyboardEvent e) {
     if (!game.isStarted()) {
         if (e.getKey() == KeyboardEvent.KEY_SPACE) {
             startScreen.delete();
             game.setStarted(true);
         }
     }else {

         if ((dragonite.getCurrentTurn() && !dragonite.getDead())) {
             if (e.getKey() == KeyboardEvent.KEY_M) {

                 soundFX();

                 dragonite.outrage(rattata);
                 rattata.getHpBar().grow(-dragonite.getOutrage() / 3.5, 0);
                 rattata.getHpBar().translate(-dragonite.getOutrage() / 3.5, 0);
                 dragoniteMove();
                 rattata.getCurrentHpText().setText("" + rattata.currentHP);
                 game.getAttackText().setText("Dragonite used Outrage!");



                 if (rattata.currentHP <= 0) {
                     rattata.isDead();
                     ratIsDead();

                 }
                 dragonite.setCurrentTurn(false);
                 rattata.setCurrentTurn(true);
             }

             if (e.getKey() == KeyboardEvent.KEY_N) {

                 soundFX();

                 dragonite.hurricane(rattata);

                 rattata.getHpBar().grow(-dragonite.getHurricane() / 3.5, 0);
                 rattata.getHpBar().translate(-dragonite.getHurricane() / 3.5, 0);
                 dragoniteMove();
                 rattata.getCurrentHpText().setText("" + rattata.currentHP);
                 game.getAttackText().setText("Dragonite used Hurricane!");


                 if (rattata.currentHP <= 0) {
                     rattata.isDead();
                     ratIsDead();

                 }

                 dragonite.setCurrentTurn(false);
                 rattata.setCurrentTurn(true);

             }

             if (e.getKey() == KeyboardEvent.KEY_B) {

                 soundFX();

                 dragonite.wingAttack(rattata);

                 rattata.getHpBar().grow(-dragonite.getWingAttack() / 3.5, 0);
                 rattata.getHpBar().translate(-dragonite.getWingAttack() / 3.5, 0);
                 dragoniteMove();
                 rattata.getCurrentHpText().setText("" + rattata.currentHP);
                 game.getAttackText().setText("Dragonite used Wing Attack!");


                 if (rattata.currentHP <= 0) {
                     rattata.isDead();
                     ratIsDead();

                 }

                 dragonite.setCurrentTurn(false);
                 rattata.setCurrentTurn(true);
             }

             if (e.getKey() == KeyboardEvent.KEY_V) {

                 soundFX();

                 dragonite.tackle(rattata);

                 rattata.getHpBar().grow(-dragonite.getTackle() / 3.5, 0);
                 rattata.getHpBar().translate(-dragonite.getTackle() / 3.5, 0);
                 dragoniteMove();
                 rattata.getCurrentHpText().setText("" + rattata.currentHP);
                 game.getAttackText().setText("Dragonite used Tackle!");


                 if (rattata.currentHP <= 0) {
                     rattata.isDead();
                     ratIsDead();

                 }

                 dragonite.setCurrentTurn(false);
                 rattata.setCurrentTurn(true);
             }




         }
         if (rattata.getCurrentTurn() && !rattata.getDead()) {
             if (e.getKey() == KeyboardEvent.KEY_Q) {

                 soundFX();

                 rattata.fang(dragonite);
                 dragonite.getHpBar().grow(-rattata.getFang() / 3.5, 0);
                 dragonite.getHpBar().translate(-rattata.getFang() / 3.5, 0);
                 rattataMove();
                 dragonite.getCurrentHpText().setText("" + dragonite.currentHP);
                 game.getAttackText().setText("Rattata used Fang!");


                 if (dragonite.currentHP <= 0) {
                     dragonite.isDead();
                     dragoniteIsDead();

                 }

                 rattata.setCurrentTurn(false);
                 dragonite.setCurrentTurn(true);

             }

             if (e.getKey() == KeyboardEvent.KEY_W) {

                 soundFX();

                 rattata.hyperFang(dragonite);
                 dragonite.getHpBar().grow(-rattata.getHyperFang() / 3.5, 0);
                 dragonite.getHpBar().translate(-rattata.getHyperFang() / 3.5, 0);
                 rattataMove();
                 dragonite.getCurrentHpText().setText("" + dragonite.currentHP);
                 game.getAttackText().setText("Rattata used Hyper Fang!");


                 if (dragonite.currentHP <= 0) {
                     dragonite.isDead();
                     dragoniteIsDead();

                 }

                 rattata.setCurrentTurn(false);
                 dragonite.setCurrentTurn(true);

             }

             if (e.getKey() == KeyboardEvent.KEY_E) {

                 soundFX();

                 rattata.tackle(dragonite);
                 dragonite.getHpBar().grow(-rattata.getTackle() / 3.5, 0);
                 dragonite.getHpBar().translate(-rattata.getTackle() / 3.5, 0);
                 rattataMove();
                 dragonite.getCurrentHpText().setText("" + dragonite.currentHP);
                 game.getAttackText().setText("Rattata used Tackle!");


                 if (dragonite.currentHP <= 0) {
                     dragonite.isDead();
                     dragoniteIsDead();

                 }

                 rattata.setCurrentTurn(false);
                 dragonite.setCurrentTurn(true);

             }

             if (e.getKey() == KeyboardEvent.KEY_R) {
                 rattataMove();
                 soundFX();

                 rattata.surf(dragonite);

                 dragonite.getHpBar().grow(-rattata.getSurf() / 3.5, 0);
                 dragonite.getHpBar().translate(-rattata.getSurf() / 3.5, 0);
                 dragonite.getCurrentHpText().setText("" + dragonite.currentHP);
                 game.getAttackText().setText("Rattata used Surf, somehow!");


                 if (dragonite.currentHP <= 0) {
                     dragonite.isDead();
                     dragoniteIsDead();

                 }

                 rattata.setCurrentTurn(false);
                 dragonite.setCurrentTurn(true);



             }


         }


     }
    }

    public void dragoniteIsDead(){
        game.getAttackText().setText("Dragonite fainted!");
        dragonite.getSprite().load("resources/dragoniteRip.png");
        dragonite.getSprite().translate(30,100);
        dragonite.getCurrentHpText().setText("000");
    }

    public void ratIsDead(){
        game.getAttackText().setText("Ratatta fainted!");
        rattata.getSprite().load("resources/ratRip.png");
        rattata.getCurrentHpText().setText("000");

    }



    @Override
    public void keyReleased(KeyboardEvent e) {

    }

    public void setRattata(Rattata rattata) {
     this.rattata = rattata;
    }

    public void setDragonite(Dragonite dragonite) {
     this.dragonite = dragonite;
    }

    public void setStartScreen(Picture picture){
        this.startScreen = picture;
    }

    private void soundFX() {

        File file = new File(("/Users/codecadet/workspace/Java/Pokemon/resources/hit.wav"));
        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            clip.open(audioStream);
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        clip.start();

    }

    public void setGame(Game game) {
        this.game = game;
    }


    public void rattataMove(){
        rattata.getSprite().translate(100,-100);
        rattata.getSprite().translate(-100,100);

    }

    public void dragoniteMove(){
        dragonite.getSprite().translate(10,-10);
        dragonite.getSprite().translate(-10,10);

    }

    private void delayMethod(int ms) {

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
