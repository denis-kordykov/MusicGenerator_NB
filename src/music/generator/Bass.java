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
            
            channels[6].noteOn(pBass.notei, 80);
                       
            channels[7].noteOn(pBass.notei+12, 20);
            
            //2-я нота
            if (pBass.inter == 4)
            {
            if (pBass.notei == 24||pBass.notei == 36){
                channels[7].noteOn(pBass.notei+24+4, 20);
                if(pBass.notei == 29||pBass.notei == 41)
                    channels[7].noteOn(pBass.notei+24+4, 20);
                     if (pBass.notei == 31||pBass.notei == 43)
                        channels[7].noteOn(pBass.notei+24+4, 20);
            channels[7].noteOff(pBass.notei+24+4);
            }
            else{
                channels[7].noteOn(pBass.notei+24+3, 20);
                channels[7].noteOff(pBass.notei+24+3);
            }
            }
            
            //3-я нота
            if (pBass.inter == 5)
            {
            if (pBass.notei == 35||pBass.notei == 47){
                channels[7].noteOn(pBass.notei+24+6, 20);
            channels[7].noteOff(pBass.notei+24+6);
            }
            else{
                channels[7].noteOn(pBass.notei+24+7, 20);
                channels[7].noteOff(pBass.notei+24+7);
            }
            }
                                    
            Thread.sleep(pBass.rytmi); // in milliseconds
                        
            channels[6].noteOff(pBass.notei);
            
            channels[7].noteOff(pBass.notei+24);                    
         
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
