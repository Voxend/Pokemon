package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

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
             dragonite.outrage(rattata);
             if (rattata.currentHP <= 0) {
                 rattata.isDead();


             }
             dragonite.setCurrentTurn(false);
             rattata.setCurrentTurn(true);
         }

         if (e.getKey() == KeyboardEvent.KEY_N) {
             dragonite.hurricane(rattata);
             if (rattata.currentHP <= 0) {
                 rattata.isDead();

             }
             dragonite.setCurrentTurn(false);
             rattata.setCurrentTurn(true);
         }

         if (e.getKey() == KeyboardEvent.KEY_B) {
             dragonite.wingAttack(rattata);
             if (rattata.currentHP <= 0) {
                 rattata.isDead();

             }
             dragonite.setCurrentTurn(false);
             rattata.setCurrentTurn(true);
         }

         if (e.getKey() == KeyboardEvent.KEY_V) {
             dragonite.tackle(rattata);
             if (rattata.currentHP <= 0) {
                 rattata.isDead();

             }
             dragonite.setCurrentTurn(false);
             rattata.setCurrentTurn(true);
         }


     }
        if (rattata.getCurrentTurn() && !rattata.getDead()) {
            if (e.getKey() == KeyboardEvent.KEY_Q) {
                rattata.fang(dragonite);
                if (dragonite.currentHP <= 0) {
                    dragonite.isDead();

                }
                rattata.setCurrentTurn(false);
                dragonite.setCurrentTurn(true);
            }

            if (e.getKey() == KeyboardEvent.KEY_W) {
                rattata.hyperFang(dragonite);
                if (dragonite.currentHP <= 0) {
                    dragonite.isDead();

                }
                rattata.setCurrentTurn(false);
                dragonite.setCurrentTurn(true);
            }

            if (e.getKey() == KeyboardEvent.KEY_E) {
                rattata.tackle(dragonite);
                if (dragonite.currentHP <= 0) {
                    dragonite.isDead();

                }
                rattata.setCurrentTurn(false);
                dragonite.setCurrentTurn(true);
            }

            if (e.getKey() == KeyboardEvent.KEY_R) {
                rattata.surf(dragonite);

                dragonite.getHpBar().grow(-250/3.5,0);
//


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
