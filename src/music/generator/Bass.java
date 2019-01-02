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
            channels[7].programChange(93);
            
            for(int vremya = 0;vremya < 10;vremya = vremya++)
            {
            pBass.randomBass(); 
             
            for(int p = 0;p<=pBass.povti;p++)
            {
            
            channels[6].noteOn(pBass.notei, 80);
                       
            channels[7].noteOn(pBass.notei+12, 35);
                                    
            Thread.sleep(pBass.rytmi); // in milliseconds
                        
            channels[6].noteOff(pBass.notei);
            
            channels[7].noteOff(pBass.notei+12);                    
         
             m++;
            if(pBass.rytmi==1000){
            if(m==16){
                if(pBass.notei!=36)
            pBass.notei =  36; m=0;}
            }else{
             if(m==4){
                if(pBass.notei!=36)
            pBass.notei =  36; m=0;}   
            }
            } 
            
            }
         
       }catch (Exception e) 
       {
            e.printStackTrace();
       }
}
}
