/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;
//kordyukov
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Δενθρ
 */
public class DrumHat {
public static void PlayHat()
 {
 DrumRythmHat pHat = new DrumRythmHat();
 try {
            Synthesizer synth2 = MidiSystem.getSynthesizer();
            synth2.open();
            MidiChannel[] channels = synth2.getChannels();
            channels[9].programChange(42);
            
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            channels[9].noteOn(42, 70);
            Thread.sleep(pHat.rythm_b); // in milliseconds
            channels[9].noteOff(42);
            pHat.randomH();
            //synth.close();
            
            }
                    
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
 }    
}
