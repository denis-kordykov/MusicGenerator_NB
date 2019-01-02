/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;
//kordyukov
/**
 *
 * @author Δενθρ
 */
public class BassRytm {
    int a =0;
    int a1=0;
    int b =2; 
    int bn = 13;
     int povt[] = {1,2,4};
     int povti = povt[a +(int)(Math.random() *((b-a)+1))];
     int[] rythm = {500,1000,250,2000};
     int note[] = {24,26,28,29,31,33,35,36,38,40,41,43,45,47};//
     int notei; // = note[a1 +(int)(Math.random() *((bn-7)+1))];;
     int i,inter;
     int[] interval = {3,4,5,7};
    
     DrumRythm r = new DrumRythm();
    
     int rytmi = rythm[a +(int)(Math.random() *((b-a)+1))];
     
     
     
    public void randomBass(){
      
      notei = note[a1 +(int)(Math.random() *((bn-a1)+1))];
      int noten = notei;
      int notens = note[a1 +(int)(Math.random() *((bn-a1)+1))];
      int notens1 = note[a1 +(int)(Math.random() *((bn-a1)+1))];
      povti = povt[a +(int)(Math.random() *((b-a)+1))];
      int povtn = povti;
      int povtns = a +(int)(Math.random() *((b-a)+1));
      
     
      if(povtn == povtns)
      {
         
             
          this.povti = povtns;
          if(noten==notens)
          {
              
                   this.notei =  notens;  
                   this.rytmi = rythm[0 +(int)(Math.random() *((3-0)+1))];
                   inter = interval[0 +(int)(Math.random() *((3-0)+1))];
               }
           this.rytmi = rythm[0 +(int)(Math.random() *((3-0)+1))]; 
           
               //r.randomR();
               
      }
          
    } 
      
    }
     
   

