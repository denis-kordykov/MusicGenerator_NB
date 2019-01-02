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
 * @author Денис
 */
class Bochka 
{
int note = 35;

public static void PlayBochka()
{
    DrumRythm pBochka = new DrumRythm();
    //DrumShare pShare = new pShare;
    //int a = 60; // Начальное значение диапазона - "от"
    //int b = 71; // Конечное значение диапазона - "до"  
   try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            channels[9].programChange(35);
            
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            channels[9].noteOn(35, 80);
            Thread.sleep(pBochka.rythm_b); // in milliseconds
            channels[9].noteOff(35);
            pBochka.randomR();
            
            //synth.close();
            
            }
                    
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
}

    
}
