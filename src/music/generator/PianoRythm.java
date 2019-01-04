/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;

/**
 *
 * @author kordyukov
 */
public class PianoRythm {
    int a =0;
    int b =5;
    int bn = 27;
    int udar[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
     int[] rythm = {2000,1000,500,250,125,62};
     int rytmi= rythm[a +(int)(Math.random() *((b-a)+1))];
     int udari; 
     int note[] = {60,62,64,65,67,69,71,72,74,76,77,79,81,83,84,86,88,89,91,93,95,96,98,100,101,103,105,107};
     static int notei;
     //int i = a +(int)(Math.random() *((bn-a)+1)); масив для баса
     //int[]buffer = new int [i];масив для баса
    
     
     
     
    public void randomPiano(){
      
      notei = note[a +(int)(Math.random() *((bn-a)+1))];
      int noten = notei;
      int notens = a +(int)(Math.random() *((bn-a)+1));
      rytmi = rythm[a +(int)(Math.random() *((b-a)+1))];
     
               
               rytmi = rythm[a +(int)(Math.random() *((b-a)+1))];
               udari = udar[0 +(int)(Math.random() *((20-0)+1))];
     

    }
}
