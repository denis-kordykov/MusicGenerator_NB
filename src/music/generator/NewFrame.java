/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author Денис
 */
 public class NewFrame implements ActionListener {
 
    NewFrame(String text,int x,int y){
          String[] items = {
    "До(С)",
    "До#(С#)",
    "Ре(D)",
    "Ре#(D#)",
    "Ми(E)",
    "Фа(F)",
    "Фа#(F#)",
    "Соль(G)",
    "Соль#(G#)",
    "Ля(A)",
    "Ля#(A#)",
    "Cи(H,B)",
    "До минор(Сm)",
    "До минор#(Сm#)",
    "Ре минор(Dm)",
    "Ре минор#(Dm#)",
    "Ми минор(Em)",
    "Фа минор(Fm)",
    "Фа минор# (Fm#)",
    "Соль минор(Gm)",
    "Соль минор# (Gm#)",
    "Ля минор(Am)",
    "Ля минор# (Am#)",
    "Cи минор(H,B)",
};
        JComboBox comboBox = new JComboBox(items);
        
        JFrame MyFrame = new JFrame("Генератор музыки 2019, версия 1.0 beta by Kordyukov Denis(Ukraine, Kherson)");
        MyFrame.setBounds(x, y, 800, 320);
        
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyFrame.setResizable(false);
        ImageIcon icn = new ImageIcon("note.jpg");
        JLabel lbl = new JLabel("Piano:                           Guitar:                    Bass:                        Pad:");
        JLabel lbl1 = new JLabel("Drums:");
        lbl.setBounds(10, 10, 250, 250);
        lbl1.setBounds(680, 200, 50, 20);
        
        JButton btn = new JButton("Закрыть");
        
        JSlider  scrb1 = new JSlider(JSlider.VERTICAL,0,100,60);
        scrb1.setMajorTickSpacing(20);
        scrb1.setMinorTickSpacing(5);
        scrb1.setPaintTicks(true);
        scrb1.setSnapToTicks(true);
        scrb1.setPaintLabels(true);
        
        JSlider  scrb2 = new JSlider(JSlider.VERTICAL,0,100,60);
        scrb2.setMajorTickSpacing(20);
        scrb2.setMinorTickSpacing(5);
        scrb2.setPaintTicks(true);
        scrb2.setSnapToTicks(true);
        scrb2.setPaintLabels(true);
        
        JSlider  scrb3 = new JSlider(JSlider.VERTICAL,0,100,80);
        scrb3.setMajorTickSpacing(20);
        scrb3.setMinorTickSpacing(5);
        scrb3.setPaintTicks(true);
        scrb3.setSnapToTicks(true);
        scrb3.setPaintLabels(true);
        
          JSlider  scrb4 = new JSlider(JSlider.VERTICAL,0,100,60);
        scrb4.setMajorTickSpacing(20);
        scrb4.setMinorTickSpacing(5);
        scrb4.setPaintTicks(true);
        scrb4.setSnapToTicks(true);
        scrb4.setPaintLabels(true);
        
        JSlider  scrb5 = new JSlider(JSlider.VERTICAL,0,100,70);
        scrb5.setMajorTickSpacing(20);
        scrb5.setMinorTickSpacing(5);
        scrb5.setPaintTicks(true);
        scrb5.setSnapToTicks(true);
        scrb5.setPaintLabels(true);
                      
        btn.setBounds(10, 240, 180, 30);
        comboBox.setBounds(400, 10, 170, 30);
        scrb1.setBounds(200, 50, 170, 150);
        scrb2.setBounds(300, 50, 170, 150);
        scrb3.setBounds(400, 50, 170, 150);
        scrb4.setBounds(500, 50, 170, 150);
        scrb5.setBounds(600, 50, 170, 150);
        lbl.setBounds(265, 135, 400, 150);
     
        btn.addActionListener(this);
        
        MyFrame.setLayout(null);
        MyFrame.setVisible(true);
        MyFrame.add(lbl);
        MyFrame.add(lbl1);
        MyFrame.add(btn);
        MyFrame.add(comboBox);
        MyFrame.add(scrb1);
        MyFrame.add(scrb2);
        MyFrame.add(scrb3);
        MyFrame.add(scrb4);
        MyFrame.add(scrb5);
              
        MyFrame.setVisible(true);
        
      scrb1.addChangeListener(new ChangeListener(){
         public void stateChanged(ChangeEvent e)
			{
				// Обновление поля редактирования при
				// изменении значения регулятора.
				JSlider source = (JSlider) e.getSource();
				Piano.volume = source.getValue();
                                
			}
        });
      
      scrb2.addChangeListener(new ChangeListener(){
         public void stateChanged(ChangeEvent e)
			{
				// Обновление поля редактирования при
				// изменении значения регулятора.
				JSlider source = (JSlider) e.getSource();
				Guitar.volume = source.getValue();
                                
			}
        });
      
      scrb3.addChangeListener(new ChangeListener(){
         public void stateChanged(ChangeEvent e)
			{
				// Обновление поля редактирования при
				// изменении значения регулятора.
				JSlider source = (JSlider) e.getSource();
				Bass.volume_b = source.getValue();
                                
			}
        });
      
      scrb4.addChangeListener(new ChangeListener(){
         public void stateChanged(ChangeEvent e)
			{
				// Обновление поля редактирования при
				// изменении значения регулятора.
				JSlider source = (JSlider) e.getSource();
				Bass.volume_p = source.getValue();
                                
			}
        });
      
      scrb5.addChangeListener(new ChangeListener(){
         public void stateChanged(ChangeEvent e)
			{
				// Обновление поля редактирования при
				// изменении значения регулятора.
				JSlider source = (JSlider) e.getSource();
				Bochka.volume = source.getValue();
                                DrumDop.volume = source.getValue();
                                DrumHat.volume = source.getValue();
                                DrumShare.volume = source.getValue();
                                
			}
        });
          
        
        comboBox.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event) { 
                     String msg = (String)comboBox.getSelectedItem();
                     switch(msg){
                     case "До#(С#)":
                         Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+1;
                        break;
                      case "До(С)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+0;                   
                        break;
                      case "Ре(D)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+2;                   
                        break;  
                      case "Ре#(D#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+3;                   
                        break;
                       case "Ми(E)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+4;                   
                        break; 
                        case "Фа(F)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+5;                   
                        break; 
                        case "Фа#(F#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+6;                   
                        break; 
                        case "Соль(G)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+7;                   
                        break;
                        case "Соль#(G#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+8;                   
                        break;
                        case "Ля(A)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+9;                   
                        break;
                        case "Ля#(A#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+10;                   
                        break;
                        case "Cи(H,B)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+11;                   
                        break;
                        
                        
                        case "До минор(Сm)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+3;                   
                        break;
                        case "До минор#(Сm#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+4;                   
                        break;
                        case "Ре минор(Dm)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+5;                   
                        break;
                        case "Ре минор#(Dm#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+6;                   
                        break;
                        case "Ми минор(Em)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+7;                   
                        break;
                        case "Фа минор(Fm)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+8;                   
                        break;
                        case "Фа минор# (Fm#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+9;                   
                        break;
                        case "Соль минор(Gm)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+10;                   
                        break;
                        case "Соль минор# (Gm#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+11;                   
                        break;
                        case "Ля минор(Am)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+0;                   
                        break;
                        case "Ля минор# (Am#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+1;                   
                        break;
                        case "Cи минор(H,B)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+2;                   
                        break;
                        
                     }
    }    
        });
    }  
    
        public void actionPerformed(ActionEvent AEobj){
            
            System.exit(0);
           
        }
        

 
 }
 

