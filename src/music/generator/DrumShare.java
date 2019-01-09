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
public class DrumShare {
    static int volume = 70;  
 public static void PlayShare()
 {
 DrumRythmShare pShare = new DrumRythmShare();
 try {
            Synthesizer synth1 = MidiSystem.getSynthesizer();
            synth1.open();
            MidiChannel[] channels = synth1.getChannels();
            channels[9].programChange(38);
            
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            channels[9].noteOn(38, volume);
            Thread.sleep(pShare.rythm_b); // in milliseconds
            channels[9].noteOff(38);
            pShare.randomR();
            //synth.close();
            
            }
                    
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
 }
}
