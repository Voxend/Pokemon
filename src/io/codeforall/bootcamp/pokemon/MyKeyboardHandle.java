package io.codeforall.bootcamp.pokemon;


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
    private Picture startScreen;
    private Game game;
    private Pokemon p1;
    private Pokemon p2;


    public void init() {

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

        KeyboardEvent K1 = new KeyboardEvent();
        K1.setKey(KeyboardEvent.KEY_1);
        K1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(K1);

        KeyboardEvent K2 = new KeyboardEvent();
        K2.setKey(KeyboardEvent.KEY_2);
        K2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(K2);

        KeyboardEvent K3 = new KeyboardEvent();
        K3.setKey(KeyboardEvent.KEY_3);
        K3.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(K3);

        KeyboardEvent K4 = new KeyboardEvent();
        K4.setKey(KeyboardEvent.KEY_4);
        K4.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(K4);
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
        } else {
            //p1
            if (!game.isP1Choosed()) {
                if (e.getKey() == KeyboardEvent.KEY_1) {
                    game.setP1(new Charizard());
                    game.setP1Choosed(true);
                    game.drawCharizardFront();

                }
                if (e.getKey() == KeyboardEvent.KEY_2) {
                    game.setP1(new Dragonite());
                    game.setP1Choosed(true);
                    game.drawDraganiteFront();
                }
                if (e.getKey() == KeyboardEvent.KEY_3) {
                    game.setP1(new Gyarados());
                    game.setP1Choosed(true);
                    game.drawGyaradosFront();
                }
                if (e.getKey() == KeyboardEvent.KEY_4) {
                    game.setP1(new Eliasmon());
                    game.setP1Choosed(true);
                    game.drawEliasmonFront();
                }

            } else if(game.isP1Choosed() && !game.isP2Choosed()){
                if (e.getKey() == KeyboardEvent.KEY_1) {
                    game.setP2(new Charizard());
                    game.setP2Choosed(true);
                    game.drawCharizardBack();
                }
                if (e.getKey() == KeyboardEvent.KEY_2) {
                    game.setP2(new Dragonite());
                    game.setP2Choosed(true);
                    game.drawDraganiteBack();
                }
                if (e.getKey() == KeyboardEvent.KEY_3) {
                    game.setP2(new Gyarados());
                    game.setP2Choosed(true);
                    game.drawGyaradosBack();
                }
                if (e.getKey() == KeyboardEvent.KEY_4) {
                    game.setP2(new Eliasmon());
                    game.setP2Choosed(true);
                    game.drawEliasmonBack();
                }
            } else if (game.isP1Choosed() && game.isP2Choosed()) {

                if ((game.isP1Turn() && !game.getP1().getDead())) {
                    if (e.getKey() == KeyboardEvent.KEY_M) {


                        soundFX();
                        game.p1Attack1();
                        game.setP1Turn(false);
                        game.setP2Turn(true);
                    }

                    if (e.getKey() == KeyboardEvent.KEY_N) {
                        soundFX();
                        game.p1Attack2();
                        game.setP1Turn(false);
                        game.setP2Turn(true);
                    }

                    if (e.getKey() == KeyboardEvent.KEY_B) {
                        soundFX();
                        game.p1Attack3();
                        game.setP1Turn(false);
                        game.setP2Turn(true);
                    }

                    if (e.getKey() == KeyboardEvent.KEY_V) {
                        soundFX();
                        game.p1Attack4();
                        game.setP1Turn(false);
                        game.setP2Turn(true);
                    }


                }
                if (game.isP2Turn() && !game.getP2().getDead()) {
                    if (e.getKey() == KeyboardEvent.KEY_Q) {
                        soundFX();
                        game.p2Attack1();
                        game.setP1Turn(true);
                        game.setP2Turn(false);

                    }

                    if (e.getKey() == KeyboardEvent.KEY_W) {
                        soundFX();
                        game.p2Attack2();
                        game.setP1Turn(true);
                        game.setP2Turn(false);

                    }

                    if (e.getKey() == KeyboardEvent.KEY_E) {
                        soundFX();
                        game.p2Attack3();
                        game.setP1Turn(true);
                        game.setP2Turn(false);

                    }

                    if (e.getKey() == KeyboardEvent.KEY_R) {
                        soundFX();
                        game.p2Attack4();
                        game.setP1Turn(true);
                        game.setP2Turn(false);

                    }

                }
            }


        }

    }


    @Override
    public void keyReleased(KeyboardEvent e) {

    }


    public void setStartScreen(Picture picture) {
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

    public void setP1(Pokemon p1) {
        this.p1 = p1;
    }

    public void setP2(Pokemon p2) {
        this.p2 = p2;
    }

    private void delayMethod(int ms) {

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
