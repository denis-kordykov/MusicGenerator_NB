/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
//kordyukov
/**
 *
 * @author Δενθρ
 */
public class Guitar {
 public static void PlayGuitar(){
        BassRytm interval = new BassRytm();
         GuitarRythm pGuitar = new GuitarRythm();
        try {
            Synthesizer synth6 = MidiSystem.getSynthesizer();
            synth6.open();
            MidiChannel[] channels = synth6.getChannels();
            channels[6].programChange(25);
               
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            
            for(int p = 0;p<=pGuitar.udari;p++)
            {
            pGuitar.notei = pGuitar.note[pGuitar.a +(int)(Math.random() *((pGuitar.bn-pGuitar.a)+1))];     
            channels[6].noteOn(pGuitar.notei, 60);
            
            Thread.sleep(pGuitar.rytmi); // in milliseconds
            channels[6].noteOff(pGuitar.notei);  
            
            
            }
            pGuitar.randomGuitar();
            }
                   
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
    }   
}
