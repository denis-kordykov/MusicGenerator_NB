/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;

/**
 *
 * @author Δενθρ
 */
public class ThreadPiano implements Runnable {
   public void run()
   {
   Piano.PlayPiano();
   //DrumShare.PlayShare();
   } 
}
