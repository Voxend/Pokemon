package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MyKeyboardHandle implements KeyboardHandler {

 private Keyboard keyboard;
 private Dragonite dragonite;
 private Rattata rattata;


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











 }

    @Override
    public void keyPressed(KeyboardEvent e) {

     int a = dragonite.getCurrentHP();

//        Rectangle hp = new Rectangle(700 , 500 , a/1.75 , 35);
//        hp.fill();
//        hp.setColor(Color.GREEN);

     if (dragonite.getCurrentTurn() && !dragonite.getDead()) {
         if (e.getKey() == KeyboardEvent.KEY_M) {

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

             dragonite.outrage(rattata);
             rattata.getHpBar().grow(-dragonite.getOutrage() /3.5,0);
             rattata.getHpBar().translate(-dragonite.getOutrage()/3.5,0);

             if (rattata.currentHP <= 0) {
                 rattata.isDead();


             }
             dragonite.setCurrentTurn(false);
             rattata.setCurrentTurn(true);
         }

         if (e.getKey() == KeyboardEvent.KEY_N) {

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

             dragonite.hurricane(rattata);

             rattata.getHpBar().grow(-dragonite.getHurricane() /3.5,0);
             rattata.getHpBar().translate(-dragonite.getHurricane()/3.5,0);
             if (rattata.currentHP <= 0) {
                 rattata.isDead();

             }
             dragonite.setCurrentTurn(false);
             rattata.setCurrentTurn(true);
         }

         if (e.getKey() == KeyboardEvent.KEY_B) {

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

             dragonite.wingAttack(rattata);

             rattata.getHpBar().grow(-dragonite.getWingAttack() /3.5,0);
             rattata.getHpBar().translate(-dragonite.getWingAttack()/3.5,0);
             if (rattata.currentHP <= 0) {
                 rattata.isDead();

             }
             dragonite.setCurrentTurn(false);
             rattata.setCurrentTurn(true);
         }

         if (e.getKey() == KeyboardEvent.KEY_V) {

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

             dragonite.tackle(rattata);

             rattata.getHpBar().grow(-dragonite.getTackle() /3.5,0);
             rattata.getHpBar().translate(-dragonite.getTackle()/3.5,0);

             if (rattata.currentHP <= 0) {
                 rattata.isDead();

             }
             dragonite.setCurrentTurn(false);
             rattata.setCurrentTurn(true);
         }


     }
        if (rattata.getCurrentTurn() && !rattata.getDead()) {
            if (e.getKey() == KeyboardEvent.KEY_Q) {

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

                rattata.fang(dragonite);
                dragonite.getHpBar().grow(-rattata.getFang()/3.5,0);
                dragonite.getHpBar().translate(-rattata.getFang()/3.5,0);
                if (dragonite.currentHP <= 0) {
                    dragonite.isDead();

                }
                rattata.setCurrentTurn(false);
                dragonite.setCurrentTurn(true);
            }

            if (e.getKey() == KeyboardEvent.KEY_W) {

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

                rattata.hyperFang(dragonite);
                dragonite.getHpBar().grow(-rattata.getHyperFang()/3.5,0);
                dragonite.getHpBar().translate(-rattata.getHyperFang()/3.5,0);
                if (dragonite.currentHP <= 0) {
                    dragonite.isDead();

                }
                rattata.setCurrentTurn(false);
                dragonite.setCurrentTurn(true);
            }

            if (e.getKey() == KeyboardEvent.KEY_E) {

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

                rattata.tackle(dragonite);
                dragonite.getHpBar().grow(-rattata.getTackle()/3.5,0);
                dragonite.getHpBar().translate(-rattata.getTackle()/3.5,0);

                if (dragonite.currentHP <= 0) {
                    dragonite.isDead();

                }
                rattata.setCurrentTurn(false);
                dragonite.setCurrentTurn(true);
            }

            if (e.getKey() == KeyboardEvent.KEY_R) {

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

                rattata.surf(dragonite);

                dragonite.getHpBar().grow(-rattata.getSurf()/3.5,0);
                dragonite.getHpBar().translate(-rattata.getSurf()/3.5,0);



                if (dragonite.currentHP <= 0) {
                    dragonite.isDead();

                }


                rattata.setCurrentTurn(false);
                dragonite.setCurrentTurn(true);
            }

//            rattata.setCurrentTurn(false);
//            dragonite.setCurrentTurn(true);
        }
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

}
