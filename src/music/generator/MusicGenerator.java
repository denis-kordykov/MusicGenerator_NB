/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.*;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Денис
 */
public class MusicGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,a1,a2; 
        
        new NewFrame();
        ThreadP potok = new ThreadP();
        Thread Drums = new Thread(potok);

        ThreadS potokS = new ThreadS();
        Thread Share = new Thread(potokS);

        ThreadH potokH = new ThreadH();
        Thread Hat = new Thread(potokH);

        ThreadD potokD = new ThreadD();
        Thread Dop = new Thread(potokD);

        ThreadB potokB = new ThreadB();
        Thread Bass = new Thread(potokB);

        ThreadPiano potokPiano = new ThreadPiano();
        Thread Piano = new Thread(potokPiano);
        
        ThreadG potokGuitar = new ThreadG();
        Thread Guitar = new Thread(potokGuitar);

        Drums.start();
        Share.start();
        Hat.start();
        Dop.start();
        Bass.start();
      
        System.out.println("Генератор музыки 2019, версия 1.0 beta by Kordyukov Denis(Ukraine, Kherson)");

        Drums.setPriority(5);
        Share.setPriority(3);
        Hat.setPriority(2);
        Dop.setPriority(1);
        
        Bass.setPriority(5);
        Piano.setPriority(1);
        Guitar.setPriority(1);
               
        a =0 +(int)(Math.random() *((9-0)+1));
        a1 = 0 +(int)(Math.random() *((9-0)+1));
        a2 = 0 +(int)(Math.random() *((9-0)+1));
        
        if(a==a1||a==a2){
       Guitar.start();
        }else
        Piano.start(); 
        // TODO code application logic here
    }
    
}
