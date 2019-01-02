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
public class DrumDop {
    
public static void PlayDop()
 {
     int a =0;
     int b = 999;
 DrumDopRythm pDop = new DrumDopRythm();
 try {
            Synthesizer synth3 = MidiSystem.getSynthesizer();
            synth3.open();
            MidiChannel[] channels = synth3.getChannels();
            channels[9].programChange(pDop.ins);
            
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
                int start = (a +(int)(Math.random())*((b-a)+1));
                int start2 = (a +(int)(Math.random())*((b-a)+1));
                int start3 = (a +(int)(Math.random())*((b-a)+1));
                if(start==start2||start==start3){
            for(int u = 0;u<=pDop.udar;u++){            
            channels[9].noteOn(pDop.ins, 70);
            Thread.sleep(pDop.rythm_b); // in milliseconds
            channels[9].noteOff(pDop.ins);pDop.randomD();}
            
            
            Thread.sleep(10000 +(int)(Math.random())*((50000-10000)+1));
                
                }
            
            //synth.close();
            
            }
                    
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
 }    
}
