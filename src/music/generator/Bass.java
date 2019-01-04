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
 * @author Денис
 */
public class Bass {
    
 public static void PlayBass()
{
    int m=0;
    BassRytm pBass = new BassRytm();
       try {
            Synthesizer synth5 = MidiSystem.getSynthesizer();
            synth5.open();
            MidiChannel[] channels = synth5.getChannels();
            channels[6].programChange(36);
            channels[7].programChange(95);
            
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            pBass.randomBass(); 
             
            for(int p = 0;p<=pBass.povti;p++)
            {
            
            channels[6].noteOn(pBass.notei+Tonalnost.t, 80);
                       
            channels[7].noteOn(pBass.notei+12+Tonalnost.t, 60);
            
            //2-я нота
            if (pBass.inter == 4)
            {
            if (pBass.notei+Tonalnost.t == 12+Tonalnost.t||pBass.notei+Tonalnost.t == 36+Tonalnost.t){
                channels[7].noteOn(pBass.notei+12+4+Tonalnost.t, 60);
                if(pBass.notei+Tonalnost.t == 29+Tonalnost.t||pBass.notei+Tonalnost.t == 41+Tonalnost.t)
                    channels[7].noteOn(pBass.notei+12+4+Tonalnost.t, 60);
                     if (pBass.notei+Tonalnost.t == 31+Tonalnost.t||pBass.notei+Tonalnost.t == 43+Tonalnost.t)
                        channels[7].noteOn(pBass.notei+12+4+Tonalnost.t, 60);
            channels[7].noteOff(pBass.notei+12+4+Tonalnost.t);
            }
            else{
                channels[7].noteOn(pBass.notei+12+3+Tonalnost.t, 60);
                channels[7].noteOff(pBass.notei+12+3+Tonalnost.t);
            }
            }
            
            //3-я нота
            if (pBass.inter == 5)
            {
            if (pBass.notei+Tonalnost.t == 35+Tonalnost.t||pBass.notei+Tonalnost.t == 47+Tonalnost.t){
                channels[7].noteOn(pBass.notei+12+6+Tonalnost.t, 60);
            channels[7].noteOff(pBass.notei+12+6+Tonalnost.t);
            }
            else{
                channels[7].noteOn(pBass.notei+12+7+Tonalnost.t, 60);
                channels[7].noteOff(pBass.notei+12+7+Tonalnost.t);
            }
            }
                                   
            Thread.sleep(pBass.rytmi); // in milliseconds
                        
            channels[6].noteOff(pBass.notei+Tonalnost.t);
            
            channels[7].noteOff(pBass.notei+12+Tonalnost.t);                    
         
             m++;
             
            if(pBass.rytmi==1000){
            if(m==16){
                if(pBass.notei+Tonalnost.t!=36+Tonalnost.t)
            pBass.notei =  36; m=0;}
            }else{
             if(m==4){
                if(pBass.notei+Tonalnost.t!=36+Tonalnost.t)                 
            pBass.notei =  36; 
                m=0;}  
             
            }
             //System.out.println(pBass.notei+Tonalnost.t+" "+Tonalnost.t);
            } 
            
            }
         
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
}
}
