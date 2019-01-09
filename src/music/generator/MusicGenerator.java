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
import javax.swing.*;

/**
 *
 * @author �����
 */
public class MusicGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new NewFrame("��������� ������ 2019, ������ 1.0 beta by Kordyukov Denis(Ukraine, Kherson)",10,10);
                        
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
        Piano.start();
        Guitar.start();
        
        System.out.println("��������� ������ 2019, ������ 1.0 beta by Kordyukov Denis(Ukraine, Kherson)");

        Drums.setPriority(5);
        Share.setPriority(3);
        Hat.setPriority(2);
        Dop.setPriority(1);
        Bass.setPriority(5);
        Piano.setPriority(1);
        Guitar.setPriority(1);
        
        System.out.println(Piano.getId());
        System.out.println(Bass.getId());      
       
        
         
        // TODO code application logic here
    }
    
}
