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
public class DrumRythmShare {
 int[] rythm = {2000,1000,500,250};
 
int a = 0; // Начальное значение диапазона - "от"
int b = 3; // Конечное значение диапазона - "до"
int i,y,z,q;
int rythm_b = rythm[a +(int)(Math.random() *((b-a)+1))];
public void randomR()
{
for(int y = 1;y<5; y = y++)
{    
i = rythm[a +(int)(Math.random() *((b-a)+1))];
y = rythm[a +(int)(Math.random() *((b-a)+1))];
z = rythm[a +(int)(Math.random() *((b-a)+1))];
q = rythm[a +(int)(Math.random() *((b-a)+1))];

   if(i==y&&i==z)
       this.rythm_b = i;
       
           
       }
   }   
}
