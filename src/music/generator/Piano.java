/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Δενθρ
 */
public class Piano  {
    public static void PlayPiano(){
         PianoRythm pPiano = new PianoRythm();
        try {
            Synthesizer synth5 = MidiSystem.getSynthesizer();
            synth5.open();
            MidiChannel[] channels = synth5.getChannels();
            channels[6].programChange(2);
               
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            
            for(int p = 0;p<=pPiano.udari;p++)
            {
            pPiano.notei = pPiano.note[pPiano.a +(int)(Math.random() *((pPiano.bn-pPiano.a)+1))];     
            channels[6].noteOn(pPiano.notei, 50);
            Thread.sleep(pPiano.rytmi); // in milliseconds
            channels[6].noteOff(pPiano.notei);           
            
            }
            pPiano.randomPiano();
            }
                   
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
    }
    
}
