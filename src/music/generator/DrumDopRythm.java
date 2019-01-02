/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;

/**
 *
 * @author Денис
 */
public class DrumDopRythm {
    int[] rythm = {2000,1000,500,250};
    int[] instruments = {37,39,41,45,48,49,51,50};
    int[] pause = {50000,40000,30000,20000,10000,1000};
    int ins,pauseI;
    int udar;
    
 
int a = 0; // Начальное значение диапазона - "от"
int b = 3; // Конечное значение диапазона - "до"
int i,y,z;
int rythm_b = rythm[a +(int)(Math.random() *((b-a)+1))];

public void randomD()
{
    udar = 1 +(int)(Math.random() *((16-1)+1));
    
    
for(int y = 0;y<=udar;  y++)
{    
i = rythm[a +(int)(Math.random() *((b-a)+1))];
//y = rythm[a +(int)(Math.random() *((b-a)+1))];
z = rythm[a +(int)(Math.random() *((b-a)+1))];
ins = instruments[0 +(int)(Math.random() *((7-0)+1))];
pauseI=pause[0 +(int)(Math.random() *((5-0)+1))];

       rythm_b = i;
           
       }
   } 
   
          
        
}  
       

