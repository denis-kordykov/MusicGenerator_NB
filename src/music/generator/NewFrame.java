/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

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
        MyFrame.setBounds(x, y, 500, 320);
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icn = new ImageIcon("note.jpg");
        JLabel lbl = new JLabel(text,icn,JLabel.CENTER);
        lbl.setBounds(10, 10, 225, 216);
        JButton btn = new JButton("Закрыть");
        btn.setBounds(10, 240, 180, 30);
        comboBox.setBounds(300, 10, 150, 30);
        btn.addActionListener(this);
        MyFrame.setLayout(null);
        MyFrame.setVisible(true);
        MyFrame.add(lbl);
        MyFrame.add(btn);
        MyFrame.add(comboBox);
        
        comboBox.setVisible(true);
        MyFrame.setVisible(true);
        
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
 

