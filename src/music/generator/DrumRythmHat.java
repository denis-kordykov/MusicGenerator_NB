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
public class DrumRythmHat {
   int[] rythm = {1000,500,250,125};
 
int a = 0; // Начальное значение диапазона - "от"
int b = 3; // Конечное значение диапазона - "до"
int i,y,z;
int rythm_b = rythm[a +(int)(Math.random() *((b-a)+1))];
public void randomH()
{
for(int y = 1;y<5; y = y++)
{    
i = rythm[a +(int)(Math.random() *((b-a)+1))];
y = rythm[a +(int)(Math.random() *((b-a)+1))];
z = rythm[a +(int)(Math.random() *((b-a)+1))];

   if(i==y&&i==z)
       this.rythm_b = i;
       
           
       }
   }    
}
